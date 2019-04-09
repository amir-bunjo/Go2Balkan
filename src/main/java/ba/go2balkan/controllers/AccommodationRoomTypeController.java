package ba.go2balkan.controllers;

import ba.go2balkan.model.accommodation.AccommodationRoomType;
import ba.go2balkan.services.interfaces.AccommodationRoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/accommodation")
//@CrossOrigin(origins = "http://localhost:4200")
public class AccommodationRoomTypeController {

    private final AccommodationRoomTypeService accommodationRoomTypeService;

    @Autowired
    public AccommodationRoomTypeController(AccommodationRoomTypeService accommodationRoomTypeService) {
        this.accommodationRoomTypeService = accommodationRoomTypeService;
    }

    @PostMapping("/roomtype/saveorupdate")
    public ResponseEntity<?> saveOrUpdateAccommodationRoomType(
            @RequestBody AccommodationRoomType accommodationRoomType){

    	
    	System.out.println("roomtype should be saved");
        return new ResponseEntity<AccommodationRoomType>(
                accommodationRoomTypeService.saveOrUpdate(accommodationRoomType),
                HttpStatus.CREATED);
    }
    
    @GetMapping("/roomtype/{accommodationId}")
    public ResponseEntity<?> getRoomTypeByAccommodation(@PathVariable Integer accommodationId){

        return new ResponseEntity<>(
                accommodationRoomTypeService.findRoomTypeByAccommodation(accommodationId),
                HttpStatus.OK);
    }
}
