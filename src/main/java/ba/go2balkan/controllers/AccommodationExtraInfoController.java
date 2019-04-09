package ba.go2balkan.controllers;

import java.util.List;

import ba.go2balkan.model.cb.*;
import ba.go2balkan.services.interfaces.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class AccommodationExtraInfoController {
	
	private final AccommodationService accommodationService;
	private final CbAccommodationActivityService cbAccommodationActivityService;
	private final CbAccommodationStaffLanguageService cbAccommodationStaffLanguageService;
	private final CbCreditCardService cbCreditCardService;
	private final CbAccommodationBreakfastTypeService cbAccommodationBreakfastTypeService;
	private final CbAccommodationTypeService cbAccommodationTypeService;
	private final CbLocationService cbLocationService;
	private final CbInternetConnectionTypeService cbInternetConnectionTypeService;
	private final CbInternetConnectionLocationService cbInternetConnectionLocationService;
	private final CbCancellationPolicyService cbCancellationPolicyService;
	private final CbAccommodationFrontdeskServiceService cbAccommodationFrontdeskServiceService;
	private final CbAccommodationCommonAreaService cbAccommodationCommonAreaService;


	@Autowired
	private CbAccommodationEntertainmentService cbAccommodationEntertainmentService;
	@Autowired
	private CbAccommodationCleaningServiceService cbAccommodationCleaningServiceService;
	@Autowired
	private CbAccommodationFoodDrinkService cbAccommodationFoodDrinkService;
	@Autowired
	private CbAccommodationPoolSpaService cbAccommodationPoolSpaService;
	@Autowired
	private CbAccommodationTransportationService cbAccommodationTransportationService;
	@Autowired
	private CbAccommodationBusinessFacilityService cbAccommodationBusinessFacilityService;
	@Autowired
	private CbAccommodationShopService cbAccommodationShopService;
	@Autowired
	private CbAccommodationMiscellaneousService cbAccommodationMiscellaneousService;
	
	@Autowired
	public AccommodationExtraInfoController(AccommodationService accommodationService,
											CbAccommodationActivityService cbAccommodationActivityService,
											CbAccommodationStaffLanguageService cbAccommodationStaffLanguageService,
											CbCreditCardService cbCreditCardService,
											CbAccommodationBreakfastTypeService cbAccommodationBreakfastTypeService,
											CbAccommodationTypeService cbAccommodationTypeService,
											CbLocationService cbLocationService,
											CbInternetConnectionTypeService cbInternetConnectionTypeService,
											CbInternetConnectionLocationService cbInternetConnectionLocationService,
											CbCancellationPolicyService cbCancellationPolicyService,
											CbAccommodationFrontdeskServiceService cbAccommodationFrontdeskServiceService,
											CbAccommodationCommonAreaService cbAccommodationCommonAreaService) {
		this.accommodationService = accommodationService;
		this.cbAccommodationActivityService = cbAccommodationActivityService;
		this.cbAccommodationStaffLanguageService = cbAccommodationStaffLanguageService;
		this.cbCreditCardService = cbCreditCardService;
		this.cbAccommodationBreakfastTypeService = cbAccommodationBreakfastTypeService;
		this.cbAccommodationTypeService = cbAccommodationTypeService;
		this.cbLocationService = cbLocationService;
		this.cbInternetConnectionTypeService = cbInternetConnectionTypeService;
		this.cbInternetConnectionLocationService = cbInternetConnectionLocationService;
		this.cbCancellationPolicyService = cbCancellationPolicyService;
		this.cbAccommodationFrontdeskServiceService = cbAccommodationFrontdeskServiceService;
		this.cbAccommodationCommonAreaService = cbAccommodationCommonAreaService;
	}

	@GetMapping("/activities")
	public List<CbAccommodationActivity> getAllActivities(){
		return cbAccommodationActivityService.findAll();
	}
	
	

	@GetMapping("/accommodation/cbstafflanguages")
	public ResponseEntity<?> getCbStaffLanguages(){
		return new ResponseEntity<>(
				cbAccommodationStaffLanguageService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/cbcreditcards")
	public ResponseEntity<?> getCbCreditCards(){
		return new ResponseEntity<>(
				cbCreditCardService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/cbbreakfasts")
	public ResponseEntity<?> getCbBreakfasts(){
		return new ResponseEntity<>(
				cbAccommodationBreakfastTypeService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/types")
	public ResponseEntity<?> findAllAccommodationsTypes(){

		return new ResponseEntity<>(
				cbAccommodationTypeService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/frontdesk")
	public ResponseEntity<?> findAllAccommodationFrontDesk(){

		return new ResponseEntity<>(
				cbAccommodationFrontdeskServiceService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/commonareas")
	public ResponseEntity<?> findAllAccommodationsCommonAreas(){

		return new ResponseEntity<>(
				cbAccommodationCommonAreaService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/entertainment")
	public ResponseEntity<?> findAllAccommodationEntertainment(){

		return new ResponseEntity<>(
				cbAccommodationEntertainmentService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/cleaning")
	public ResponseEntity<?> findAllAccommodationCleaning(){

		return new ResponseEntity<>(
				cbAccommodationCleaningServiceService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/food")
	public ResponseEntity<?> findAllAccommodationFood(){

		return new ResponseEntity<>(
				cbAccommodationFoodDrinkService.findAll(),
				HttpStatus.OK);
	}
	
	
	@GetMapping("/accommodation/pool")
	public ResponseEntity<?> findAllAccommodationPoolSPA(){

		return new ResponseEntity<>(
				cbAccommodationPoolSpaService.findAll(),
				HttpStatus.OK);
	}
	
	
	@GetMapping("/accommodation/transportation")
	public ResponseEntity<?> findAllAccommodationTransportation(){

		return new ResponseEntity<>(
				cbAccommodationTransportationService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/facilities")
	public ResponseEntity<?> findAllAccommodationBusinessFacilities(){

		return new ResponseEntity<>(
				cbAccommodationBusinessFacilityService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/miscellaneous")
	public ResponseEntity<?> findAllAccommodationMiscellaneous(){

		return new ResponseEntity<>(
				cbAccommodationMiscellaneousService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/shops")
	public ResponseEntity<?> findAllAccommodationShops(){

		return new ResponseEntity<>(
				cbAccommodationShopService.findAll(),
				HttpStatus.OK);
	}
	
	@GetMapping("/accommodation/location/{city}")
	public ResponseEntity<?> autoCompleteLocation(@PathVariable String city){
		return new ResponseEntity<>(
				cbLocationService.autoCompleteLocation(city),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/cbinternet/connectiontypes")
	public ResponseEntity<?> getCbInternetConnectionTypes(){
		return new ResponseEntity<>(
				cbInternetConnectionTypeService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/cbinternet/connectionlocations")
	public ResponseEntity<?> getCbInternetConnectionLocations(){
		return new ResponseEntity<>(
				cbInternetConnectionLocationService.findAll(),
				HttpStatus.OK);
	}

	@GetMapping("/accommodation/cbcancellationpolicies")
	public ResponseEntity<?> getCbCancellationPolicies(){
		return new ResponseEntity<>(
				cbCancellationPolicyService.findAll(),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/activity/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesActivityForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesActivityByAccommodationId(optionsAmenityStr, accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/fooddrink/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesFoodDrinkForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesFoodDrinkByAccommodationId(optionsAmenityStr, accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/poolspa/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesPoolSpaForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesPoolSpaByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/transportation/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesTransportationForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesTransportationByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/frontdesk/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesFrontDeskForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesFrontDeskByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/commonareas/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesCommonAreasForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesCommonAreasByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/entertainment/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesEntertainmentForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesEntertainmentByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/cleaning/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesCleaningForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesCleaningByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/businessfacilities/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesBusinessFacilitiesForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesBusinessFacilitiesByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/shops/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesShopsForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesShopsByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	@PostMapping("/accommodation/amenities/miscellaneous/saveorupdate/{accommodationId}")
	public ResponseEntity<?> saveOrUpdateAmenitesMiscellaneousForAccommodationByAccommodationId(
			@RequestBody String optionsAmenityStr,
			@PathVariable Long accommodationId){
		
		return new ResponseEntity<>(
				accommodationService.saveOrUpdateAmenitiesMiscellaneousByAccommodationId(optionsAmenityStr,accommodationId),
				HttpStatus.OK);
	}
	
	
	
	
	
	
	
	
	
	
	
}
