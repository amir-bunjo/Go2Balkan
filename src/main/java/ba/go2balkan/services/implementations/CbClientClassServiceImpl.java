package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbClientClass;
import ba.go2balkan.repository.CbClientClassRepository;
import ba.go2balkan.services.interfaces.CbClientClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbClientClassServiceImpl implements CbClientClassService {

    private final CbClientClassRepository cbClientClassRepository;

    public CbClientClassServiceImpl(CbClientClassRepository cbClientClassRepository) {
        this.cbClientClassRepository = cbClientClassRepository;
    }

    @Override
    public CbClientClass saveOrUpdate(CbClientClass cbClientClass) {
        return cbClientClassRepository.save(cbClientClass);
    }

    @Override
    public boolean delete(CbClientClass cbClientClass) {
        try {
            cbClientClassRepository.delete(cbClientClass);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbClientClass> findAll() {
        return cbClientClassRepository.findAll();
    }
}
