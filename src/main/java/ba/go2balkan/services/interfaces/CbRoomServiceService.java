package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomService;

public interface CbRoomServiceService {
    CbRoomService saveOrUpdate(CbRoomService cbRoomService);
    boolean delete(CbRoomService cbRoomService);
    List<CbRoomService> findAll();
}
