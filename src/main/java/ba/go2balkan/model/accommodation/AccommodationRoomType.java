package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accommodation_room_types database table.
 * 
 */
@Entity
@Table(name="accommodation_room_types")
@NamedQuery(name="AccommodationRoomType.findAll", query="SELECT a FROM AccommodationRoomType a")
public class AccommodationRoomType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	private String beds;

	@Column(name="custom_id")
	private String customId;

	private String description;

	private String extrabeds;

	@Column(name="number_of_rooms")
	private Integer numberOfRooms;

	@Column(name="options_amenities")
	private String optionsAmenities;

	@Column(name="options_bathroom")
	private String optionsBathroom;

	@Column(name="options_food_drinks")
	private String optionsFoodDrinks;

	@Column(name="options_media_tech")
	private String optionsMediaTech;

	@Column(name="options_outdoor_views")
	private String optionsOutdoorViews;

	@Column(name="promo_pic")
	private String promoPic;

	@Column(name="room_capacity")
	private Integer roomCapacity;

	@Column(name="room_choices")
	private String roomChoices;

	@Column(name="room_name")
	private String roomName;

	@Column(name="room_pics")
	private String roomPics;

	@Column(name="room_services")
	private String roomServices;

	@Column(name="room_type")
	private String roomType;

	private Float size;

	@Column(name="smoking_allowed")
	private Boolean smokingAllowed;

	public AccommodationRoomType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(Integer accommodation) {
		this.accommodation = accommodation;
	}

	public String getBeds() {
		return this.beds;
	}

	public void setBeds(String beds) {
		this.beds = beds;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getExtrabeds() {
		return this.extrabeds;
	}

	public void setExtrabeds(String extrabeds) {
		this.extrabeds = extrabeds;
	}

	public Integer getNumberOfRooms() {
		return this.numberOfRooms;
	}

	public void setNumberOfRooms(Integer numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getOptionsAmenities() {
		return this.optionsAmenities;
	}

	public void setOptionsAmenities(String optionsAmenities) {
		this.optionsAmenities = optionsAmenities;
	}

	public String getOptionsBathroom() {
		return this.optionsBathroom;
	}

	public void setOptionsBathroom(String optionsBathroom) {
		this.optionsBathroom = optionsBathroom;
	}

	public String getOptionsFoodDrinks() {
		return this.optionsFoodDrinks;
	}

	public void setOptionsFoodDrinks(String optionsFoodDrinks) {
		this.optionsFoodDrinks = optionsFoodDrinks;
	}

	public String getOptionsMediaTech() {
		return this.optionsMediaTech;
	}

	public void setOptionsMediaTech(String optionsMediaTech) {
		this.optionsMediaTech = optionsMediaTech;
	}

	public String getOptionsOutdoorViews() {
		return this.optionsOutdoorViews;
	}

	public void setOptionsOutdoorViews(String optionsOutdoorViews) {
		this.optionsOutdoorViews = optionsOutdoorViews;
	}

	public String getPromoPic() {
		return this.promoPic;
	}

	public void setPromoPic(String promoPic) {
		this.promoPic = promoPic;
	}

	public Integer getRoomCapacity() {
		return this.roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getRoomChoices() {
		return this.roomChoices;
	}

	public void setRoomChoices(String roomChoices) {
		this.roomChoices = roomChoices;
	}

	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomPics() {
		return this.roomPics;
	}

	public void setRoomPics(String roomPics) {
		this.roomPics = roomPics;
	}

	public String getRoomServices() {
		return this.roomServices;
	}

	public void setRoomServices(String roomServices) {
		this.roomServices = roomServices;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Float getSize() {
		return this.size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public Boolean getSmokingAllowed() {
		return this.smokingAllowed;
	}

	public void setSmokingAllowed(Boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}

}