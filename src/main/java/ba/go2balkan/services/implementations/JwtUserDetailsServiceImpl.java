//package ba.go2balkan.services.implementations;
//
//import ba.go2balkan.jwt.JwtUserDetails;
//import ba.go2balkan.repository.JwtUserDetailsRepository;
//import ba.go2balkan.services.interfaces.JwtUserDetailsService;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class JwtUserDetailsServiceImpl implements JwtUserDetailsService {
//
//    private JwtUserDetailsRepository jwtUserDetailsRepository;
//
//    public JwtUserDetailsServiceImpl(JwtUserDetailsRepository jwtUserDetailsRepository) {
//        this.jwtUserDetailsRepository = jwtUserDetailsRepository;
//    }
//
//    @Override
//    public void saveJwtUserDetails(JwtUserDetails jwtUserDetails) {
//        jwtUserDetailsRepository.save(jwtUserDetails);
//    }
//
//    @Override
//    public Optional<JwtUserDetails> findByUsername(String username) {
//        return jwtUserDetailsRepository.findByUsername(username);
//    }
//}
