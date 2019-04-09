package ba.go2balkan.services.implementations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.cb.CbLocation;
import ba.go2balkan.repository.CbLocationRepository;
import ba.go2balkan.services.interfaces.CbLocationService;

@Service
public class CbLocationServiceImpl implements CbLocationService {
	
	private final CbLocationRepository cbLocationRepository;

	public CbLocationServiceImpl(CbLocationRepository cbLocationRepository) {
		this.cbLocationRepository = cbLocationRepository;
	}

	@Override
	public CbLocation saveOrUpdate(CbLocation cbLocation) {
		return cbLocationRepository.save(cbLocation);
	}

	@Override
	public boolean delete(CbLocation cbLocation) {

		try {
			cbLocationRepository.delete(cbLocation);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<CbLocation> findAll() {

		return StreamSupport.stream(
				cbLocationRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
	}

	@Override
	public List<CbLocation> autoCompleteLocation(String cityName) {
		// TODO Auto-generated method stub
		return cbLocationRepository.findAllByCityIgnoreCaseContaining(cityName);
	}
}
