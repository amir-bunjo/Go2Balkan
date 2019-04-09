package ba.go2balkan.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import ba.go2balkan.model.accommodation.Account;
import ba.go2balkan.services.interfaces.AccountService;

public class MainController {
	
    private AccountService accountService;
    
    @Autowired
	void setAccountService(AccountService accountService) {
		this.accountService = accountService;
	}
	
	protected Account getCurrentLoggedUser() {
	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        if (null == authentication || null == authentication.getPrincipal()) {
	            throw new RuntimeException("Not authorized");
	        }

	        Optional<Account>  account = null;
	        try{
	            
	            account = accountService.findByUsername(authentication.getName());
	        }
	        catch(Exception ex){
	        	ex.printStackTrace();
	        	throw new RuntimeException("problem to get logged user" );
	        }

	        return account.get();
	    }

}
