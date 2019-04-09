package ba.go2balkan.services.interfaces;

import java.util.List;
import java.util.Optional;

import ba.go2balkan.model.accommodation.DiscountAge;

public interface DiscountAgeService {
    DiscountAge saveOrUpdate(DiscountAge discountAge);
    boolean delete(DiscountAge discountAge);
    List<DiscountAge> findAll();
    boolean deleteById(Integer id);
    Optional<DiscountAge> findById(Integer id);
}
