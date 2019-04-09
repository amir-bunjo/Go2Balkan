package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.cb.CbServiceAvailability;

public interface CbServiceAvailabilityService {
    CbServiceAvailability saveOrUpdate(CbServiceAvailability cbServiceAvailability);
    boolean delete(CbServiceAvailability cbServiceAvailability);
    List<CbServiceAvailability> findAll();
}
