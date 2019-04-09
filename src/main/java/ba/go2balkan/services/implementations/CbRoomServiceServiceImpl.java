package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomService;
import ba.go2balkan.repository.CbRoomServiceRepository;
import ba.go2balkan.services.interfaces.CbRoomServiceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomServiceServiceImpl implements CbRoomServiceService {

    private final CbRoomServiceRepository cbRoomServiceRepository;

    public CbRoomServiceServiceImpl(CbRoomServiceRepository cbRoomServiceRepository) {
        this.cbRoomServiceRepository = cbRoomServiceRepository;
    }

    @Override
    public CbRoomService saveOrUpdate(CbRoomService cbRoomService) {
        return cbRoomServiceRepository.save(cbRoomService);
    }

    @Override
    public boolean delete(CbRoomService cbRoomService) {
        try {
            cbRoomServiceRepository.delete(cbRoomService);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomService> findAll() {
        return cbRoomServiceRepository.findAll();
    }
}
