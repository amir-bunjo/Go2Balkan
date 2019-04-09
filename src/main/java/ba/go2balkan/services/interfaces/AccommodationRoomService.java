package ba.go2balkan.services.interfaces;

import java.util.List;
import java.util.Optional;

import ba.go2balkan.model.accommodation.AccommodationRoom;


public interface AccommodationRoomService {
	AccommodationRoom saveOrUpdate(AccommodationRoom accommodationRoom);
	boolean delete(AccommodationRoom accommodationRoom);
	List<AccommodationRoom> findAll();
	List<AccommodationRoom> getAllRoomFromAccommodation(Integer accommodation, Integer roomType);
	public Optional<AccommodationRoom>  findRoomById(Integer roomId);
}
