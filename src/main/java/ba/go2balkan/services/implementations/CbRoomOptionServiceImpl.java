package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomOption;
import ba.go2balkan.repository.CbRoomOptionRepository;
import ba.go2balkan.services.interfaces.CbRoomOptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomOptionServiceImpl implements CbRoomOptionService {

    private final CbRoomOptionRepository cbRoomOptionRepository;

    public CbRoomOptionServiceImpl(CbRoomOptionRepository cbRoomOptionRepository) {
        this.cbRoomOptionRepository = cbRoomOptionRepository;
    }

    @Override
    public CbRoomOption saveOrUpdate(CbRoomOption cbRoomOption) {
        return cbRoomOptionRepository.save(cbRoomOption);
    }

    @Override
    public boolean delete(CbRoomOption cbRoomOption) {
        try {
            cbRoomOptionRepository.delete(cbRoomOption);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomOption> findAll() {
        return cbRoomOptionRepository.findAll();
    }
}
