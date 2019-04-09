package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbSurrounding;

public interface CbSurroundingService {
    CbSurrounding saveOrUpdate(CbSurrounding cbSurrounding);
    boolean delete(CbSurrounding cbSurrounding);
    List<CbSurrounding> findAll();
}
