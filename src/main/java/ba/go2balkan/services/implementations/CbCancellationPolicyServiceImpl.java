package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbCancellationPolicy;
import ba.go2balkan.repository.CbCancellationPolicyRepository;
import ba.go2balkan.services.interfaces.CbCancellationPolicyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbCancellationPolicyServiceImpl implements CbCancellationPolicyService {

    private final CbCancellationPolicyRepository cbCancellationPolicyRepository;

    public CbCancellationPolicyServiceImpl(CbCancellationPolicyRepository cbCancellationPolicyRepository) {
        this.cbCancellationPolicyRepository = cbCancellationPolicyRepository;
    }

    @Override
    public CbCancellationPolicy saveOrUpdate(CbCancellationPolicy cbCancellationPolicy) {
        return cbCancellationPolicyRepository.save(cbCancellationPolicy);
    }

    @Override
    public boolean delete(CbCancellationPolicy cbCancellationPolicy) {
        try {
            cbCancellationPolicyRepository.delete(cbCancellationPolicy);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbCancellationPolicy> findAll() {
        return cbCancellationPolicyRepository.findAll();
    }
}
