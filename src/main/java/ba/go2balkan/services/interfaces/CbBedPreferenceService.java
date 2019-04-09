package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbBedPreference;

public interface CbBedPreferenceService {
    CbBedPreference saveOrUpdate(CbBedPreference cbBedPreference);
    boolean delete(CbBedPreference cbBedPreference);
    List<CbBedPreference> findAll();
}
