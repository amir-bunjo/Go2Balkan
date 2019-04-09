package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbVatRate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CbVatRateRepository extends JpaRepository<CbVatRate, Byte> {
}
