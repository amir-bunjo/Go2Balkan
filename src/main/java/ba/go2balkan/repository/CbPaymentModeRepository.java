package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbPaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CbPaymentModeRepository extends JpaRepository<CbPaymentMode, Byte> {
}
