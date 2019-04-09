package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.DiscountMiscellaneous;
import ba.go2balkan.repository.DiscountMiscellaneousRepository;
import ba.go2balkan.services.interfaces.DiscountMiscellaneousService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountMiscellaneousServiceImpl implements DiscountMiscellaneousService {

    private final DiscountMiscellaneousRepository discountMiscellaneousRepository;

    public DiscountMiscellaneousServiceImpl(DiscountMiscellaneousRepository discountMiscellaneousRepository) {
        this.discountMiscellaneousRepository = discountMiscellaneousRepository;
    }

    @Override
    public DiscountMiscellaneous saveOrUpdate(DiscountMiscellaneous discountMiscellaneous) {
        return discountMiscellaneousRepository.save(discountMiscellaneous);
    }

    @Override
    public boolean delete(DiscountMiscellaneous discountMiscellaneous) {
        try {
            discountMiscellaneousRepository.delete(discountMiscellaneous);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<DiscountMiscellaneous> findAll() {
        return discountMiscellaneousRepository.findAll();
    }
    
    @Override
    public boolean deleteById(Integer id) {
		
    	try {
            discountMiscellaneousRepository.deleteById(id);
            return true;
        } catch (Exception e) {
        	return false;
        }
	}
}
