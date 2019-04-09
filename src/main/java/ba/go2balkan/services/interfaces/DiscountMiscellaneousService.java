package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.DiscountMiscellaneous;

public interface DiscountMiscellaneousService {
    DiscountMiscellaneous saveOrUpdate(DiscountMiscellaneous discountMiscellaneous);
    boolean delete(DiscountMiscellaneous discountMiscellaneous);
    List<DiscountMiscellaneous> findAll();
    boolean deleteById(Integer id);
}
