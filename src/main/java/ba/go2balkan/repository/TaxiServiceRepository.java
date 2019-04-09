package ba.go2balkan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.taxi.TaxiService;

@Repository
public interface TaxiServiceRepository extends JpaRepository<TaxiService, String> {
}
