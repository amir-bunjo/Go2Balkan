package ba.go2balkan.repository;

import ba.go2balkan.model.cb.CbRoomTypeName;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CbRoomTypeNameRepository extends JpaRepository<CbRoomTypeName, Short> {
	//public List<CbRoomTypeName> findByAccommodation(Integer accommodation);
}
