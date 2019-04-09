package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.BookingCalendar;
import ba.go2balkan.repository.BookingCalendarRepository;
import ba.go2balkan.services.interfaces.BookingCalendarService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingCalendarServiceImpl implements BookingCalendarService {

    private final BookingCalendarRepository bookingCalendarRepository;

    public BookingCalendarServiceImpl(BookingCalendarRepository bookingCalendarRepository) {
        this.bookingCalendarRepository = bookingCalendarRepository;
    }

    @Override
    public BookingCalendar saveOrUpdate(BookingCalendar bookingCalendar) {
        return bookingCalendarRepository.save(bookingCalendar);
    }

    @Override
    public boolean delete(BookingCalendar bookingCalendar) {

        try {
            bookingCalendarRepository.delete(bookingCalendar);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<BookingCalendar> findAll() {
        return bookingCalendarRepository.findAll();
    }
}
