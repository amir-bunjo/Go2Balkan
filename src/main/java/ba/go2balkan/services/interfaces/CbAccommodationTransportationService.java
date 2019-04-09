package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationTransportation;

public interface CbAccommodationTransportationService {
    CbAccommodationTransportation saveOrUpdate(CbAccommodationTransportation cbAccommodationTransportation);
    boolean delete(CbAccommodationTransportation cbAccommodationTransportation);
    List<CbAccommodationTransportation> findAll();
}
