package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomOutdoorView;
import ba.go2balkan.repository.CbRoomOutdoorViewRepository;
import ba.go2balkan.services.interfaces.CbRoomOutdoorViewService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomOutdoorViewServiceImpl implements CbRoomOutdoorViewService {

    private final CbRoomOutdoorViewRepository cbRoomOutdoorViewRepository;

    public CbRoomOutdoorViewServiceImpl(CbRoomOutdoorViewRepository cbRoomOutdoorViewRepository) {
        this.cbRoomOutdoorViewRepository = cbRoomOutdoorViewRepository;
    }

    @Override
    public CbRoomOutdoorView saveOrUpdate(CbRoomOutdoorView cbRoomOutdoorView) {
        return cbRoomOutdoorViewRepository.save(cbRoomOutdoorView);
    }

    @Override
    public boolean delete(CbRoomOutdoorView cbRoomOutdoorView) {
        try {
            cbRoomOutdoorViewRepository.delete(cbRoomOutdoorView);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomOutdoorView> findAll() {
        return cbRoomOutdoorViewRepository.findAll();
    }
}
