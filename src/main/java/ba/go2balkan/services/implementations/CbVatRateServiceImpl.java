package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbVatRate;
import ba.go2balkan.repository.CbVatRateRepository;
import ba.go2balkan.services.interfaces.CbVatRateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbVatRateServiceImpl implements CbVatRateService {

    private final CbVatRateRepository cbVatRateRepository;

    public CbVatRateServiceImpl(CbVatRateRepository cbVatRateRepository) {
        this.cbVatRateRepository = cbVatRateRepository;
    }

    @Override
    public CbVatRate saveOrUpdate(CbVatRate cbVatRate) {
        return cbVatRateRepository.save(cbVatRate);
    }

    @Override
    public boolean delete(CbVatRate cbVatRate) {
        try {
            cbVatRateRepository.delete(cbVatRate);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbVatRate> findAll() {
        return cbVatRateRepository.findAll();
    }
}
