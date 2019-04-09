package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbClientClass;

public interface CbClientClassService {
    CbClientClass saveOrUpdate(CbClientClass cbClientClass);
    boolean delete(CbClientClass cbClientClass);
    List<CbClientClass> findAll();
}
