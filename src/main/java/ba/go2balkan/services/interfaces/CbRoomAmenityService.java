package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomAmenity;

public interface CbRoomAmenityService {
    CbRoomAmenity saveOrUpdate(CbRoomAmenity cbRoomAmenity);
    boolean delete(CbRoomAmenity cbRoomAmenity);
    List<CbRoomAmenity> findAll();
}
