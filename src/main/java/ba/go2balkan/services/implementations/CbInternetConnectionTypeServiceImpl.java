package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbInternetConnectionType;
import ba.go2balkan.repository.CbInternetConnectionTypeRepository;
import ba.go2balkan.services.interfaces.CbInternetConnectionTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbInternetConnectionTypeServiceImpl implements CbInternetConnectionTypeService {

    private final CbInternetConnectionTypeRepository cbInternetConnectionTypeRepository;

    public CbInternetConnectionTypeServiceImpl(
            CbInternetConnectionTypeRepository cbInternetConnectionTypeRepository) {
        this.cbInternetConnectionTypeRepository = cbInternetConnectionTypeRepository;
    }

    @Override
    public CbInternetConnectionType saveOrUpdate(CbInternetConnectionType cbInternetConnectionType) {
        return cbInternetConnectionTypeRepository.save(cbInternetConnectionType);
    }

    @Override
    public boolean delete(CbInternetConnectionType cbInternetConnectionType) {
        try {
            cbInternetConnectionTypeRepository.delete(cbInternetConnectionType);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbInternetConnectionType> findAll() {
        return cbInternetConnectionTypeRepository.findAll();
    }
}
