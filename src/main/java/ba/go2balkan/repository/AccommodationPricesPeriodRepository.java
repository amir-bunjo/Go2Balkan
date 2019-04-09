package ba.go2balkan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;

@Repository
public interface AccommodationPricesPeriodRepository extends JpaRepository<AccommodationPricesPeriod, Integer> {
	
	@Query("SELECT p FROM AccommodationPricesPeriod p WHERE p.accommodation = ?1 and p.roomType = ?2")
	public List<AccommodationPricesPeriod> findPricePeriodByAccommodation(Integer accommodation, Integer roomType);

}
