package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbPaymentMode;
import ba.go2balkan.repository.CbPaymentModeRepository;
import ba.go2balkan.services.interfaces.CbPaymentModeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbPaymentModeServiceImpl implements CbPaymentModeService {

    private final CbPaymentModeRepository cbPaymentModeRepository;

    public CbPaymentModeServiceImpl(CbPaymentModeRepository cbPaymentModeRepository) {
        this.cbPaymentModeRepository = cbPaymentModeRepository;
    }

    @Override
    public CbPaymentMode saveOrUpdate(CbPaymentMode cbPaymentMode) {
        return cbPaymentModeRepository.save(cbPaymentMode);
    }

    @Override
    public boolean delete(CbPaymentMode cbPaymentMode) {
        try {
            cbPaymentModeRepository.delete(cbPaymentMode);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbPaymentMode> findAll() {
        return cbPaymentModeRepository.findAll();
    }
}
