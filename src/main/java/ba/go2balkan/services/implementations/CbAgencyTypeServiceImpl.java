package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAgencyType;
import ba.go2balkan.repository.CbAgencyTypeRepository;
import ba.go2balkan.services.interfaces.CbAgencyTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAgencyTypeServiceImpl implements CbAgencyTypeService {

    private final CbAgencyTypeRepository cbAgencyTypeRepository;

    public CbAgencyTypeServiceImpl(CbAgencyTypeRepository cbAgencyTypeRepository) {
        this.cbAgencyTypeRepository = cbAgencyTypeRepository;
    }

    @Override
    public CbAgencyType saveOrUpdate(CbAgencyType cbAgencyType) {
        return cbAgencyTypeRepository.save(cbAgencyType);
    }

    @Override
    public boolean delete(CbAgencyType cbAgencyType) {
        try {
            cbAgencyTypeRepository.delete(cbAgencyType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAgencyType> findAll() {
        return cbAgencyTypeRepository.findAll();
    }
}
