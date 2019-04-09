package ba.go2balkan.services.implementations;

import ba.go2balkan.model.cb.CbBookingStatus;
import ba.go2balkan.repository.CbBookingStatusRepository;
import ba.go2balkan.services.interfaces.CbBookingStatusService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CbBookingStatusServiceImpl implements CbBookingStatusService {

    private final CbBookingStatusRepository cbBookingStatusRepository;

    public CbBookingStatusServiceImpl(CbBookingStatusRepository cbBookingStatusRepository) {
        this.cbBookingStatusRepository = cbBookingStatusRepository;
    }

    @Override
    public CbBookingStatus saveOrUpdate(CbBookingStatus cbBookingStatus) {
        return cbBookingStatusRepository.save(cbBookingStatus);
    }

    @Override
    public boolean delete(CbBookingStatus cbBookingStatus) {
        try {
            cbBookingStatusRepository.delete(cbBookingStatus);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public List<CbBookingStatus> findAll() {
        return cbBookingStatusRepository.findAll();
    }
}
