package ba.go2balkan.model.accommodation;

public class ImageModel {
	
	private String imgUrl;
	private String[] urlsInDatabase;
	private Integer imageToEdit;
	
	public Integer getImageToEdit() {
		return imageToEdit;
	}
	public void setImageToEdit(Integer imageToEdit) {
		this.imageToEdit = imageToEdit;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public String[] getUrlsInDatabase() {
		return urlsInDatabase;
	}
	public void setUrlsInDatabase(String[] urlsInDatabase) {
		this.urlsInDatabase = urlsInDatabase;
	}
	
	
	
}
