package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.DiscountClass;
import ba.go2balkan.repository.DiscountClassRepository;
import ba.go2balkan.services.interfaces.DiscountClassService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiscountClassServiceImpl implements DiscountClassService {

    private final DiscountClassRepository discountClassRepository;

    public DiscountClassServiceImpl(DiscountClassRepository discountClassRepository) {
        this.discountClassRepository = discountClassRepository;
    }

    @Override
    public DiscountClass saveOrUpdate(DiscountClass discountClass) {
        return discountClassRepository.save(discountClass);
    }

    @Override
    public boolean delete(DiscountClass discountClass) {

        try {
            discountClassRepository.delete(discountClass);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<DiscountClass> findAll() {
        return discountClassRepository.findAll();
    }
}
