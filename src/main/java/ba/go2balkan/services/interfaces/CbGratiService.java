package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbGrati;

public interface CbGratiService {
    CbGrati saveOrUpdate(CbGrati cbGrati);
    boolean delete(CbGrati cbGrati);
    List<CbGrati> findAll();
}
