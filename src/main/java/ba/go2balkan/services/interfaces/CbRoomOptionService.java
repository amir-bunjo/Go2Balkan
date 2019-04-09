package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomOption;

public interface CbRoomOptionService {
    CbRoomOption saveOrUpdate(CbRoomOption cbRoomOption);
    boolean delete(CbRoomOption cbRoomOption);
    List<CbRoomOption> findAll();
}
