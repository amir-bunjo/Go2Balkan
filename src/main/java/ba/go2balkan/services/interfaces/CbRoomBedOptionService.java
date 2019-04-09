package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbRoomBedOption;

public interface CbRoomBedOptionService {
    CbRoomBedOption saveOrUpdate(CbRoomBedOption cbRoomBedOption);
    boolean delete(CbRoomBedOption cbRoomBedOption);
    List<CbRoomBedOption> findAll();
}
