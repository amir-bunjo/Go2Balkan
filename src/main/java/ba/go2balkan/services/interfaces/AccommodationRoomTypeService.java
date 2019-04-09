package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.AccommodationRoomType;

public interface AccommodationRoomTypeService {
	AccommodationRoomType saveOrUpdate(AccommodationRoomType accommodationRoomType);
	boolean delete(AccommodationRoomType accommodationRoomType);
	List<AccommodationRoomType> findAll();
	List<AccommodationRoomType> findRoomTypeByAccommodation (Integer accommodationId);
	boolean saveOrUpdateRoomPictureById(String picturString, Integer roomId);
}
