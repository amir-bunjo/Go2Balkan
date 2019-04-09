package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbCancellationPolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CbCancellationPolicyRepository extends JpaRepository<CbCancellationPolicy, Byte> {
}
