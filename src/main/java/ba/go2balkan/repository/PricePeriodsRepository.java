package ba.go2balkan.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.accommodation.AccommodationPricesPeriod;

//import java.util.Collection;
//import java.util.List;
import java.util.Date;
import java.util.Set;

@Repository
public interface PricePeriodsRepository extends CrudRepository<AccommodationPricesPeriod,Long> {

    @Query(value = "select pp from AccommodationPricesPeriod pp where " +
            " pp.accommodation=:accId " +
            " and ( pp.priceStartDate<=:checkOut and pp.priceEndDate>=:checkIn ) ")
    public Set<AccommodationPricesPeriod> findForAccommodation(@Param("accId") Long accId,
                                                                   @Param("checkIn") Date checkIn,
                                                                   @Param("checkOut") Date checkOut);
}
