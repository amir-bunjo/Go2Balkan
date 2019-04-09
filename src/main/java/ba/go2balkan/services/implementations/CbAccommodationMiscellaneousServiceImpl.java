package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationMiscellaneous;
import ba.go2balkan.repository.CbAccommodationMiscellaneousRepository;
import ba.go2balkan.services.interfaces.CbAccommodationMiscellaneousService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationMiscellaneousServiceImpl implements CbAccommodationMiscellaneousService {

    private final CbAccommodationMiscellaneousRepository cbAccommodationMiscellaneousRepository;

    public CbAccommodationMiscellaneousServiceImpl(
            CbAccommodationMiscellaneousRepository cbAccommodationMiscellaneousRepository) {
        this.cbAccommodationMiscellaneousRepository = cbAccommodationMiscellaneousRepository;
    }

    @Override
    public CbAccommodationMiscellaneous saveOrUpdate(CbAccommodationMiscellaneous cbAccommodationMiscellaneous) {
        return cbAccommodationMiscellaneousRepository.save(cbAccommodationMiscellaneous);
    }

    @Override
    public boolean delete(CbAccommodationMiscellaneous cbAccommodationMiscellaneous) {
        try {
            cbAccommodationMiscellaneousRepository.save(cbAccommodationMiscellaneous);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationMiscellaneous> findAll() {
        return cbAccommodationMiscellaneousRepository.findAll();
    }
}
