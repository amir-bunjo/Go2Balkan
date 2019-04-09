package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationCleaningService;
import ba.go2balkan.repository.CbAccommodationCleaningServiceRepository;
import ba.go2balkan.services.interfaces.CbAccommodationCleaningServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationCleaningServiceServiceImpl implements CbAccommodationCleaningServiceService {

    private final CbAccommodationCleaningServiceRepository cbAccommodationCleaningServiceRepository;

    public CbAccommodationCleaningServiceServiceImpl(
            CbAccommodationCleaningServiceRepository cbAccommodationCleaningServiceRepository) {
        this.cbAccommodationCleaningServiceRepository = cbAccommodationCleaningServiceRepository;
    }

    @Override
    public CbAccommodationCleaningService saveOrUpdate(CbAccommodationCleaningService cbAccommodationCleaningService) {
        return cbAccommodationCleaningServiceRepository.save(cbAccommodationCleaningService);
    }

    @Override
    public boolean delete(CbAccommodationCleaningService cbAccommodationCleaningService) {
        try {
            cbAccommodationCleaningServiceRepository.delete(cbAccommodationCleaningService);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationCleaningService> findAll() {
        return cbAccommodationCleaningServiceRepository.findAll();
    }
}
