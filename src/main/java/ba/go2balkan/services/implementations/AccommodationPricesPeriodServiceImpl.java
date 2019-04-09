package ba.go2balkan.services.implementations;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;
import ba.go2balkan.repository.AccommodationPricesPeriodRepository;
import ba.go2balkan.services.interfaces.AccommodationPricesPeriodService;

@Service
public class AccommodationPricesPeriodServiceImpl implements AccommodationPricesPeriodService {
	
	private final AccommodationPricesPeriodRepository accommodationPricesPeriodRepository;

	public AccommodationPricesPeriodServiceImpl(AccommodationPricesPeriodRepository accommodationPricesPeriodRepository) {
		this.accommodationPricesPeriodRepository = accommodationPricesPeriodRepository;
	}

	@Override
	public AccommodationPricesPeriod saveOrUpdate(AccommodationPricesPeriod accommodationPricesPeriod) {
		return accommodationPricesPeriodRepository.save(accommodationPricesPeriod);
	}

	@Override
	public String delete(Integer accommodationPricesPeriodId) {

		AccommodationPricesPeriod accommodationPricesPeriod = accommodationPricesPeriodRepository.findById(
				accommodationPricesPeriodId).get();

		if(accommodationPricesPeriod != null){
			if(new Date().before(accommodationPricesPeriod.getPriceEndDate())){
				return "Cannot remove before Accommodation Prices Period's End-Date";
			} else {
				try {
					accommodationPricesPeriodRepository.delete(accommodationPricesPeriod);
					return "Successfully Removed Accommodation Prices Period";
				} catch (Exception e) {
					return "Some Repository Issue Occured";
				}
			}
		} else {
			return "Accommodation Prices Period by Id: " + accommodationPricesPeriodId + " doesn't exists.";
		}
	}

	@Override
	public List<AccommodationPricesPeriod> findAll() {
		return accommodationPricesPeriodRepository.findAll();
	}

	@Override
	public List<AccommodationPricesPeriod> findPricePeriodeByAccommodation(Integer accommodation, Integer roomType) {
		// TODO Auto-generated method stub
		return accommodationPricesPeriodRepository.findPricePeriodByAccommodation(accommodation, roomType);
	}
}
