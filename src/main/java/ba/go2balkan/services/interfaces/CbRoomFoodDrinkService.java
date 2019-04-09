package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomFoodDrink;

public interface CbRoomFoodDrinkService {
    CbRoomFoodDrink saveOrUpdate(CbRoomFoodDrink cbRoomFoodDrink);
    boolean delete(CbRoomFoodDrink cbRoomFoodDrink);
    List<CbRoomFoodDrink> findAll();
}
