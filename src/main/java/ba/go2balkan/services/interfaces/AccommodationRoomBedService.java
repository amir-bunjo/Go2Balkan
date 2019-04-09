package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.AccommodationRoomBed;

public interface AccommodationRoomBedService {
	AccommodationRoomBed saveOrUpdate(AccommodationRoomBed accommodationRoomBed);
	boolean delete(AccommodationRoomBed accommodationRoomBed);
	List<AccommodationRoomBed> findAll();
}
