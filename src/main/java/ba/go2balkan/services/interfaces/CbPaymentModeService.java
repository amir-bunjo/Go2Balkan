package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbPaymentMode;

public interface CbPaymentModeService {
    CbPaymentMode saveOrUpdate(CbPaymentMode cbPaymentMode);
    boolean delete(CbPaymentMode cbPaymentMode);
    List<CbPaymentMode> findAll();
}
