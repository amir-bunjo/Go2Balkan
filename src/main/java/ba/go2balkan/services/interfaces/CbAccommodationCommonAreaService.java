package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationCommonArea;

public interface CbAccommodationCommonAreaService {
    CbAccommodationCommonArea saveOrUpdate(CbAccommodationCommonArea cbAccommodationCommonArea);
    boolean delete(CbAccommodationCommonArea cbAccommodationCommonArea);
    List<CbAccommodationCommonArea> findAll();
}
