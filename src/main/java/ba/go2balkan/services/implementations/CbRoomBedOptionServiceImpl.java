package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomBedOption;
import ba.go2balkan.repository.CbRoomBedOptionRepository;
import ba.go2balkan.services.interfaces.CbRoomBedOptionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomBedOptionServiceImpl implements CbRoomBedOptionService {

    private final CbRoomBedOptionRepository cbRoomBedOptionRepository;

    public CbRoomBedOptionServiceImpl(CbRoomBedOptionRepository cbRoomBedOptionRepository) {
        this.cbRoomBedOptionRepository = cbRoomBedOptionRepository;
    }

    @Override
    public CbRoomBedOption saveOrUpdate(CbRoomBedOption cbRoomBedOption) {
        return cbRoomBedOptionRepository.save(cbRoomBedOption);
    }

    @Override
    public boolean delete(CbRoomBedOption cbRoomBedOption) {
        try {
            cbRoomBedOptionRepository.delete(cbRoomBedOption);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomBedOption> findAll() {
        return cbRoomBedOptionRepository.findAll();
    }
}
