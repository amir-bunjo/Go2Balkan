package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationStaffLanguage;
import ba.go2balkan.repository.CbAccommodationStaffLanguageRepository;
import ba.go2balkan.services.interfaces.CbAccommodationStaffLanguageService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationStaffLanguageServiceImpl implements CbAccommodationStaffLanguageService {

    private final CbAccommodationStaffLanguageRepository cbAccommodationStaffLanguageRepository;

    public CbAccommodationStaffLanguageServiceImpl(
            CbAccommodationStaffLanguageRepository cbAccommodationStaffLanguageRepository) {
        this.cbAccommodationStaffLanguageRepository = cbAccommodationStaffLanguageRepository;
    }

    @Override
    public CbAccommodationStaffLanguage saveOrUpdate(CbAccommodationStaffLanguage cbAccommodationStaffLanguage) {
        return cbAccommodationStaffLanguageRepository.save(cbAccommodationStaffLanguage);
    }

    @Override
    public boolean delete(CbAccommodationStaffLanguage cbAccommodationStaffLanguage) {
        try {
            cbAccommodationStaffLanguageRepository.delete(cbAccommodationStaffLanguage);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationStaffLanguage> findAll() {
        return cbAccommodationStaffLanguageRepository.findAll();
    }
}
