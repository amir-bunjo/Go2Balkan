package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationMiscellaneous;

public interface CbAccommodationMiscellaneousService {
    CbAccommodationMiscellaneous saveOrUpdate(CbAccommodationMiscellaneous cbAccommodationMiscellaneous);
    boolean delete(CbAccommodationMiscellaneous cbAccommodationMiscellaneous);
    List<CbAccommodationMiscellaneous> findAll();
}
