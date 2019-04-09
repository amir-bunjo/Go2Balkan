package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationEntertainment;

public interface CbAccommodationEntertainmentService {
    CbAccommodationEntertainment saveOrUpdate(CbAccommodationEntertainment cbAccommodationEntertainment);
    boolean delete(CbAccommodationEntertainment cbAccommodationEntertainment);
    List<CbAccommodationEntertainment> findAll();
}
