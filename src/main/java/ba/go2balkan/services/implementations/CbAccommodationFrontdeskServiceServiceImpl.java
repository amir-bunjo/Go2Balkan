package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationFrontdeskService;
import ba.go2balkan.repository.CbAccommodationFrontdeskServiceRepository;
import ba.go2balkan.services.interfaces.CbAccommodationFrontdeskServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationFrontdeskServiceServiceImpl implements CbAccommodationFrontdeskServiceService {

    private final CbAccommodationFrontdeskServiceRepository cbAccommodationFrontdeskServiceRepository;

    public CbAccommodationFrontdeskServiceServiceImpl(
            CbAccommodationFrontdeskServiceRepository cbAccommodationFrontdeskServiceRepository) {
        this.cbAccommodationFrontdeskServiceRepository = cbAccommodationFrontdeskServiceRepository;
    }

    @Override
    public CbAccommodationFrontdeskService saveOrUpdate(CbAccommodationFrontdeskService cbAccommodationFrontdeskService) {
        return cbAccommodationFrontdeskServiceRepository.save(cbAccommodationFrontdeskService);
    }

    @Override
    public boolean delete(CbAccommodationFrontdeskService cbAccommodationFrontdeskService) {
        try {
            cbAccommodationFrontdeskServiceRepository.delete(cbAccommodationFrontdeskService);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationFrontdeskService> findAll() {
        return cbAccommodationFrontdeskServiceRepository.findAll();
    }
}
