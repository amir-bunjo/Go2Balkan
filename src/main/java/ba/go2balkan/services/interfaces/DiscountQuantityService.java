package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.DiscountQuantity;

public interface DiscountQuantityService {
    DiscountQuantity saveOrUpdate(DiscountQuantity discountQuantity);
    boolean delete(DiscountQuantity discountQuantity);
    List<DiscountQuantity> findAll();
    boolean deleteById(Integer id);
}
