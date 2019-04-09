package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.taxi.TaxiDriver;

public interface TaxiDriverService {
	TaxiDriver saveOrUpdate(TaxiDriver taxiDriver);
	boolean delete(TaxiDriver taxiDriver);
	List<TaxiDriver> findAll();
}
