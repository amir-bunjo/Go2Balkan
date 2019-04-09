package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomBathroom;
import ba.go2balkan.repository.CbRoomBathroomRepository;
import ba.go2balkan.services.interfaces.CbRoomBathroomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomBathroomServiceImpl implements CbRoomBathroomService {

    private final CbRoomBathroomRepository cbRoomBathroomRepository;

    public CbRoomBathroomServiceImpl(CbRoomBathroomRepository cbRoomBathroomRepository) {
        this.cbRoomBathroomRepository = cbRoomBathroomRepository;
    }

    @Override
    public CbRoomBathroom saveOrUpdate(CbRoomBathroom cbRoomBathroom) {
        return cbRoomBathroomRepository.save(cbRoomBathroom);
    }

    @Override
    public boolean delete(CbRoomBathroom cbRoomBathroom) {
        try {
            cbRoomBathroomRepository.delete(cbRoomBathroom);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomBathroom> findAll() {
        return cbRoomBathroomRepository.findAll();
    }
}
