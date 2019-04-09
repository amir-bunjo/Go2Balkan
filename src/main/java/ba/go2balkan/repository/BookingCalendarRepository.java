package ba.go2balkan.repository;

import ba.go2balkan.model.accommodation.BookingCalendar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingCalendarRepository extends JpaRepository<BookingCalendar, Integer> {
}
