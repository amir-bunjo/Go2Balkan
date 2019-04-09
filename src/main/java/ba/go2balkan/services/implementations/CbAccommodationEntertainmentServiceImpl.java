package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationEntertainment;
import ba.go2balkan.repository.CbAccommodationEntertainmentRepository;
import ba.go2balkan.services.interfaces.CbAccommodationEntertainmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationEntertainmentServiceImpl implements CbAccommodationEntertainmentService {

    private final CbAccommodationEntertainmentRepository cbAccommodationEntertainmentRepository;

    public CbAccommodationEntertainmentServiceImpl(
            CbAccommodationEntertainmentRepository cbAccommodationEntertainmentRepository) {
        this.cbAccommodationEntertainmentRepository = cbAccommodationEntertainmentRepository;
    }

    @Override
    public CbAccommodationEntertainment saveOrUpdate(CbAccommodationEntertainment cbAccommodationEntertainment) {
        return cbAccommodationEntertainmentRepository.save(cbAccommodationEntertainment);
    }

    @Override
    public boolean delete(CbAccommodationEntertainment cbAccommodationEntertainment) {
        try {
            cbAccommodationEntertainmentRepository.delete(cbAccommodationEntertainment);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationEntertainment> findAll() {
        return cbAccommodationEntertainmentRepository.findAll();
    }
}
