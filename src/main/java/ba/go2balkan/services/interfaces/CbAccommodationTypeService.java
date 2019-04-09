package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationType;

public interface CbAccommodationTypeService {
    CbAccommodationType saveOrUpdate(CbAccommodationType cbAccommodationType);
    boolean delete(CbAccommodationType cbAccommodationType);
    List<CbAccommodationType> findAll();
}
