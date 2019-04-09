package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbBedPreference;
import ba.go2balkan.repository.CbBedPreferenceRepository;
import ba.go2balkan.services.interfaces.CbBedPreferenceService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbBedPreferenceServiceImpl implements CbBedPreferenceService {

    private final CbBedPreferenceRepository cbBedPreferenceRepository;

    public CbBedPreferenceServiceImpl(CbBedPreferenceRepository cbBedPreferenceRepository) {
        this.cbBedPreferenceRepository = cbBedPreferenceRepository;
    }

    @Override
    public CbBedPreference saveOrUpdate(CbBedPreference cbBedPreference) {
        return cbBedPreferenceRepository.save(cbBedPreference);
    }

    @Override
    public boolean delete(CbBedPreference cbBedPreference) {
        try {
            cbBedPreferenceRepository.save(cbBedPreference);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbBedPreference> findAll() {
        return cbBedPreferenceRepository.findAll();
    }
}
