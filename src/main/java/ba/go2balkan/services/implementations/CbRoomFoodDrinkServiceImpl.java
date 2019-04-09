package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbRoomFoodDrink;
import ba.go2balkan.repository.CbRoomFoodDrinkRepository;
import ba.go2balkan.services.interfaces.CbRoomFoodDrinkService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbRoomFoodDrinkServiceImpl implements CbRoomFoodDrinkService {

    private final CbRoomFoodDrinkRepository cbRoomFoodDrinkRepository;

    public CbRoomFoodDrinkServiceImpl(CbRoomFoodDrinkRepository cbRoomFoodDrinkRepository) {
        this.cbRoomFoodDrinkRepository = cbRoomFoodDrinkRepository;
    }

    @Override
    public CbRoomFoodDrink saveOrUpdate(CbRoomFoodDrink cbRoomFoodDrink) {
        return cbRoomFoodDrinkRepository.save(cbRoomFoodDrink);
    }

    @Override
    public boolean delete(CbRoomFoodDrink cbRoomFoodDrink) {
        try {
            cbRoomFoodDrinkRepository.delete(cbRoomFoodDrink);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbRoomFoodDrink> findAll() {
        return cbRoomFoodDrinkRepository.findAll();
    }
}
