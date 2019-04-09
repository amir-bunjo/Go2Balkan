package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbBookingStatus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CbBookingStatusRepository extends JpaRepository<CbBookingStatus, Byte> {
}
