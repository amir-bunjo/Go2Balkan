package ba.go2balkan.repository;

import java.util.List;

import ba.go2balkan.services.custom.AccommodationIdAndName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;  //mozda moze trebat
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ba.go2balkan.model.accommodation.Accommodation;

@Repository
public interface AccommodationRepository  extends JpaRepository<Accommodation, Long>{

	//Miroslav : CrudRepository is kept for commented code below , CrudRepository is initialy set.

    List<Accommodation> findAllByNameIgnoreCaseContaining(String name);
    List<Accommodation> findByAccount(Integer accountId);

    @Query("SELECT a.staffLanguages FROM Accommodation a where a.id = :id")
    String findStaffLanguagesByAccommodationId(@Param("id") Long id);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.staffLanguages = :sl WHERE a.id = :id")
    void saveOrUpdateStaffLanguagesByAccommodationId(@Param("sl") String staffLanguagesStr, @Param("id") Long accommodationId);
    
    @Query("SELECT a.acceptedCards FROM Accommodation a where a.id = :id")
    String findCreditCardsByAccommodationId(@Param("id") Long id);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.acceptedCards = :ac WHERE a.id = :id")
    void saveOrUpdateCreditCardsByAccommodationId(@Param("ac") String creditCardsStr, @Param("id") Long accommodationId);
    
    @Query("SELECT a.optionsBreakfast FROM Accommodation a where a.id = :id")
    String findBreakfastsByAccommodationId(@Param("id") Long id);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsBreakfast = :ob WHERE a.id = :id")
    void saveOrUpdateBreakfastsByAccommodationId(@Param("ob") String breakfastsStr, @Param("id") Long accommodationId);

    @Query("SELECT a.optionsInternet FROM Accommodation a where a.id = :id")
    String findInternetOptionsByAccommodationId(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsInternet = :oi WHERE a.id = :id")
    void saveOrUpdateInternetOptionsByAccommodationId(@Param("oi") String internetOptionsStr, @Param("id") Long accommodationId);

    @Query("SELECT a.optionsParking FROM Accommodation a where a.id = :id")
    String findParkingOptionsByAccommodationId(@Param("id") Long id);    

    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsParking = :op WHERE a.id = :id")    //pogledat malo opet
    void saveOrUpdateParkingOptionsByAccommodationId(@Param("op") String internetOptionsStr, @Param("id") Long accommodationId);

    @Query("SELECT a.petsPolicy FROM Accommodation a where a.id = :id")
    String findPetsPolicyByAccommodationId(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.petsPolicy = :pp WHERE a.id = :id")
    void saveOrUpdatePetsPolicyByAccommodationId(@Param("pp") String petsPolicyStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsActivities = :oa WHERE a.id = :id")
    void saveOrUpdateAmenitesActivityByAccommodationId(@Param("oa") String amenitiesActivityStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsFoodDrink = :of WHERE a.id = :id")
    void saveOrUpdateAmenitesFoodDrinkByAccommodationId(@Param("of") String amenitiesFoodDrinkStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsPoolSpa = :op WHERE a.id = :id")
    void saveOrUpdateAmenitesPoolSpaByAccommodationId(@Param("op") String amenitiesPoolSpaStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsTransportation = :ot WHERE a.id = :id")
    void saveOrUpdateAmenitesTransportationByAccommodationId(@Param("ot") String amenitiesTransportationStr, @Param("id") Long accommodationId);

    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsFrontdeskServices = :ofd WHERE a.id = :id")
    void saveOrUpdateAmenitesFrontDeskByAccommodationId(@Param("ofd") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsCommonAreas = :oc WHERE a.id = :id")
    void saveOrUpdateAmenitesCommonAreasByAccommodationId(@Param("oc") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsEntertainment = :oe WHERE a.id = :id")
    void saveOrUpdateAmenitesEntertainmentByAccommodationId(@Param("oe") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsCleaningServices = :ocs WHERE a.id = :id")
    void saveOrUpdateAmenitesCleaningByAccommodationId(@Param("ocs") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsBusinessFacilities = :ob WHERE a.id = :id")
    void saveOrUpdateAmenitesBusinessFacilitiesByAccommodationId(@Param("ob") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsShops = :os WHERE a.id = :id")
    void saveOrUpdateAmenitesShopsByAccommodationId(@Param("os") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    @Transactional
    @Modifying
    @Query("UPDATE Accommodation a SET a.optionsMiscellaneous = :om WHERE a.id = :id")
    void saveOrUpdateAmenitesMiscellaneousByAccommodationId(@Param("om") String amenitiesTransportationStr, @Param("id") Long accommodationId);
    
    
    
    
    
//    @Query("SELECT a.id, a.name FROM Accommodation a WHERE a.account = :ai")
    @Query("SELECT NEW ba.go2balkan.services.custom.AccommodationIdAndName(a.id, a.name) FROM Accommodation a WHERE a.account = :ai")
    List<AccommodationIdAndName> fetchAccommodationIdsAndNamesListByAccountId(@Param("ai") Integer accountId);
    
//    @Query(value = "SELECT NEW ba.go2balkan.dto.TestDTO(a.id, a.accepted_cards, a.accommodation_bathrooms"
//    		+ "a.accommodation_bedrooms, a.accommodation_lvingrooms, a.accommodation_pics, a.accommodation_type "
//    		+ "FROM accommodation a WHERE a.state = :paramId", nativeQuery = true)
//    public List<TestDTO> findAllTest(@Param("category") Integer category,
//			@Param("paramId") Long paramId,
//			@Param("startDate")Date checkIn,
//            @Param("endDate") Date checkOut);
//    
//    
//    
//    @Query(value = "SELECT NEW ba.go2balkan.dto.Accommodation(a.id, a.rent_type, a.account, "
//    		+ "a.accommodation_type, a.accommodation_promo_pic, a.accommodation_pics, a.name, a.rank, "
//    		+ "a.state, a.zip, a.city, a.location, a.address, a.googlemap_link, a.checkin_start, a.checkin_end, "
//    		+ "a.checkout_start, a.checkout_end, a.user_rating, a.staff_languages, a.accepted_cards, a.pets_policy, "
//    		+ "a.options_payment_types, a.options_activities, a.options_breakfast,  a.options_business_facilities, "
//    		+ "a.options_cleaning_services, a.options_common_areas, a.options_entertainment, a.options_food_drink, "
//    		+ "a.options_frontdesk_services, a.options_miscellaneous, a.options_pool_spa, a.options_transportation, "
//    		+ "a.options_shops, a.options_internet, a.options_parking, a.surroundings, a.accommodation_bathrooms, "
//    		+ "a.accommodation_bedrooms, a.accommodation_lvingrooms, a.balkan_region, a.custom_id, a.date_created, "
//    		+ "a.description, a.email, a.important_information, a.is_active, a.phone, a.rooms_total, a.web, "
//    		+ "GROUP_CONCAT(a.room_type_id,',',a.room_type,',',a.room_name,',',(a.rooms_num - IFNULL(b.rooms_booked, 0)),"
//    		+ "',',a.size,',',a.room_capacity,',', a.accommodation_promo_pic,',',a.room_pics,',',"
//    		+ "IFNULL(a.options_amenities, ''), ',', IFNULL(a.options_outdoor_views, ''), ',', IFNULL(a.options_food_drinks, '') "
//    		+ "SEPARATOR '`') AS room_type) FROM (SELECT ac.id, ac.accommodation_type, ac.rent_type, ac.account,"
//    		+ "ac.name, ac.accommodation_promo_pic, ac.state, ac.zip, ac.city, ac.location, ac.address, ac.rank,"
//    		+ "ac.googlemap_link, ac.checkin_start, ac.checkin_end, ac.checkout_start, ac.checkout_end, ac.user_rating,"
//    		+ "ac.staff_languages, ac.accepted_cards, ac.pets_policy, ac.options_payment_types, ac.options_activities,"
//    		+ "ac.options_breakfast, ac.options_business_facilities, ac.options_cleaning_services, ac.options_common_areas,"
//    		+ "ac.options_entertainment, ac.options_food_drink, ac.options_frontdesk_services, ac.options_miscellaneous,"
//    		+ "ac.options_pool_spa, ac.options_transportation, ac.options_shops, ac.options_internet, ac.options_parking,"
//    		+ "ac.surroundings, ac.accommodation_pics, ar.room_type AS room_type_id, ac.accommodation_bathrooms,"
//    		+ "ac.accommodation_bedrooms, ac.accommodation_lvingrooms, ac.balkan_region, ac.custom_id, ac.date_created,"
//    		+ "ac.description,ac.email, ac.important_information, ac.is_active, ac.phone, ac.rooms_total, ac.web, "
//    		+ "rt.room_type, rt.room_name, COUNT(*) AS rooms_num, rt.description AS descript, rt.size, rt.room_capacity,"
//    		+ "rt.options_amenities, rt.options_outdoor_views, rt.options_food_drinks, rt.options_media_tech,"
//    		+ "rt.room_services, rt.room_choices, rt.promo_pic, rt.room_pics "
//    		+ "FROM accommodation_rooms AS ar, accommodation AS ac, accommodation_room_types AS rt "
//    		+ "WHERE CASE WHEN :category = 1 THEN ac.state = (SELECT cbl.state FROM cb_locations AS cbl WHERE cbl.id = :paramId) "
//    		+ "WHEN :category = 2 THEN ac.city = (SELECT cbl.city FROM cb_locations AS cbl WHERE cbl.id = :paramId) "
//    		+ "WHEN :category = 3 THEN ar.accommodation = :paramId AND ac.id = :paramId END "
//    		+ "AND ac.id = rt.accommodation AND rt.id = ar.room_type GROUP BY ar.accommodation , ar.room_type) a"
//    		+ "LEFT JOIN (SELECT  bc.accommodation, bc.room_type, COUNT(*) AS rooms_booked FROM booking_calendar AS bc "
//    		+ "WHERE  :startDate BETWEEN bc.check_in AND bc.check_out OR :endDate BETWEEN bc.check_in AND bc.check_out "
//    		+ "OR bc.check_in >= :startDate AND :endDate >= bc.check_out GROUP BY bc.accommodation , bc.room_type) b ON a.id = b.accommodation"
//    		+ "AND a.room_type_id = b.room_type GROUP BY id", nativeQuery = true)
//    List<Accommodation> search(@Param("category") Integer category,
//									@Param("paramId") Long paramId,
//									@Param("startDate")Date checkIn,
//						            @Param("endDate") Date checkOut);
}