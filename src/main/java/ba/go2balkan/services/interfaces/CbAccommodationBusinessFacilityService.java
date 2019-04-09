package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationBusinessFacility;

public interface CbAccommodationBusinessFacilityService {
    CbAccommodationBusinessFacility saveOrUpdate(CbAccommodationBusinessFacility cbAccommodationBusinessFacility);
    boolean delete(CbAccommodationBusinessFacility cbAccommodationBusinessFacility);
    List<CbAccommodationBusinessFacility> findAll();
}
