package ba.go2balkan.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ba.go2balkan.model.accommodation.DiscountAge;
import ba.go2balkan.model.accommodation.DiscountMiscellaneous;
import ba.go2balkan.model.accommodation.DiscountQuantity;
import ba.go2balkan.services.interfaces.DiscountAgeService;
import ba.go2balkan.services.interfaces.DiscountMiscellaneousService;
import ba.go2balkan.services.interfaces.DiscountQuantityService;

@RestController
@RequestMapping("/api/accommodation/discount")
@CrossOrigin(origins = "http://localhost:4200")
public class DiscountController {
	
	private final DiscountAgeService discountAgeService;
    private final DiscountQuantityService discountQuantityService;
    private final DiscountMiscellaneousService discountMiscellaneousService;
    	
	 public DiscountController(DiscountAgeService discountAgeService, DiscountQuantityService discountQuantityService,DiscountMiscellaneousService discountMiscellaneousService) {
		 
		 this.discountAgeService = discountAgeService;
	        this.discountQuantityService = discountQuantityService;
	        this.discountMiscellaneousService= discountMiscellaneousService;
	    }
	 
	 @PostMapping("/3/saveorupdate")
	    public ResponseEntity<?> saveOrUpdateM(
	            @RequestBody DiscountMiscellaneous discountMiscellaneous){
	    	
	    	System.out.println("Discount quantity  should be saved");
	    	
	        return new ResponseEntity<DiscountMiscellaneous>(
	                discountMiscellaneousService.saveOrUpdate(discountMiscellaneous),
	                HttpStatus.CREATED);
	        
	    	
	        
	    }
	    
	    @PostMapping("/2/saveorupdate")
	    public ResponseEntity<?> saveOrUpdateQ(
	            @RequestBody DiscountQuantity discountQuantity){
	    	
	    	System.out.println("Discount quantity  should be saved");
	    	
	        return new ResponseEntity<DiscountQuantity>(
	                discountQuantityService.saveOrUpdate(discountQuantity),
	                HttpStatus.CREATED);
	        
	       // discountQuantityService.saveOrUpdate(discountAge)
	    	
	        
	    }

	    @PostMapping("/1/saveorupdate")
	    public ResponseEntity<?> saveOrUpdateA(
	            @RequestBody DiscountAge discountAge){
	    	
	    	System.out.println("Discount age should be saved");
	    	
	        return new ResponseEntity<DiscountAge>(
	                discountAgeService.saveOrUpdate(discountAge),
	                HttpStatus.CREATED);
	        

	    	
	        
	    }
	    
	    @GetMapping("/{discountType}/{accommodationId}")
	    public ResponseEntity<?> getDiscountTypeByAccommodation(@PathVariable Integer accommodationId, @PathVariable Integer discountType){
	    	
	    	System.out.println("Discount age should be getted");
	    	if(discountType==1){
	    		return new ResponseEntity<>(
	                    discountAgeService.findAll(),
	                    HttpStatus.OK);
			}
	    	else if(discountType==2){
	            return new ResponseEntity<>(
	                    discountQuantityService.findAll(),
	                    HttpStatus.OK);
	    	}
	    	else
	    		 return new ResponseEntity<>(
	                     discountMiscellaneousService.findAll(),
	                     HttpStatus.OK);
	    }
	    
//	    @GetMapping("/{discountId}")
//	    public ResponseEntity<?> getDiscountById<y<		¸¸(@PathVariable Integer discountId){
//	    	
//	    	
//	        return new ResponseEntity<>(
//	                discountAgeService.findById(discountId),
//	                HttpStatus.OK);
//	    }
	    
	    @DeleteMapping("/delete/{discountType}/{id}")
	    public ResponseEntity<?> deleteDiscount(@PathVariable Integer discountType, @PathVariable Integer id){
	    	System.out.println("discount should be deleted"+id);
	    	
	    	if(discountType==1)
	        return new ResponseEntity<>(
	                discountAgeService.deleteById(id),
	                HttpStatus.OK);
	    	else if(discountType==2)
	    		return new ResponseEntity<>(
	                    discountQuantityService.deleteById(id),
	                    HttpStatus.OK);
	    	else
	    		return new ResponseEntity<>(
	                    discountMiscellaneousService.deleteById(id),
	                    HttpStatus.OK);
	    }
	 
	 
	 
	 
	 
	 
	 
	 
}
