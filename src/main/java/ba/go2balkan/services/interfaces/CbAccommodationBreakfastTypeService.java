package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationBreakfastType;

public interface CbAccommodationBreakfastTypeService {
    CbAccommodationBreakfastType saveOrUpdate(CbAccommodationBreakfastType cbAccommodationBreakfastType);
    boolean delete(CbAccommodationBreakfastType cbAccommodationBreakfastType);
    List<CbAccommodationBreakfastType> findAll();
}
