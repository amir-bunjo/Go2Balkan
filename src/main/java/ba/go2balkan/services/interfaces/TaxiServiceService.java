package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.taxi.TaxiService;

public interface TaxiServiceService {
	TaxiService saveOrUpdate(TaxiService taxiService);
	boolean delete(TaxiService taxiService);
	List<TaxiService> findAll();
}
