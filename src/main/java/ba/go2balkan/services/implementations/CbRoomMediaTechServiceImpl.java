package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomMediaTech;
import ba.go2balkan.repository.CbRoomMediaTechRepository;
import ba.go2balkan.services.interfaces.CbRoomMediaTechService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomMediaTechServiceImpl implements CbRoomMediaTechService {

    private final CbRoomMediaTechRepository cbRoomMediaTechRepository;

    public CbRoomMediaTechServiceImpl(CbRoomMediaTechRepository cbRoomMediaTechRepository) {
        this.cbRoomMediaTechRepository = cbRoomMediaTechRepository;
    }

    @Override
    public CbRoomMediaTech saveOrUpdate(CbRoomMediaTech cbRoomMediaTech) {
        return cbRoomMediaTechRepository.save(cbRoomMediaTech);
    }

    @Override
    public boolean delete(CbRoomMediaTech cbRoomMediaTech) {
        try {
            cbRoomMediaTechRepository.delete(cbRoomMediaTech);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomMediaTech> findAll() {
        return cbRoomMediaTechRepository.findAll();
    }
}
