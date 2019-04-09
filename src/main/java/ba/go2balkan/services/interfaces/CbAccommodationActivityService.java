package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationActivity;

public interface CbAccommodationActivityService {
    CbAccommodationActivity saveOrUpdate(CbAccommodationActivity cbAccommodationActivity);
    boolean delete(CbAccommodationActivity cbAccommodationActivity);
    List<CbAccommodationActivity> findAll();
}
