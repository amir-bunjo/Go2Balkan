package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.DiscountAge;
import ba.go2balkan.repository.DiscountAgeRepository;
import ba.go2balkan.services.interfaces.DiscountAgeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DiscountAgeServiceImpl implements DiscountAgeService {

    private final DiscountAgeRepository discountAgeRepository;

    public DiscountAgeServiceImpl(DiscountAgeRepository discountAgeRepository) {
        this.discountAgeRepository = discountAgeRepository;
    }

    @Override
    public DiscountAge saveOrUpdate(DiscountAge discountAge) {
        return discountAgeRepository.save(discountAge);
    }

    @Override
    public boolean delete(DiscountAge discountAge) {

        try {
            discountAgeRepository.delete(discountAge);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<DiscountAge> findAll() {
        return discountAgeRepository.findAll();
    }
    
    
    @Override
    public boolean deleteById(Integer id) {
		
    	try {
            discountAgeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
        	return false;
        }
	}

	@Override
	public Optional<DiscountAge> findById(Integer id) {
		// TODO Auto-generated method stub
		return discountAgeRepository.findById(id);
	}

	
   

	
    
}
