package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.DiscountQuantity;
import ba.go2balkan.repository.DiscountQuantityRepository;
import ba.go2balkan.services.interfaces.DiscountQuantityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountQuantityServiceImpl implements DiscountQuantityService {

    private final DiscountQuantityRepository discountQuantityRepository;

    public DiscountQuantityServiceImpl(DiscountQuantityRepository discountQuantityRepository) {
        this.discountQuantityRepository = discountQuantityRepository;
    }

    @Override
    public DiscountQuantity saveOrUpdate(DiscountQuantity discountQuantity) {
        return discountQuantityRepository.save(discountQuantity);
    }

    @Override
    public boolean delete(DiscountQuantity discountQuantity) {
        try {
            discountQuantityRepository.delete(discountQuantity);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<DiscountQuantity> findAll() {
        return discountQuantityRepository.findAll();
    }
    
    @Override
    public boolean deleteById(Integer id) {
		
    	try {
            discountQuantityRepository.deleteById(id);
            return true;
        } catch (Exception e) {
        	return false;
        }
	}
}
