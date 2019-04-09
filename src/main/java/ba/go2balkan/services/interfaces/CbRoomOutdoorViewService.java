package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomOutdoorView;

public interface CbRoomOutdoorViewService {
    CbRoomOutdoorView saveOrUpdate(CbRoomOutdoorView cbRoomOutdoorView);
    boolean delete(CbRoomOutdoorView cbRoomOutdoorView);
    List<CbRoomOutdoorView> findAll();
}
