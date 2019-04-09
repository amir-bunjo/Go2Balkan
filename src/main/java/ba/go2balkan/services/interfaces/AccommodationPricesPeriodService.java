package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;


public interface AccommodationPricesPeriodService {
	AccommodationPricesPeriod saveOrUpdate(AccommodationPricesPeriod accommodationPricesPeriod);
	String delete(Integer accommodationPricesPeriodId);
	List<AccommodationPricesPeriod> findAll();
	List<AccommodationPricesPeriod> findPricePeriodeByAccommodation(Integer accommodation, Integer roomType);
}
