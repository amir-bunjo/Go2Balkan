package ba.go2balkan.services.implementations;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import ba.go2balkan.dto.AccommodationSale;
import ba.go2balkan.model.accommodation.Booking;
import ba.go2balkan.repository.BookingRepository;
import ba.go2balkan.services.custom.AccommodationBookingSales;
import ba.go2balkan.services.interfaces.BookingService;

@Service
public class BookingServiceImpl implements BookingService {
	
	private final BookingRepository bookingRepository;

	public BookingServiceImpl(BookingRepository bookingRepository) {
		this.bookingRepository = bookingRepository;
	}

	@Override
	public Booking saveOrUpdate(Booking booking) {
		return bookingRepository.save(booking);
	}

	@Override
	public boolean delete(Booking booking) {

		try {
			bookingRepository.delete(booking);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<Booking> findAll() {

		return StreamSupport.stream(
				bookingRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}
	
	
	@Override
	public List<AccommodationSale> findCustomAccommodationBookingSalesDetailsByAccommodationId(Integer accommodationId) {
		List<AccommodationBookingSales> accommodationBookingSalesList = bookingRepository.findCustomAccommodationBookingSalesDetailsByAccommodationId(accommodationId);
		List<AccommodationSale> accommodationSaleList = new ArrayList<>();

		for (AccommodationBookingSales sale: accommodationBookingSalesList) {
			AccommodationSale accommodationSale = new AccommodationSale();

			accommodationSale.setClientName(sale.getReservationHolderDetails().substring(0, sale.getReservationHolderDetails().indexOf(",")));

			accommodationSale.setRoom(null);

			accommodationSale.setPrice(String.format("%.02f", sale.getGrandTotal()));


			if(sale.getPaidinAmount() < sale.getGrandTotal()) {
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(2);
				
				Float remainingAmount = sale.getGrandTotal() - sale.getPaidinAmount();
				accommodationSale.setPaidOrRemaining("Remaining: " + String.format("%.02f", remainingAmount));
			} else if(sale.getPaidinAmount() >= sale.getGrandTotal()) {
				DecimalFormat df = new DecimalFormat();
				df.setMaximumFractionDigits(2);
				
				accommodationSale.setPaidOrRemaining("Paid: " + String.format("%.02f", sale.getPaidinAmount()));
			}

			accommodationSale.setStartDate(sale.getArrivalDate());

			accommodationSale.setEndDate(sale.getDepartureDate());

			accommodationSale.setReservationDate(sale.getReservationDate().toString().substring(0, sale.getReservationDate().toString().indexOf(".")));

			accommodationSale.setGatewayId(sale.getGatewayId());
			
			accommodationSale.setBookingId(sale.getId());

			accommodationSaleList.add(accommodationSale);
		}
		return accommodationSaleList;
	}

	@Override
	public Integer findGB(Long accommodationId) {
		return bookingRepository.findBookingG2BFee(accommodationId);
	}

	
}
