package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationBreakfastType;
import ba.go2balkan.repository.CbAccommodationBreakfastTypeRepository;
import ba.go2balkan.services.interfaces.CbAccommodationBreakfastTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationBreakfastTypeServiceImpl implements CbAccommodationBreakfastTypeService {

    private final CbAccommodationBreakfastTypeRepository cbAccommodationBreakfastTypeRepository;

    public CbAccommodationBreakfastTypeServiceImpl(
            CbAccommodationBreakfastTypeRepository cbAccommodationBreakfastTypeRepository) {
        this.cbAccommodationBreakfastTypeRepository = cbAccommodationBreakfastTypeRepository;
    }

    @Override
    public CbAccommodationBreakfastType saveOrUpdate(CbAccommodationBreakfastType cbAccommodationBreakfastType) {
        return cbAccommodationBreakfastTypeRepository.save(cbAccommodationBreakfastType);
    }

    @Override
    public boolean delete(CbAccommodationBreakfastType cbAccommodationBreakfastType) {
        try {
            cbAccommodationBreakfastTypeRepository.delete(cbAccommodationBreakfastType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationBreakfastType> findAll() {
        return cbAccommodationBreakfastTypeRepository.findAll();
    }
}
