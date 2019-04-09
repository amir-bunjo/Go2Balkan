package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbCancellationPolicy;

public interface CbCancellationPolicyService {
    CbCancellationPolicy saveOrUpdate(CbCancellationPolicy cbCancellationPolicy);
    boolean delete(CbCancellationPolicy cbCancellationPolicy);
    List<CbCancellationPolicy> findAll();
}
