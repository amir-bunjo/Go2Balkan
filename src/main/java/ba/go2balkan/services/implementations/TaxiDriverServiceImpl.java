package ba.go2balkan.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.taxi.TaxiDriver;
import ba.go2balkan.repository.TaxiDriverRepository;
import ba.go2balkan.services.interfaces.TaxiDriverService;

@Service
public class TaxiDriverServiceImpl implements TaxiDriverService {
	
	private final TaxiDriverRepository taxiDriverRepository;

	public TaxiDriverServiceImpl(TaxiDriverRepository taxiDriverRepository) {
		this.taxiDriverRepository = taxiDriverRepository;
	}

	@Override
	public TaxiDriver saveOrUpdate(TaxiDriver taxiDriver) {
		return taxiDriverRepository.save(taxiDriver);
	}

	@Override
	public boolean delete(TaxiDriver taxiDriver) {

		try {
			taxiDriverRepository.delete(taxiDriver);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<TaxiDriver> findAll() {
		return taxiDriverRepository.findAll();
	}
	
	
}
