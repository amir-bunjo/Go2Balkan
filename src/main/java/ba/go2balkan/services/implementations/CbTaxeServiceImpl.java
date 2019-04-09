package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbTaxe;
import ba.go2balkan.repository.CbTaxeRepository;
import ba.go2balkan.services.interfaces.CbTaxeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbTaxeServiceImpl implements CbTaxeService {

    private final CbTaxeRepository cbTaxeRepository;

    public CbTaxeServiceImpl(CbTaxeRepository cbTaxeRepository) {
        this.cbTaxeRepository = cbTaxeRepository;
    }

    @Override
    public CbTaxe saveOrUpdate(CbTaxe cbTaxe) {
        return cbTaxeRepository.save(cbTaxe);
    }

    @Override
    public boolean delete(CbTaxe cbTaxe) {
        try {
            cbTaxeRepository.delete(cbTaxe);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbTaxe> findAll() {
        return cbTaxeRepository.findAll();
    }
}
