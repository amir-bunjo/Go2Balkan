package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbServiceAvailability;
import ba.go2balkan.repository.CbServiceAvailabilityRepository;
import ba.go2balkan.services.interfaces.CbServiceAvailabilityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbServiceAvailabilityServiceImpl implements CbServiceAvailabilityService {

    private final CbServiceAvailabilityRepository cbServiceAvailabilityRepository;

    public CbServiceAvailabilityServiceImpl(CbServiceAvailabilityRepository cbServiceAvailabilityRepository) {
        this.cbServiceAvailabilityRepository = cbServiceAvailabilityRepository;
    }

    @Override
    public CbServiceAvailability saveOrUpdate(CbServiceAvailability cbServiceAvailability) {
        return cbServiceAvailabilityRepository.save(cbServiceAvailability);
    }

    @Override
    public boolean delete(CbServiceAvailability cbServiceAvailability) {
        try {
            cbServiceAvailabilityRepository.delete(cbServiceAvailability);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbServiceAvailability> findAll() {
        return cbServiceAvailabilityRepository.findAll();
    }
}
