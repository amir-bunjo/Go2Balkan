package ba.go2balkan.repository;

import ba.go2balkan.model.accommodation.DiscountQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiscountQuantityRepository extends JpaRepository<DiscountQuantity, Integer> {
}
