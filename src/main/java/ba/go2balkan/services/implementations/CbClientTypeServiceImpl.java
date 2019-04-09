package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbClientType;
import ba.go2balkan.repository.CbClientTypeRepository;
import ba.go2balkan.services.interfaces.CbClientTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbClientTypeServiceImpl implements CbClientTypeService {

    private final CbClientTypeRepository cbClientTypeRepository;

    public CbClientTypeServiceImpl(CbClientTypeRepository cbClientTypeRepository) {
        this.cbClientTypeRepository = cbClientTypeRepository;
    }

    @Override
    public CbClientType saveOrUpdate(CbClientType cbClientType) {
        return cbClientTypeRepository.save(cbClientType);
    }

    @Override
    public boolean delete(CbClientType cbClientType) {
        try {
            cbClientTypeRepository.delete(cbClientType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbClientType> findAll() {
        return cbClientTypeRepository.findAll();
    }
}
