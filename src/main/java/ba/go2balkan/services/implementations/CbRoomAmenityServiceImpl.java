package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomAmenity;
import ba.go2balkan.repository.CbRoomAmenityRepository;
import ba.go2balkan.services.interfaces.CbRoomAmenityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomAmenityServiceImpl implements CbRoomAmenityService {

    private final CbRoomAmenityRepository cbRoomAmenityRepository;

    public CbRoomAmenityServiceImpl(CbRoomAmenityRepository cbRoomAmenityRepository) {
        this.cbRoomAmenityRepository = cbRoomAmenityRepository;
    }

    @Override
    public CbRoomAmenity saveOrUpdate(CbRoomAmenity cbRoomAmenity) {
        return cbRoomAmenityRepository.save(cbRoomAmenity);
    }

    @Override
    public boolean delete(CbRoomAmenity cbRoomAmenity) {
        try {
            cbRoomAmenityRepository.delete(cbRoomAmenity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomAmenity> findAll() {
        return cbRoomAmenityRepository.findAll();
    }
}
