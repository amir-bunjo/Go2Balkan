package ba.go2balkan.controllers;

import ba.go2balkan.jwt.BCryptingPasswordMethod;
import ba.go2balkan.model.accommodation.Account;
import ba.go2balkan.services.interfaces.AccountService;

import java.util.Date;

import ba.go2balkan.services.interfaces.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
//@CrossOrigin(origins = "http://localhost:4200")
public class AccountController extends MainController {

    private final AccountService accountService;
	private final EmailService emailService;

	@Autowired
	public AccountController(AccountService accountService, EmailService emailService) {
		this.accountService = accountService;
		this.emailService = emailService;
	}

	@GetMapping("/account/userdetails")
    public ResponseEntity<?> getUserDetails(){
		Account account = getCurrentLoggedUser();
		account.setPassword(null);
    	return new ResponseEntity<Account>(account, HttpStatus.OK);
    }

    @PostMapping("/account/registration")
    public ResponseEntity<?> newAccountRegistration(@RequestBody Account account){
    	account.setDateCreated(new Date());
    	account.setPassword(BCryptingPasswordMethod.bCryptEncoder(account.getPassword()));
        return new ResponseEntity<Account>(accountService.saveOrUpdate(account), HttpStatus.CREATED);
        
//        JSON Example for Testing new registration purpose
//        {
//        	"accountType":"1",
//        	"contactName":"Name Example",
//        	"username":"info123@adeda.ba",
//        	"password":"password"
//        }
    }

    @GetMapping("/account/registration/{username}")
    public ResponseEntity<?> checkIfAccountByEmailAlreadyExists(@PathVariable String username){
        return new ResponseEntity<Boolean>(accountService.checkIfAccountByUsernameAlreadyExists(username), HttpStatus.OK);
    }

    @GetMapping("/account/sendmail/password/{username}")
    public ResponseEntity<?> sendEmailMessageForSettingNewPassword(@PathVariable String username){

        if(accountService.checkIfAccountByUsernameAlreadyExistsAndRemovePassword(username)){
            try {
                emailService.sendEmailMessageForSettingNewPassword(username);
                return new ResponseEntity<String>("Successfully sent email to: " + username, HttpStatus.OK);
            } catch (Exception e){
                System.out.println(e.getMessage());
                return new ResponseEntity<String>(e.getMessage(), HttpStatus.OK);
            }
        } else {
            return new ResponseEntity<String>("Email does not exist", HttpStatus.OK);
        }
    }
}
