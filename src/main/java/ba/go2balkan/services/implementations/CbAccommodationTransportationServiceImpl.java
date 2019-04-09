package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationTransportation;
import ba.go2balkan.repository.CbAccommodationTransportationRepository;
import ba.go2balkan.services.interfaces.CbAccommodationTransportationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationTransportationServiceImpl implements CbAccommodationTransportationService {

    private final CbAccommodationTransportationRepository cbAccommodationTransportationRepository;

    public CbAccommodationTransportationServiceImpl(
            CbAccommodationTransportationRepository cbAccommodationTransportationRepository) {
        this.cbAccommodationTransportationRepository = cbAccommodationTransportationRepository;
    }

    @Override
    public CbAccommodationTransportation saveOrUpdate(CbAccommodationTransportation cbAccommodationTransportation) {
        return cbAccommodationTransportationRepository.save(cbAccommodationTransportation);
    }

    @Override
    public boolean delete(CbAccommodationTransportation cbAccommodationTransportation) {
        try {
            cbAccommodationTransportationRepository.delete(cbAccommodationTransportation);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationTransportation> findAll() {
        return cbAccommodationTransportationRepository.findAll();
    }
}
