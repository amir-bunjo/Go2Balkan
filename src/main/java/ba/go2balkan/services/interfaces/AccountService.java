package ba.go2balkan.services.interfaces;

import java.util.List;
import java.util.Optional;

import ba.go2balkan.model.accommodation.Account;

public interface AccountService {
    Account saveOrUpdate(Account account);
    Optional<Account> findByUsername(String username);
    boolean delete(Account account);
    List<Account> findAll();
    Boolean checkIfAccountByUsernameAlreadyExists(String username);
    Boolean checkIfAccountByUsernameAlreadyExistsAndRemovePassword(String username);
}
