package ba.go2balkan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.accommodation.AccommodationRoom;

@Repository
public interface AccommodationRoomRepository extends JpaRepository<AccommodationRoom, Integer> {
	
	@Query("SELECT r FROM AccommodationRoom r WHERE r.accommodation = ?1 and r.roomType = ?2")
	public List<AccommodationRoom> findRoomsByAccommodation(Integer accommodation, Integer roomType);
}
