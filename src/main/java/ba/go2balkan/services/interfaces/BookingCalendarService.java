package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.BookingCalendar;

public interface BookingCalendarService {
    BookingCalendar saveOrUpdate(BookingCalendar bookingCalendar);
    boolean delete(BookingCalendar bookingCalendar);
    List<BookingCalendar> findAll();
}
