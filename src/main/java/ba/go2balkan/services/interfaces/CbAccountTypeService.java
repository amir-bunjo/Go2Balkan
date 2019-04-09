package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbAccountType;

public interface CbAccountTypeService {
    CbAccountType saveOrUpdate(CbAccountType cbAccountType);
    boolean delete(CbAccountType cbAccountType);
    List<CbAccountType> findAll();
}
