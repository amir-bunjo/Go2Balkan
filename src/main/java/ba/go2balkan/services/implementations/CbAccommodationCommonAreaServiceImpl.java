package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationCommonArea;
import ba.go2balkan.repository.CbAccommodationCommonAreaRepository;
import ba.go2balkan.services.interfaces.CbAccommodationCommonAreaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationCommonAreaServiceImpl implements CbAccommodationCommonAreaService {

    private final CbAccommodationCommonAreaRepository cbAccommodationCommonAreaRepository;

    public CbAccommodationCommonAreaServiceImpl(
            CbAccommodationCommonAreaRepository cbAccommodationCommonAreaRepository) {
        this.cbAccommodationCommonAreaRepository = cbAccommodationCommonAreaRepository;
    }

    @Override
    public CbAccommodationCommonArea saveOrUpdate(CbAccommodationCommonArea cbAccommodationCommonArea) {
        return cbAccommodationCommonAreaRepository.save(cbAccommodationCommonArea);
    }

    @Override
    public boolean delete(CbAccommodationCommonArea cbAccommodationCommonArea) {
        try {
            cbAccommodationCommonAreaRepository.delete(cbAccommodationCommonArea);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationCommonArea> findAll() {
        return cbAccommodationCommonAreaRepository.findAll();
    }
}
