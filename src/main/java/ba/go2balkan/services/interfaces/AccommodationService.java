package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.Accommodation;
import ba.go2balkan.services.custom.AccommodationIdAndName;

public interface AccommodationService {
	Accommodation saveOrUpdate(Accommodation accommodation);
	Accommodation findByAccountId(Long accommodationId, Integer accountId);
	String[] findStaffLanguagesByAccommodationId(Long accommodationId);
	String[] findCreditCardsByAccommodationId(Long accommodationId);
	String[] findBreakfastsByAccommodationId(Long accommodationId);
	String[] findInternetOptionsByAccommodationId(Long accommodationId);
	String[] findParkingOptionsByAccommodationId(Long accommodationId);
	String[] findPetsPolicyByAccommodationId(Long accommodationId);
	boolean saveOrUpdateCreditCardsByAccommodationId(String[] creditCardsStrArr, Long accommodationId);
	boolean saveOrUpdateBreakfastsByAccommodationId(String[] creditCardsStrArr, Long accommodationId);
	boolean saveOrUpdateStaffLanguagesByAccommodationId(String[] staffLanguagesStrArr, Long accommodationId);
	boolean saveOrUpdateInternetOptionsByAccommodationId(String internetOptionsStr, Long accommodationId);
	boolean saveOrUpdateParkingOptionsByAccommodationId(String parkingOptionsStr, Long accommodationId);
	boolean saveOrUpdatePetsPolicyByAccommodationId(String petsPolicyStr, Long accommodationId);
	boolean saveOrUpdateAmenitiesActivityByAccommodationId(String amenitiesActivityStr, Long accommodationId);
	boolean saveOrUpdateAmenitiesFoodDrinkByAccommodationId(String amenitiesFoodDrinkStr, Long accommodationId);
	boolean saveOrUpdateAmenitiesPoolSpaByAccommodationId(String amenitiesPoolSpaStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesTransportationByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesFrontDeskByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesCommonAreasByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesEntertainmentByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesCleaningByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesBusinessFacilitiesByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesShopsByAccommodationId(String amenitiesTransportationStr, Long accommodationId);
	boolean  saveOrUpdateAmenitiesMiscellaneousByAccommodationId(String amenitiesTransportationStr, Long accommodationId);




	boolean delete(Accommodation accommodation);
	List<AccommodationIdAndName> fetchAccommodationIdsAndNamesListByAccountId(Integer accountId);
	List<Accommodation> findAll();
	List<Accommodation> findAllByAccountId(Integer accountId);
}
