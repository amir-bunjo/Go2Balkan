package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbAccommodationFoodDrink;
import ba.go2balkan.repository.CbAccommodationFoodDrinkRepository;
import ba.go2balkan.services.interfaces.CbAccommodationFoodDrinkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbAccommodationFoodDrinkServiceImpl implements CbAccommodationFoodDrinkService {

    private final CbAccommodationFoodDrinkRepository cbAccommodationFoodDrinkRepository;

    public CbAccommodationFoodDrinkServiceImpl(
            CbAccommodationFoodDrinkRepository cbAccommodationFoodDrinkRepository) {
        this.cbAccommodationFoodDrinkRepository = cbAccommodationFoodDrinkRepository;
    }

    @Override
    public CbAccommodationFoodDrink saveOrUpdate(CbAccommodationFoodDrink cbAccommodationFoodDrink) {
        return cbAccommodationFoodDrinkRepository.save(cbAccommodationFoodDrink);
    }

    @Override
    public boolean delete(CbAccommodationFoodDrink cbAccommodationFoodDrink) {
        try {
            cbAccommodationFoodDrinkRepository.delete(cbAccommodationFoodDrink);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbAccommodationFoodDrink> findAll() {
        return cbAccommodationFoodDrinkRepository.findAll();
    }
}
