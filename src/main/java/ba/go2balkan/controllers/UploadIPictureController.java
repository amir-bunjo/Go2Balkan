package ba.go2balkan.controllers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
//import com.cloudinary.SingletonManager;
import com.cloudinary.Transformation;
import com.cloudinary.utils.ObjectUtils;

import ba.go2balkan.model.accommodation.DiscountMiscellaneous;
import ba.go2balkan.model.accommodation.ImageModel;
import ba.go2balkan.repository.AccommodationRoomTypeRepository;
import ba.go2balkan.services.interfaces.AccommodationRoomTypeService;






@RestController
public class UploadIPictureController {
	
	private final AccommodationRoomTypeService accommodationRoomTypeService;
	
	public UploadIPictureController(AccommodationRoomTypeService accommodationRoomTypeService) {
		
		this.accommodationRoomTypeService = accommodationRoomTypeService;
	}
	
	List<String> files = new ArrayList<String>();
	
	@PostMapping(value="api/room/image/upload/{roomId}")
    public ResponseEntity<?> uploadImageToCloudinary(@PathVariable Integer roomId, @RequestBody() ImageModel imageModel) throws Exception{
    	//obrisat sve ako treba jer bugaStrign
    	String cloudName = "dacid3ish";
    	String apiKey = "395382115388869";
    	String apiSecret = "kEPDIlIhu1_sPsS2mzjfwce-7ZY";
    	
    	String[] imgArray = imageModel.getUrlsInDatabase();
    	String newImage = imageModel.getImgUrl();
    	Integer imgToEdit = imageModel.getImageToEdit();
    	
    	String arrayToUpload = "";
    
    	
    	Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
    			  "cloud_name", "dacid3ish",
    			  "api_key", "395382115388869",
    			  "api_secret", "kEPDIlIhu1_sPsS2mzjfwce-7ZY"));

    	Map response = cloudinary.uploader().upload(newImage, 
    			  ObjectUtils.asMap("public_id", "go2balkan/room"));
    	
    	
    	String url = (String) response.get("secure_url");
    	
    	System.out.println("secure url: " + response.get("secure_url"));
    	
    	System.out.println("ispod ispis  "+ imgToEdit + "  imgarraylength  " + imgArray.length);
    	
    	
    	
    	for(int i=0;i<imgArray.length;i++) {
    		
    		if(i!= imgToEdit && imgToEdit>=0)
    			arrayToUpload +=  i!=imgArray.length - 1 ? imgArray[i] + "," : imgArray[i];
    		else if(i== imgToEdit && imgToEdit>=0 )
    			arrayToUpload +=  i!=imgArray.length - 1 ? url +  "," : url ;
    		else
    			arrayToUpload +=  i!=imgArray.length - 1 ? imgArray[i] + "," : imgArray[i];
    		System.out.println(arrayToUpload);
    		System.out.println();
    	}
    	
    	if(imgToEdit==-1)
    		arrayToUpload += ',' + url;
    	
    	
    	
    	System.out.println("string for upload:  " + arrayToUpload);
    	
    	Integer pom = 48;
    	Long rId = new Long(48);
    	
    	
		return new ResponseEntity<>(
				accommodationRoomTypeService.saveOrUpdateRoomPictureById(arrayToUpload, roomId),
				HttpStatus.OK);
    	
    }

}
