package ba.go2balkan.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import ba.go2balkan.model.accommodation.AccommodationRoomBed;

public interface AccommodationRoomBedRepository extends JpaRepository<AccommodationRoomBed, Integer> {
}
