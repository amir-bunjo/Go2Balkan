package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationStaffLanguage;

public interface CbAccommodationStaffLanguageService {
    CbAccommodationStaffLanguage saveOrUpdate(CbAccommodationStaffLanguage cbAccommodationStaffLanguage);
    boolean delete(CbAccommodationStaffLanguage cbAccommodationStaffLanguage);
    List<CbAccommodationStaffLanguage> findAll();
}
