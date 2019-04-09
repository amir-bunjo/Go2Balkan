package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbLocation;

public interface CbLocationService {
	CbLocation saveOrUpdate(CbLocation cbLocation);
	boolean delete(CbLocation cbLocation);
	List<CbLocation> findAll();
	List<CbLocation> autoCompleteLocation(String cityName);
}
