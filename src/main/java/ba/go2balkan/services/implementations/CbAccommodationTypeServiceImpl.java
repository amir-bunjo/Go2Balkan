package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationType;
import ba.go2balkan.repository.CbAccommodationTypeRepository;
import ba.go2balkan.services.interfaces.CbAccommodationTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationTypeServiceImpl implements CbAccommodationTypeService {

    private final CbAccommodationTypeRepository cbAccommodationTypeRepository;

    public CbAccommodationTypeServiceImpl(CbAccommodationTypeRepository cbAccommodationTypeRepository) {
        this.cbAccommodationTypeRepository = cbAccommodationTypeRepository;
    }

    @Override
    public CbAccommodationType saveOrUpdate(CbAccommodationType cbAccommodationType) {
        return cbAccommodationTypeRepository.save(cbAccommodationType);
    }

    @Override
    public boolean delete(CbAccommodationType cbAccommodationType) {
        try {
            cbAccommodationTypeRepository.delete(cbAccommodationType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationType> findAll() {
        return cbAccommodationTypeRepository.findAll();
    }
}
