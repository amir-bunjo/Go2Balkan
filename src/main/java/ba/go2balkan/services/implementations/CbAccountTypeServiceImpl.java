package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccountType;
import ba.go2balkan.repository.CbAccountTypeRepository;
import ba.go2balkan.services.interfaces.CbAccountTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccountTypeServiceImpl implements CbAccountTypeService {

    private final CbAccountTypeRepository cbAccountTypeRepository;

    public CbAccountTypeServiceImpl(CbAccountTypeRepository cbAccountTypeRepository) {
        this.cbAccountTypeRepository = cbAccountTypeRepository;
    }

    @Override
    public CbAccountType saveOrUpdate(CbAccountType cbAccountType) {
        return cbAccountTypeRepository.save(cbAccountType);
    }

    @Override
    public boolean delete(CbAccountType cbAccountType) {
        try {
            cbAccountTypeRepository.delete(cbAccountType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccountType> findAll() {
        return cbAccountTypeRepository.findAll();
    }
}
