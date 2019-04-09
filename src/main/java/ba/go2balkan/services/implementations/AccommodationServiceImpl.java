package ba.go2balkan.services.implementations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import ba.go2balkan.services.custom.AccommodationIdAndName;
import org.springframework.stereotype.Service;

import ba.go2balkan.model.accommodation.Accommodation;
import ba.go2balkan.repository.AccommodationRepository;
import ba.go2balkan.repository.AccountRepository;
import ba.go2balkan.services.interfaces.AccommodationService;

@Service
public class AccommodationServiceImpl implements AccommodationService {
	
	private final AccommodationRepository accommodationRepository;

	public AccommodationServiceImpl(AccommodationRepository accommodationRepository,
			AccountRepository accountRepository) {
		this.accommodationRepository = accommodationRepository;
	}

	@Override
	public Accommodation saveOrUpdate(Accommodation accommodation) {
		return accommodationRepository.save(accommodation);
	}

	@Override
	public boolean delete(Accommodation accommodation) {

		try {
			accommodationRepository.delete(accommodation);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<AccommodationIdAndName> fetchAccommodationIdsAndNamesListByAccountId(Integer accountId) {
		return accommodationRepository.fetchAccommodationIdsAndNamesListByAccountId(accountId);
	}

	@Override
	public List<Accommodation> findAll() {

		return StreamSupport.stream(
				accommodationRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public List<Accommodation> findAllByAccountId(Integer accountId) {
		return accommodationRepository.findByAccount(accountId);
	}

	@Override
	public Accommodation findByAccountId(Long accommodationId, Integer accountId) {
		
		Accommodation accommodation = accommodationRepository.findById(accommodationId).get();
		
		if(accommodation.getAccount() == accountId) {
			return accommodation;
		} else {
			// ALSO THROW CUSTOM RUNTIME EXCEPTION
			return null;
		}
	}

	@Override
	public String[] findStaffLanguagesByAccommodationId(Long accommodationId) {
		
		try {
			String dbStringResponse = accommodationRepository.findStaffLanguagesByAccommodationId(accommodationId);
			
			if(dbStringResponse.contains(",")) {
				return dbStringResponse.split(",");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}

	@Override
	public boolean saveOrUpdateStaffLanguagesByAccommodationId(String[] staffLanguagesStrArr, Long accommodationId) {
		
		String staffLanguagesStr = "";
		
		for(int i = 0; i < staffLanguagesStrArr.length; i++){
			if(i == staffLanguagesStrArr.length - 1 || staffLanguagesStrArr[1] == "") {
				staffLanguagesStr += staffLanguagesStrArr[i];
			} else {
				staffLanguagesStr += staffLanguagesStrArr[i] + ",";
			}
		}
		
		try {
			accommodationRepository.saveOrUpdateStaffLanguagesByAccommodationId(staffLanguagesStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateInternetOptionsByAccommodationId(String internetOptionsStr, Long accommodationId) {
		try {
			accommodationRepository.saveOrUpdateInternetOptionsByAccommodationId(internetOptionsStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public String[] findCreditCardsByAccommodationId(Long accommodationId) {
		
		try {
			String dbStringResponse = accommodationRepository.findCreditCardsByAccommodationId(accommodationId);
			
			if(dbStringResponse.contains(",")) {
				return dbStringResponse.split(",");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}
	
	@Override
	public String[] findBreakfastsByAccommodationId(Long accommodationId) {
		
		try {
			String dbStringResponse = accommodationRepository.findBreakfastsByAccommodationId(accommodationId);
			
			if(dbStringResponse.contains(",")) {
				return dbStringResponse.split(",");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}

	@Override
	public String[] findInternetOptionsByAccommodationId(Long accommodationId) {

		try {
			String dbStringResponse = accommodationRepository.findInternetOptionsByAccommodationId(accommodationId);
			
			if(dbStringResponse.contains(";")) {
				return dbStringResponse.split(";");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}

	@Override
	public String[] findParkingOptionsByAccommodationId(Long accommodationId) {

		try {
			String dbStringResponse = accommodationRepository.findParkingOptionsByAccommodationId(accommodationId);

			if(dbStringResponse.contains(";")) {
				return dbStringResponse.split(";");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}

	@Override
	public boolean saveOrUpdateParkingOptionsByAccommodationId(String parkingOptionsStr, Long accommodationId) {

		try {
			accommodationRepository.saveOrUpdateParkingOptionsByAccommodationId(parkingOptionsStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdatePetsPolicyByAccommodationId(String petsPolicyStr, Long accommodationId) {

		try {
			accommodationRepository.saveOrUpdatePetsPolicyByAccommodationId(petsPolicyStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	

	@Override
	public String[] findPetsPolicyByAccommodationId(Long accommodationId) {

		try {
			String dbStringResponse = accommodationRepository.findPetsPolicyByAccommodationId(accommodationId);

			if(dbStringResponse.contains(";")){
				return dbStringResponse.split(";");
			} else {
				String[] dbStringResponseArr = {dbStringResponse};
				return dbStringResponseArr;
			}
		} catch (Exception e) {
			String[] dbStringResponseArr = {""};
			return dbStringResponseArr;
		}
	}

	@Override
	public boolean saveOrUpdateBreakfastsByAccommodationId(String[] breakfastsStrArr, Long accommodationId) {
		
		String breakfastsStr = "";
		
		for(int i = 0; i < breakfastsStrArr.length; i++){
			if(i == breakfastsStrArr.length - 1 || breakfastsStrArr[1] == "") {
				breakfastsStr += breakfastsStrArr[i];
			} else {
				breakfastsStr += breakfastsStrArr[i] + ",";
			}
		}
		
		try {
			accommodationRepository.saveOrUpdateBreakfastsByAccommodationId(breakfastsStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateCreditCardsByAccommodationId(String[] creditCardsStrArr, Long accommodationId) {
		
		String creditCardsStr = "";
		
		for(int i = 0; i < creditCardsStrArr.length; i++){
			if(i == creditCardsStrArr.length - 1 || creditCardsStrArr[1] == "") {
				creditCardsStr += creditCardsStrArr[i];
			} else {
				creditCardsStr += creditCardsStrArr[i] + ",";
			}
		}
		
		try {
			accommodationRepository.saveOrUpdateCreditCardsByAccommodationId(creditCardsStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesActivityByAccommodationId(String amenitiesActivityStr, Long accommodationId) {
		
		try {
			System.out.println("trebala bi se pozvat funkcja za spremanje");
			accommodationRepository.saveOrUpdateAmenitesActivityByAccommodationId(amenitiesActivityStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesFoodDrinkByAccommodationId(String amenitiesFoodDrinkStr, Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesFoodDrinkByAccommodationId(amenitiesFoodDrinkStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	@Override
	public boolean saveOrUpdateAmenitiesPoolSpaByAccommodationId(String amenitiesPoolSpaStr, Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesPoolSpaByAccommodationId(amenitiesPoolSpaStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesTransportationByAccommodationId(String amenitiesTransportationStr, Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesTransportationByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		
	}

	@Override
	public boolean saveOrUpdateAmenitiesFrontDeskByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesFrontDeskByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesCommonAreasByAccommodationId(String amenitiesTransportationStr, Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesCommonAreasByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesEntertainmentByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesEntertainmentByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesCleaningByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesCleaningByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesBusinessFacilitiesByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesBusinessFacilitiesByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesShopsByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesShopsByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	@Override
	public boolean saveOrUpdateAmenitiesMiscellaneousByAccommodationId(String amenitiesTransportationStr,Long accommodationId) {
		
		try {
			accommodationRepository.saveOrUpdateAmenitesMiscellaneousByAccommodationId(amenitiesTransportationStr, accommodationId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	
}
