package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationFrontdeskService;

public interface CbAccommodationFrontdeskServiceService {
    CbAccommodationFrontdeskService saveOrUpdate(CbAccommodationFrontdeskService cbAccommodationFrontdeskService);
    boolean delete(CbAccommodationFrontdeskService cbAccommodationFrontdeskService);
    List<CbAccommodationFrontdeskService> findAll();
}
