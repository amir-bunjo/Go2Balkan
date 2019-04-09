package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbCityTaxType;
import ba.go2balkan.repository.CbCityTaxTypeRepository;
import ba.go2balkan.services.interfaces.CbCityTaxTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbCityTaxTypeServiceImpl implements CbCityTaxTypeService {

    private final CbCityTaxTypeRepository cbCityTaxTypeRepository;

    public CbCityTaxTypeServiceImpl(CbCityTaxTypeRepository cbCityTaxTypeRepository) {
        this.cbCityTaxTypeRepository = cbCityTaxTypeRepository;
    }

    @Override
    public CbCityTaxType saveOrUpdate(CbCityTaxType cbCityTaxType) {
        return cbCityTaxTypeRepository.save(cbCityTaxType);
    }

    @Override
    public boolean delete(CbCityTaxType cbCityTaxType) {
        try {
            cbCityTaxTypeRepository.delete(cbCityTaxType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbCityTaxType> findAll() {
        return cbCityTaxTypeRepository.findAll();
    }
}
