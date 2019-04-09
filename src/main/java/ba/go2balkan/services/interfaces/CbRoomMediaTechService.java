package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomMediaTech;

public interface CbRoomMediaTechService {
    CbRoomMediaTech saveOrUpdate(CbRoomMediaTech cbRoomMediaTech);
    boolean delete(CbRoomMediaTech cbRoomMediaTech);
    List<CbRoomMediaTech> findAll();
}
