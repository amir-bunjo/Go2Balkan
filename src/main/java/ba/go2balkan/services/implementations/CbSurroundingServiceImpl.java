package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbSurrounding;
import ba.go2balkan.repository.CbSurroundingRepository;
import ba.go2balkan.services.interfaces.CbSurroundingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbSurroundingServiceImpl implements CbSurroundingService {

    private final CbSurroundingRepository cbSurroundingRepository;

    public CbSurroundingServiceImpl(CbSurroundingRepository cbSurroundingRepository) {
        this.cbSurroundingRepository = cbSurroundingRepository;
    }

    @Override
    public CbSurrounding saveOrUpdate(CbSurrounding cbSurrounding) {
        return cbSurroundingRepository.save(cbSurrounding);
    }

    @Override
    public boolean delete(CbSurrounding cbSurrounding) {
        try {
            cbSurroundingRepository.delete(cbSurrounding);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbSurrounding> findAll() {
        return cbSurroundingRepository.findAll();
    }
}
