package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomTypeName;

public interface CbRoomTypeNameService {
    CbRoomTypeName saveOrUpdate(CbRoomTypeName cbRoomTypeName);
    boolean delete(CbRoomTypeName cbRoomTypeName);
    List<CbRoomTypeName> findAll();
}
