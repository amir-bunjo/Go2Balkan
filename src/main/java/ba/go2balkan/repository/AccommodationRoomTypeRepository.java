package ba.go2balkan.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ba.go2balkan.model.accommodation.AccommodationRoomType;
@Repository
public interface AccommodationRoomTypeRepository extends JpaRepository<AccommodationRoomType, Integer> {
	
	public List<AccommodationRoomType> findByAccommodation(Integer accommodation);
	
	@Transactional
    @Modifying
    @Query("UPDATE AccommodationRoomType a SET a.roomPics = :sl WHERE a.id = :id")
    void saveOrUpdateRoomPicture(@Param("sl") String roomPicture, @Param("id") Integer Id);
	
	}

	
