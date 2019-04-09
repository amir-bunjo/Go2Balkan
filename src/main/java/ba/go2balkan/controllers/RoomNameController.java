package ba.go2balkan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ba.go2balkan.services.interfaces.CbRoomTypeService;

@RestController
@RequestMapping("/api/room")
public class RoomNameController {
	@Autowired
	private CbRoomTypeService cbRoomTypeService;
	 @GetMapping("/alltypes")
	    public ResponseEntity<?> getAllRoomsType(){
	        return new ResponseEntity<>(
	        		cbRoomTypeService.findAll(),
	                HttpStatus.OK);
	    }
}
