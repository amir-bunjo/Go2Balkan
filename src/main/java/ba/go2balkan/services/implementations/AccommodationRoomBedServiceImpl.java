package ba.go2balkan.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.accommodation.AccommodationRoomBed;
import ba.go2balkan.repository.AccommodationRoomBedRepository;
import ba.go2balkan.services.interfaces.AccommodationRoomBedService;

@Service
public class AccommodationRoomBedServiceImpl implements AccommodationRoomBedService {
	
	private final AccommodationRoomBedRepository accommodationRoomBedRepository;

	public AccommodationRoomBedServiceImpl(AccommodationRoomBedRepository accommodationRoomBedRepository) {
		this.accommodationRoomBedRepository = accommodationRoomBedRepository;
	}

	@Override
	public AccommodationRoomBed saveOrUpdate(AccommodationRoomBed accommodationRoomBed) {
		return accommodationRoomBedRepository.save(accommodationRoomBed);
	}

	@Override
	public boolean delete(AccommodationRoomBed accommodationRoomBed) {

		try {
			accommodationRoomBedRepository.delete(accommodationRoomBed);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<AccommodationRoomBed> findAll() {
		return accommodationRoomBedRepository.findAll();
	}
}
