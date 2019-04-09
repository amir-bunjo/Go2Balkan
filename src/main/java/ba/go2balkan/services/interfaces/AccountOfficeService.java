package ba.go2balkan.services.interfaces;

import java.util.List;

import ba.go2balkan.model.accommodation.AccountOffice;

public interface AccountOfficeService {
    AccountOffice saveOrUpdate(AccountOffice accountOffice);
    boolean delete(AccountOffice accountOffice);
    List<AccountOffice> findAll();
}
