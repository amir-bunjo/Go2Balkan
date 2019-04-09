package ba.go2balkan.services.implementations;

import ba.go2balkan.model.accommodation.Account;
import ba.go2balkan.repository.AccountRepository;
import ba.go2balkan.services.interfaces.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account saveOrUpdate(Account account) {
        return accountRepository.save(account);
    }

    @Override
    public Optional<Account> findByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    @Override
    public boolean delete(Account account) {

        try {
            accountRepository.delete(account);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @Override
    public Boolean checkIfAccountByUsernameAlreadyExists(String username) {
    	Optional<Account> account = accountRepository.findByUsername(username);

        if(!account.isPresent()){
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Boolean checkIfAccountByUsernameAlreadyExistsAndRemovePassword(String username) {

        Account account = accountRepository.findByUsername(username).get();

        if(account == null){
            return false;
        } else {
            account.setPassword(null);
            accountRepository.save(account);
            return true;
        }
    }
}
