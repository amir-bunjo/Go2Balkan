package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomType;

public interface CbRoomTypeService {
    CbRoomType saveOrUpdate(CbRoomType cbRoomType);
    boolean delete(CbRoomType cbRoomType);
    List<CbRoomType> findAll();
}
