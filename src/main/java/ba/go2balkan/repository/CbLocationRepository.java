package ba.go2balkan.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ba.go2balkan.model.cb.CbLocation;

import java.util.List;

@Repository
public interface CbLocationRepository  extends CrudRepository<CbLocation, Long>{
	
	//Miroslav : CrudRepository is kept for commented code below , CrudRepository is initialy set.

	public List<CbLocation> findAllByZipIgnoreCaseContaining(String zip);
	
	public List<CbLocation> findAllByCityIgnoreCaseContaining(String city);
    
	public List<CbLocation> findDistinctByStateIgnoreCaseContaining(String state);
	
	@Query(value = "SELECT DISTINCT l.state FROM cb_locations l WHERE state like \"%:state%\"", nativeQuery = true)
	public List<CbLocation> distinctStateContaining(@Param("state") String state);
	
}