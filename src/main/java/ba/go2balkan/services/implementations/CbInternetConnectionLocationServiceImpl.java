package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbInternetConnectionLocation;
import ba.go2balkan.repository.CbInternetConnectionLocationRepository;
import ba.go2balkan.services.interfaces.CbInternetConnectionLocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbInternetConnectionLocationServiceImpl implements CbInternetConnectionLocationService {

    private final CbInternetConnectionLocationRepository cbInternetConnectionLocationRepository;

    public CbInternetConnectionLocationServiceImpl(
            CbInternetConnectionLocationRepository cbInternetConnectionLocationRepository) {
        this.cbInternetConnectionLocationRepository = cbInternetConnectionLocationRepository;
    }

    @Override
    public CbInternetConnectionLocation saveOrUpdate(CbInternetConnectionLocation cbInternetConnectionLocation) {
        return cbInternetConnectionLocationRepository.save(cbInternetConnectionLocation);
    }

    @Override
    public boolean delete(CbInternetConnectionLocation cbInternetConnectionLocation) {
        try {
            cbInternetConnectionLocationRepository.delete(cbInternetConnectionLocation);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbInternetConnectionLocation> findAll() {
        return cbInternetConnectionLocationRepository.findAll();
    }
}
