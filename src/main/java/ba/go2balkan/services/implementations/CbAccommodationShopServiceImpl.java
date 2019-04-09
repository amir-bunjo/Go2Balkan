package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationShop;
import ba.go2balkan.repository.CbAccommodationShopRepository;
import ba.go2balkan.services.interfaces.CbAccommodationShopService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationShopServiceImpl implements CbAccommodationShopService {

    private final CbAccommodationShopRepository cbAccommodationShopRepository;

    public CbAccommodationShopServiceImpl(CbAccommodationShopRepository cbAccommodationShopRepository) {
        this.cbAccommodationShopRepository = cbAccommodationShopRepository;
    }

    @Override
    public CbAccommodationShop saveOrUpdate(CbAccommodationShop cbAccommodationShop) {
        return cbAccommodationShopRepository.save(cbAccommodationShop);
    }

    @Override
    public boolean delete(CbAccommodationShop cbAccommodationShop) {
        try {
            cbAccommodationShopRepository.delete(cbAccommodationShop);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationShop> findAll() {
        return cbAccommodationShopRepository.findAll();
    }
}
