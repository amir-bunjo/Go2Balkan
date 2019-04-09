package ba.go2balkan.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ba.go2balkan.model.client.Client;
import java.util.List;

@Repository
public interface ClientRepository  extends CrudRepository<Client, Long>{
	
	//Miroslav : CrudRepository is kept for commented code below , CrudRepository is initialy set.
    
    public Client findByEmail(String email);
    
    public List<Client> findByUsernameAndPassword(String username, String password);
    

}