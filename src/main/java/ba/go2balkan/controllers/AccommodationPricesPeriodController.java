package ba.go2balkan.controllers;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;
import ba.go2balkan.services.interfaces.AccommodationPricesPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accommodation")
//@CrossOrigin(origins = "http://localhost:4200")
public class AccommodationPricesPeriodController {

    private final AccommodationPricesPeriodService accommodationPricesPeriodService;

    @Autowired
    public AccommodationPricesPeriodController(AccommodationPricesPeriodService accommodationPricesPeriodService) {
        this.accommodationPricesPeriodService = accommodationPricesPeriodService;
    }

    @PostMapping("/pricesperiod/saveorupdate")
    public ResponseEntity<?> saveOrUpdateAccommodationPricePeriod(
            @RequestBody AccommodationPricesPeriod accommodationPricesPeriod){

        return new ResponseEntity<AccommodationPricesPeriod>(
                accommodationPricesPeriodService.saveOrUpdate(accommodationPricesPeriod),
                HttpStatus.CREATED);
    }

    @DeleteMapping("/pricesperiod/{pricesPeriodId}")
    public ResponseEntity<?> deletePricesPeriod(@PathVariable Integer pricesPeriodId){
    	
    	System.out.println("PriceperiodID" );
    	System.out.println(pricesPeriodId);
        return new ResponseEntity<String>(
                accommodationPricesPeriodService.delete(pricesPeriodId),
                HttpStatus.OK);
    }
    
    @GetMapping("/pricesperiod/{accommodation}/{roomType}")
    public ResponseEntity<?> getPricePeriodeByAccommodation(@PathVariable Integer accommodation,
    		@PathVariable Integer roomType ){
        return new ResponseEntity<>(
                accommodationPricesPeriodService.findPricePeriodeByAccommodation(accommodation, roomType),
                HttpStatus.OK);
    }
}
