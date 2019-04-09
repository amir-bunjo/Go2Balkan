package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomType;
import ba.go2balkan.repository.CbRoomTypeRepository;
import ba.go2balkan.services.interfaces.CbRoomTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomTypeServiceImpl implements CbRoomTypeService {

    private final CbRoomTypeRepository cbRoomTypeRepository;

    public CbRoomTypeServiceImpl(CbRoomTypeRepository cbRoomTypeRepository) {
        this.cbRoomTypeRepository = cbRoomTypeRepository;
    }

    @Override
    public CbRoomType saveOrUpdate(CbRoomType cbRoomType) {
        return cbRoomTypeRepository.save(cbRoomType);
    }

    @Override
    public boolean delete(CbRoomType cbRoomType) {
        try {
            cbRoomTypeRepository.delete(cbRoomType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomType> findAll() {
        return cbRoomTypeRepository.findAll();
    }
}
