package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomExtrabedClientType;

public interface CbRoomExtrabedClientTypeService {
    CbRoomExtrabedClientType saveOrUpdate(CbRoomExtrabedClientType cbRoomExtrabedClientType);
    boolean delete(CbRoomExtrabedClientType cbRoomExtrabedClientType);
    List<CbRoomExtrabedClientType> findAll();
}
