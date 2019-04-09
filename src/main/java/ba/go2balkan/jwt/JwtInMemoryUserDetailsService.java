package ba.go2balkan.jwt;

import ba.go2balkan.model.accommodation.Account;
import ba.go2balkan.services.interfaces.AccountService;
//import ba.go2balkan.services.interfaces.JwtUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JwtInMemoryUserDetailsService implements UserDetailsService {

//    private final JwtUserDetailsService jwtUserDetailsService;
    private final AccountService accountService;

//    public JwtInMemoryUserDetailsService(JwtUserDetailsService jwtUserDetailsService) {
//        this.jwtUserDetailsService = jwtUserDetailsService;
//    }


    public JwtInMemoryUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//
//        Optional<JwtUserDetails> findFirst = jwtUserDetailsService.findByUsername(username);
//
//        if (!(findFirst.isPresent())) {
//            throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
//        }
//
//        return findFirst.get();
//    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<Account> findFirst = accountService.findByUsername(username);

        if (!(findFirst.isPresent())) {
            throw new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", username));
        }

        return findFirst.get();
    }
}
