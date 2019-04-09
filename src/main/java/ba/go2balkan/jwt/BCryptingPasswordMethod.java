package ba.go2balkan.jwt;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptingPasswordMethod {
	public static String bCryptEncoder(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }
}
