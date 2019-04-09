package ba.go2balkan.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.taxi.TaxiService;
import ba.go2balkan.repository.TaxiServiceRepository;
import ba.go2balkan.services.interfaces.TaxiServiceService;

@Service
public class TaxiServiceServiceImpl implements TaxiServiceService {

	private final TaxiServiceRepository taxiServiceRepository;

	public TaxiServiceServiceImpl(TaxiServiceRepository taxiServiceRepository) {
		this.taxiServiceRepository = taxiServiceRepository;
	}

	@Override
	public TaxiService saveOrUpdate(TaxiService taxiService) {
		return taxiServiceRepository.save(taxiService);
	}

	@Override
	public boolean delete(TaxiService taxiService) {

		try {
			taxiServiceRepository.delete(taxiService);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<TaxiService> findAll() {
		return taxiServiceRepository.findAll();
	}
	
	
}
