package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbGrati;
import ba.go2balkan.repository.CbGratiRepository;
import ba.go2balkan.services.interfaces.CbGratiService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbGratiServiceImpl implements CbGratiService {

    private final CbGratiRepository cbGratiRepository;

    public CbGratiServiceImpl(CbGratiRepository cbGratiRepository) {
        this.cbGratiRepository = cbGratiRepository;
    }

    @Override
    public CbGrati saveOrUpdate(CbGrati cbGrati) {
        return cbGratiRepository.save(cbGrati);
    }

    @Override
    public boolean delete(CbGrati cbGrati) {
        try {
            cbGratiRepository.delete(cbGrati);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbGrati> findAll() {
        return cbGratiRepository.findAll();
    }
}
