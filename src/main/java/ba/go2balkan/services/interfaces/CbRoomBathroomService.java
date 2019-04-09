package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomBathroom;

public interface CbRoomBathroomService {
    CbRoomBathroom saveOrUpdate(CbRoomBathroom cbRoomBathroom);
    boolean delete(CbRoomBathroom cbRoomBathroom);
    List<CbRoomBathroom> findAll();
}
