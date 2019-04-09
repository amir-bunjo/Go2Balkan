package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbBookingStatus;

public interface CbBookingStatusService {
    CbBookingStatus saveOrUpdate(CbBookingStatus cbBookingStatus);
    boolean delete(CbBookingStatus cbBookingStatus);
    List<CbBookingStatus> findAll();
}
