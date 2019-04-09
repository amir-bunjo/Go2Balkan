package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAgencyType;

public interface CbAgencyTypeService {
    CbAgencyType saveOrUpdate(CbAgencyType cbAgencyType);
    boolean delete(CbAgencyType cbAgencyType);
    List<CbAgencyType> findAll();
}
