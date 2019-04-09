package ba.go2balkan.services.implementations;

import java.util.List;

import org.springframework.stereotype.Service;

import ba.go2balkan.model.taxi.TaxiCompany;
import ba.go2balkan.repository.TaxiCompanyRepository;
import ba.go2balkan.services.interfaces.TaxiCompanyService;

@Service
public class TaxiCompanyServiceImpl implements TaxiCompanyService {
	
	private final TaxiCompanyRepository taxiCompanyRepository;

	public TaxiCompanyServiceImpl(TaxiCompanyRepository taxiCompanyRepository) {
		this.taxiCompanyRepository = taxiCompanyRepository;
	}

	@Override
	public TaxiCompany saveOrUpdate(TaxiCompany taxiCompany) {
		return taxiCompanyRepository.save(taxiCompany);
	}

	@Override
	public boolean delete(TaxiCompany taxiCompany) {

		try {
			taxiCompanyRepository.delete(taxiCompany);
			return true;
		} catch (Exception e){
			return false;
		}
	}

	@Override
	public List<TaxiCompany> findAll() {
		return taxiCompanyRepository.findAll();
	}
}
