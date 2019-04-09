package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.DiscountClass;

public interface DiscountClassService {
    DiscountClass saveOrUpdate(DiscountClass discountClass);
    boolean delete(DiscountClass discountClass);
    List<DiscountClass> findAll();
}
