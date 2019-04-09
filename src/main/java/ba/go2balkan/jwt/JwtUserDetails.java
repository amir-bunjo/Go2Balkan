//package ba.go2balkan.jwt;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.util.Collection;
//
//@Entity
//public class JwtUserDetails implements UserDetails {
//
//    private static final long serialVersionUID = 5155720064139820502L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String username;
//    private String password;
//    //    private final Collection<? extends GrantedAuthority> authorities;
//    private String authority;
//
//    public JwtUserDetails(Long id, String username, String password, String role) {
//        this.id = id;
//        this.username = username;
//        this.password = password;
//
////        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
////        authorities.add(new SimpleGrantedAuthority(role));
//
////        this.authorities = authorities;
//        this.authority = role;
//    }
//
//    public JwtUserDetails(String username, String password, String role) {
//        this.username = username;
//        this.password = password;
//
////        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
////        authorities.add(new SimpleGrantedAuthority(role));
////
////        this.authorities = authorities;
//        this.authority = role;
//    }
//
//    public JwtUserDetails() {}
//
//    @JsonIgnore
//    public Long getId() {
//        return id;
//    }
//
//    @Override
//    public String getUsername() {
//        return username;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public String getPassword() {
//        return password;
//    }
//
//    //If uncommented - remove method below
//
////    @Override
////    public Collection<? extends GrantedAuthority> getAuthorities() {
////        return authorities;
////    }
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return null;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
