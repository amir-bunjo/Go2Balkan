package ba.go2balkan.controllers;

import ba.go2balkan.model.accommodation.Booking;
import ba.go2balkan.services.interfaces.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class BookingController {

    private final BookingService bookingService;

    @Autowired
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/booking/saveorupdate")
    public ResponseEntity<?> saveOrUpdateBooking(@RequestBody Booking booking){

        return new ResponseEntity<Booking>(
                bookingService.saveOrUpdate(booking),
                HttpStatus.CREATED);
    }

    @GetMapping("/booking/{accommodationId}")
    public ResponseEntity<?> findBookingsByAccommodationId(@PathVariable Integer accommodationId){
        return new ResponseEntity<>(
                bookingService.findCustomAccommodationBookingSalesDetailsByAccommodationId(accommodationId),
                HttpStatus.OK);
    }
    
    @GetMapping("/booking/g/{accommodationId}")
    public ResponseEntity<?> findBookingsG2BFeeByAccommodationId(@PathVariable Long accommodationId){
        System.out.println("Booking should be getted");
    	return new ResponseEntity<>(
                bookingService.findAll(),
                HttpStatus.OK);
    }
    
    
}
