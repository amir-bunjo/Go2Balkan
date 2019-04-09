package ba.go2balkan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ba.go2balkan.model.accommodation.Accommodation;
import ba.go2balkan.model.accommodation.Account;
import ba.go2balkan.services.interfaces.AccommodationService;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class AccommodationController extends MainController{

	private final AccommodationService accommodationService;

	@Autowired
	public AccommodationController(AccommodationService accommodationService) {
		this.accommodationService = accommodationService;
	}

	@GetMapping("/accommodation")
    public ResponseEntity<?> findAllAccommodationsByAccountId(){
    	Account account = getCurrentLoggedUser();
    	
        return new ResponseEntity<>(
                accommodationService.findAllByAccountId(account.getId()),
                HttpStatus.OK);
    }
	
	@GetMapping("/accommodation/{accommodationId}")
	public ResponseEntity<?> findAccommodationByAccommodationId(@PathVariable Long accommodationId){
		Accommodation accommodation = accommodationService.findByAccountId(accommodationId, getCurrentLoggedUser().getId());
		if(accommodation == null) {
			// Miroslav: THIS WILL RETURN NULL TO FRONTEND THEN WE FORM A MESSAGE
			return new ResponseEntity<>(accommodation, HttpStatus.INTERNAL_SERVER_ERROR);
		} else {
			return new ResponseEntity<>(accommodation, HttpStatus.OK);
		}
	}

	@PostMapping("/accommodation/propertyinfos/saveorupdate")
	public ResponseEntity<?> saveOrUpdatePropertyInfosForAccommodationByAccommodationId(
			@RequestBody Accommodation accommodation){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdate(accommodation),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/stafflanguages/{accommodationId}")
	public ResponseEntity<?> findStaffLanguagesByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.findStaffLanguagesByAccommodationId(accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/stafflanguages/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateStaffLanguagesForAccommodationByAccommodationId(@RequestBody String[] staffLanguagesStrArr, @PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateStaffLanguagesByAccommodationId(staffLanguagesStrArr, accommodationId), 
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/creditcards/{accommodationId}")
	public ResponseEntity<?> findCreditCardsByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.findCreditCardsByAccommodationId(accommodationId), 
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/creditcards/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateCreditCardsForAccommodationByAccommodationId(@RequestBody String[] creditCardsStrArr, @PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateCreditCardsByAccommodationId(creditCardsStrArr, accommodationId), 
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/breakfasts/{accommodationId}")
	public ResponseEntity<?> findBreakfastsByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.findBreakfastsByAccommodationId(accommodationId), 
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/breakfasts/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateBreakfastsForAccommodationByAccommodationId(@RequestBody String[] breakfastsStrArr, @PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateBreakfastsByAccommodationId(breakfastsStrArr, accommodationId), 
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/internetoptions/{accommodationId}")
	public ResponseEntity<?> findInternetOptionsByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
		        accommodationService.findInternetOptionsByAccommodationId(accommodationId),
                HttpStatus.OK);
	}

	@PostMapping("/accommodation/internetoptions/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateInternetOptionsForAccommodationByAccommodationId(
			@RequestBody String internetOptionsStr,
			@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateInternetOptionsByAccommodationId(internetOptionsStr, accommodationId),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/parkingoptions/{accommodationId}")
	public ResponseEntity<?> findParkingOptionsByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.findParkingOptionsByAccommodationId(accommodationId),
				HttpStatus.OK);
	}

	@PostMapping("/accommodation/parkingoptions/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateParkingOptionsForAccommodationByAccommodationId(
			@RequestBody String parkingOptionsStr,
			@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateParkingOptionsByAccommodationId(parkingOptionsStr, accommodationId),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/petspolicy/{accommodationId}")
	public ResponseEntity<?> findPetsPolicyByAccommodationId(@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.findPetsPolicyByAccommodationId(accommodationId),
				HttpStatus.OK);
	}

	@PostMapping("/accommodation/petspolicy/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdatePetsPolicyForAccommodationByAccommodationId(
			@RequestBody String petsPolicyStr,
			@PathVariable Long accommodationId){
		return new ResponseEntity<>(
				accommodationService.saveOrUpdatePetsPolicyByAccommodationId(petsPolicyStr, accommodationId),
				HttpStatus.OK);
	}

	@GetMapping("accommodation/idsandnameslist")
	public ResponseEntity<?> fetchAccommodationIdsAndNamesListByAccountId(){
		return new ResponseEntity<>(
				accommodationService.fetchAccommodationIdsAndNamesListByAccountId(getCurrentLoggedUser().getId()),
				HttpStatus.OK);
	}
	
	
	
	
    @PostMapping("/accommodation/saveorupdate")
    public ResponseEntity<?> saveOrUpdateAccommodation(@RequestBody Accommodation accommodation){
    	Account account = getCurrentLoggedUser();
    	accommodation.setAccount(account.getId());
    	accommodation.setCustomId("customId");
    	//accommodation.setId((long) 35);
    	//accommodation.setAccount(35);
    	
    	System.out.println("Accommodation obj: " + accommodation.getAddress());  
    	//System.out.println("acccommodation");
        return new ResponseEntity<Accommodation>(
                accommodationService.saveOrUpdate(accommodation),
                HttpStatus.CREATED);
    }
}
