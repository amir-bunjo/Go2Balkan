package ba.go2balkan.repository;

import ba.go2balkan.services.custom.AccommodationBookingSales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;
import ba.go2balkan.model.accommodation.Booking;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Integer> {
	
	//Miroslav : CrudRepository is kept for commented code below , CrudRepository is initialy set.

    @Query(value = "select b from Booking b where " +
            " b.accommodation=:accId and " +
            " (b.arrivalDate<=:checkOut and b.departureDate>=:checkIn )")
    public Set<Booking> findForAccommodation(@Param("accId") Long accId,
                                           @Param("checkIn") Date checkIn,
                                           @Param("checkOut") Date checkOut);

    @Query("SELECT NEW ba.go2balkan.services.custom.AccommodationBookingSales(b.id, b.account, b.reservationHolderDetails, b.bookedRooms, b.grandTotal, b.paidinAmount, b.arrivalDate, b.departureDate, b.reservationDate, b.gatewayId) FROM Booking b WHERE b.accommodation = :ai")
    List<AccommodationBookingSales> findCustomAccommodationBookingSalesDetailsByAccommodationId(@Param("ai") Integer accommodationId);
    
    
    @Query("SELECT b.g2bFee FROM Booking b where b.id = :id")
    Integer findBookingG2BFee(@Param("id") Long accommodationId);
}
