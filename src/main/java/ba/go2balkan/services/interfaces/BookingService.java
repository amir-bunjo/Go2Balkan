package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.dto.AccommodationSale;
import ba.go2balkan.model.accommodation.Booking;

public interface BookingService {
	Booking saveOrUpdate(Booking booking);
	boolean delete(Booking booking);
	List<Booking> findAll();
	List<AccommodationSale> findCustomAccommodationBookingSalesDetailsByAccommodationId(Integer accommodationId);
	Integer findGB(Long accommodationId);
}
