package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationActivity;
import ba.go2balkan.repository.CbAccommodationActivityRepository;
import ba.go2balkan.services.interfaces.CbAccommodationActivityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationActivityServiceImpl implements CbAccommodationActivityService {

    private final CbAccommodationActivityRepository cbAccommodationActivityRepository;

    public CbAccommodationActivityServiceImpl(CbAccommodationActivityRepository cbAccommodationActivityRepository) {
        this.cbAccommodationActivityRepository = cbAccommodationActivityRepository;
    }

    @Override
    public CbAccommodationActivity saveOrUpdate(CbAccommodationActivity cbAccommodationActivity) {
        return cbAccommodationActivityRepository.save(cbAccommodationActivity);
    }

    @Override
    public boolean delete(CbAccommodationActivity cbAccommodationActivity) {
        try {
            cbAccommodationActivityRepository.delete(cbAccommodationActivity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationActivity> findAll() {
        return cbAccommodationActivityRepository.findAll();
    }
}
