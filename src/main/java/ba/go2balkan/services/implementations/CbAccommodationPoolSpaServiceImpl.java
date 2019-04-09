package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationPoolSpa;
import ba.go2balkan.repository.CbAccommodationPoolSpaRepository;
import ba.go2balkan.services.interfaces.CbAccommodationPoolSpaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationPoolSpaServiceImpl implements CbAccommodationPoolSpaService {

    private final CbAccommodationPoolSpaRepository cbAccommodationPoolSpaRepository;

    public CbAccommodationPoolSpaServiceImpl(CbAccommodationPoolSpaRepository cbAccommodationPoolSpaRepository) {
        this.cbAccommodationPoolSpaRepository = cbAccommodationPoolSpaRepository;
    }

    @Override
    public CbAccommodationPoolSpa saveOrUpdate(CbAccommodationPoolSpa cbAccommodationPoolSpa) {
        return cbAccommodationPoolSpaRepository.save(cbAccommodationPoolSpa);
    }

    @Override
    public boolean delete(CbAccommodationPoolSpa cbAccommodationPoolSpa) {
        try {
            cbAccommodationPoolSpaRepository.delete(cbAccommodationPoolSpa);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationPoolSpa> findAll() {
        return cbAccommodationPoolSpaRepository.findAll();
    }
}
