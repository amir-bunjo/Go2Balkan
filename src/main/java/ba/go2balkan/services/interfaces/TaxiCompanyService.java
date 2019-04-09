package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.taxi.TaxiCompany;

public interface TaxiCompanyService {
	TaxiCompany saveOrUpdate(TaxiCompany taxiCompany);
	boolean delete(TaxiCompany taxiCompany);
	List<TaxiCompany> findAll();
}
