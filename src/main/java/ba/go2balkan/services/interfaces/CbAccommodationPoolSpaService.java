package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationPoolSpa;

public interface CbAccommodationPoolSpaService {
    CbAccommodationPoolSpa saveOrUpdate(CbAccommodationPoolSpa cbAccommodationPoolSpa);
    boolean delete(CbAccommodationPoolSpa cbAccommodationPoolSpa);
    List<CbAccommodationPoolSpa> findAll();
}
