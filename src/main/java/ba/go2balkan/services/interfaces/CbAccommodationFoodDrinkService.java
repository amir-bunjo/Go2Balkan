package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccommodationFoodDrink;

public interface CbAccommodationFoodDrinkService {
    CbAccommodationFoodDrink saveOrUpdate(CbAccommodationFoodDrink cbAccommodationFoodDrink);
    boolean delete(CbAccommodationFoodDrink cbAccommodationFoodDrink);
    List<CbAccommodationFoodDrink> findAll();
}
