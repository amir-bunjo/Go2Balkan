package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.AccountOffice;
import ba.go2balkan.repository.AccountOfficeRepository;
import ba.go2balkan.services.interfaces.AccountOfficeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountOfficeServiceImpl implements AccountOfficeService {

    private final AccountOfficeRepository accountOfficeRepository;

    public AccountOfficeServiceImpl(AccountOfficeRepository accountOfficeRepository) {
        this.accountOfficeRepository = accountOfficeRepository;
    }

    @Override
    public AccountOffice saveOrUpdate(AccountOffice accountOffice) {
        return accountOfficeRepository.save(accountOffice);
    }

    @Override
    public boolean delete(AccountOffice accountOffice) {

        try {
            accountOfficeRepository.delete(accountOffice);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<AccountOffice> findAll() {
        return accountOfficeRepository.findAll();
    }
}
