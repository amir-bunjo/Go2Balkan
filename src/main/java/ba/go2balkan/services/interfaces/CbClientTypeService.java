package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbClientType;

public interface CbClientTypeService {
    CbClientType saveOrUpdate(CbClientType cbClientType);
    boolean delete(CbClientType cbClientType);
    List<CbClientType> findAll();
}
