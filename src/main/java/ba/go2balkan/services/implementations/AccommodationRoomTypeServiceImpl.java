package ba.go2balkan.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.accommodation.AccommodationRoomType;
import ba.go2balkan.repository.AccommodationRoomTypeRepository;
import ba.go2balkan.services.interfaces.AccommodationRoomTypeService;

@Service
public class AccommodationRoomTypeServiceImpl implements AccommodationRoomTypeService{
	
	private final AccommodationRoomTypeRepository accommodationRoomTypeRepository;

	public AccommodationRoomTypeServiceImpl(AccommodationRoomTypeRepository accommodationRoomTypeRepository) {
		this.accommodationRoomTypeRepository = accommodationRoomTypeRepository;
	}

	@Override
	public AccommodationRoomType saveOrUpdate(AccommodationRoomType accommodationRoomType) {
		return accommodationRoomTypeRepository.save(accommodationRoomType);
	}

	@Override
	public boolean delete(AccommodationRoomType accommodationRoomType) {

		try {
			accommodationRoomTypeRepository.delete(accommodationRoomType);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<AccommodationRoomType> findAll() {
		return accommodationRoomTypeRepository.findAll();
	}

	@Override
	public List<AccommodationRoomType> findRoomTypeByAccommodation(Integer accommodationId) {
		// TODO Auto-generated method stub
		return accommodationRoomTypeRepository.findByAccommodation(accommodationId);
	}

	@Override
	public boolean saveOrUpdateRoomPictureById(String picturString, Integer roomId) {
		try {
			accommodationRoomTypeRepository.saveOrUpdateRoomPicture(picturString, roomId);
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	
}
