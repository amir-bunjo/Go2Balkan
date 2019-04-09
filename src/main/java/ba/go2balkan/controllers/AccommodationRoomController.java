package ba.go2balkan.controllers;

import ba.go2balkan.model.accommodation.AccommodationRoom;
import ba.go2balkan.services.interfaces.AccommodationRoomService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/accommodation")
//@CrossOrigin(origins = "http://localhost:4200")
public class AccommodationRoomController {

    private final AccommodationRoomService accommodationRoomService;
    

    @Autowired
    public AccommodationRoomController(AccommodationRoomService accommodationRoomService) {
        this.accommodationRoomService = accommodationRoomService;
    }

    @PostMapping("/room/saveorupdate")
    public ResponseEntity<?> saveOrUpdateAccommodationRoom(@RequestBody AccommodationRoom accommodationRoom){
        return new ResponseEntity<AccommodationRoom>(
                accommodationRoomService.saveOrUpdate(accommodationRoom),
                HttpStatus.CREATED);
    }
    
    @GetMapping("/room/")
    public ResponseEntity<?> getAllRooms(){
        return new ResponseEntity<>(
                accommodationRoomService.findAll(),
                HttpStatus.OK);
    }
    
    @GetMapping("/room/{accommodation}/{roomType}")
    public ResponseEntity<?> getPricePeriodeByAccommodation(@PathVariable Integer accommodation,
    		@PathVariable Integer roomType ){
        return new ResponseEntity<>(
        		accommodationRoomService.getAllRoomFromAccommodation(accommodation, roomType),
                HttpStatus.OK);
    }
    
    @GetMapping("/room/{id}")
    public ResponseEntity<?> getPricePeriodeByAccommodation(@PathVariable Integer id ){
        return new ResponseEntity<>(
        		accommodationRoomService.findRoomById(id),
                HttpStatus.OK);
    }
    
    
    
    
}
