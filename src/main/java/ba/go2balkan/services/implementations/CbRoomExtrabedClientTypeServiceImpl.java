package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomExtrabedClientType;
import ba.go2balkan.repository.CbRoomExtrabedClientTypeRepository;
import ba.go2balkan.services.interfaces.CbRoomExtrabedClientTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomExtrabedClientTypeServiceImpl implements CbRoomExtrabedClientTypeService {

    private final CbRoomExtrabedClientTypeRepository cbRoomExtrabedClientTypeRepository;

    public CbRoomExtrabedClientTypeServiceImpl(
            CbRoomExtrabedClientTypeRepository cbRoomExtrabedClientTypeRepository) {
        this.cbRoomExtrabedClientTypeRepository = cbRoomExtrabedClientTypeRepository;
    }

    @Override
    public CbRoomExtrabedClientType saveOrUpdate(CbRoomExtrabedClientType cbRoomExtrabedClientType) {
        return cbRoomExtrabedClientTypeRepository.save(cbRoomExtrabedClientType);
    }

    @Override
    public boolean delete(CbRoomExtrabedClientType cbRoomExtrabedClientType) {
        try {
            cbRoomExtrabedClientTypeRepository.delete(cbRoomExtrabedClientType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomExtrabedClientType> findAll() {
        return cbRoomExtrabedClientTypeRepository.findAll();
    }
}
