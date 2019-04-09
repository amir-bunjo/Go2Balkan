package ba.go2balkan.services.implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.accommodation.AccommodationRoom;
import ba.go2balkan.repository.AccommodationRoomRepository;
import ba.go2balkan.services.interfaces.AccommodationRoomService;

@Service
public class AccommodationRoomServiceImpl implements AccommodationRoomService {
	
	private final AccommodationRoomRepository accommodationRoomRepository;

	public AccommodationRoomServiceImpl(AccommodationRoomRepository accommodationRoomRepository) {
		this.accommodationRoomRepository = accommodationRoomRepository;
	}

	@Override
	public AccommodationRoom saveOrUpdate(AccommodationRoom accommodationRoom) {
		return accommodationRoomRepository.save(accommodationRoom);
	}

	@Override
	public boolean delete(AccommodationRoom accommodationRoom) {

		try {
			accommodationRoomRepository.delete(accommodationRoom);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<AccommodationRoom> findAll() {
		return accommodationRoomRepository.findAll();
	}

	@Override
	public List<AccommodationRoom> getAllRoomFromAccommodation(Integer accommodation, Integer roomType) {
		// TODO Auto-generated method stub
	
		return accommodationRoomRepository.findRoomsByAccommodation(accommodation, roomType);
	}

	@Override
	public Optional<AccommodationRoom> findRoomById(Integer roomId) {
		// TODO Auto-generated method stub
		return accommodationRoomRepository.findById(roomId);
	}


	
	
}
