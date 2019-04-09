package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomTypeName;
import ba.go2balkan.repository.CbRoomTypeNameRepository;
import ba.go2balkan.services.interfaces.CbRoomTypeNameService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomTypeNameServiceImpl implements CbRoomTypeNameService {

    private final CbRoomTypeNameRepository cbRoomTypeNameRepository;

    public CbRoomTypeNameServiceImpl(CbRoomTypeNameRepository cbRoomTypeNameRepository) {
        this.cbRoomTypeNameRepository = cbRoomTypeNameRepository;
    }

    @Override
    public CbRoomTypeName saveOrUpdate(CbRoomTypeName cbRoomTypeName) {
        return cbRoomTypeNameRepository.save(cbRoomTypeName);
    }

    @Override
    public boolean delete(CbRoomTypeName cbRoomTypeName) {
        try {
            cbRoomTypeNameRepository.delete(cbRoomTypeName);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomTypeName> findAll() {
        return cbRoomTypeNameRepository.findAll();
    }
}
