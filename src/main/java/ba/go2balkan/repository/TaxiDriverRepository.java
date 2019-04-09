package ba.go2balkan.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.taxi.TaxiDriver;

@Repository
public interface TaxiDriverRepository extends JpaRepository<TaxiDriver, Integer> {
}
