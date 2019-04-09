package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbVatRate;

public interface CbVatRateService {
    CbVatRate saveOrUpdate(CbVatRate cbVatRate);
    boolean delete(CbVatRate cbVatRate);
    List<CbVatRate> findAll();
}
