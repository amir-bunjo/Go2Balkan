package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationBusinessFacility;
import ba.go2balkan.repository.CbAccommodationBusinessFacilityRepository;
import ba.go2balkan.services.interfaces.CbAccommodationBusinessFacilityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationBusinessFacilityServiceImpl implements CbAccommodationBusinessFacilityService {

    private final CbAccommodationBusinessFacilityRepository cbAccommodationBusinessFacilityRepository;

    public CbAccommodationBusinessFacilityServiceImpl(
            CbAccommodationBusinessFacilityRepository cbAccommodationBusinessFacilityRepository) {
        this.cbAccommodationBusinessFacilityRepository = cbAccommodationBusinessFacilityRepository;
    }

    @Override
    public CbAccommodationBusinessFacility saveOrUpdate(CbAccommodationBusinessFacility cbAccommodationBusinessFacility) {
        return cbAccommodationBusinessFacilityRepository.save(cbAccommodationBusinessFacility);
    }

    @Override
    public boolean delete(CbAccommodationBusinessFacility cbAccommodationBusinessFacility) {
        try {
            cbAccommodationBusinessFacilityRepository.delete(cbAccommodationBusinessFacility);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationBusinessFacility> findAll() {
        return cbAccommodationBusinessFacilityRepository.findAll();
    }
}
