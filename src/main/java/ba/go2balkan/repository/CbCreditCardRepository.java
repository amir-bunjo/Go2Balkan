package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbCreditCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CbCreditCardRepository extends JpaRepository<CbCreditCard, Byte> {
}
