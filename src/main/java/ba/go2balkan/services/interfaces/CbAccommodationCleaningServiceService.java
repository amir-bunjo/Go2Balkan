package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationCleaningService;

public interface CbAccommodationCleaningServiceService {
    CbAccommodationCleaningService saveOrUpdate(CbAccommodationCleaningService cbAccommodationCleaningService);
    boolean delete(CbAccommodationCleaningService cbAccommodationCleaningService);
    List<CbAccommodationCleaningService> findAll();
}
