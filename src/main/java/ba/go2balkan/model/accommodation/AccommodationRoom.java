package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accommodation_rooms database table.
 * 
 */
@Entity
@Table(name="accommodation_rooms")
@NamedQuery(name="AccommodationRoom.findAll", query="SELECT a FROM AccommodationRoom a")
public class AccommodationRoom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	private String beds;

	@Column(name="custom_id")
	private String customId;

	private String extrabeds;

	@Column(name="floor_no")
	private Integer floorNo;

	@Column(name="outdoor_view")
	private String outdoorView;

	@Column(name="room_capacity")
	private Integer roomCapacity;

	@Column(name="room_custom_name")
	private String roomCustomName;

	@Column(name="room_description")
	private String roomDescription;

	@Column(name="room_name")
	private String roomName;

	@Column(name="room_no")
	private String roomNo;

	@Column(name="room_notes")
	private String roomNotes;

	@Column(name="room_short_name")
	private String roomShortName;

	@Column(name="room_size")
	private Float roomSize;

	@Column(name="room_type")
	private Integer roomType;

	@Column(name="room_x")
	private String roomX;

	@Column(name="room_y")
	private String roomY;

	@Column(name="smoking_allowed")
	private Boolean smokingAllowed;

	public AccommodationRoom() {
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

	public String getExtrabeds() {
		return this.extrabeds;
	}

	public void setExtrabeds(String extrabeds) {
		this.extrabeds = extrabeds;
	}

	public Integer getFloorNo() {
		return this.floorNo;
	}

	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}

	public String getOutdoorView() {
		return this.outdoorView;
	}

	public void setOutdoorView(String outdoorView) {
		this.outdoorView = outdoorView;
	}

	public Integer getRoomCapacity() {
		return this.roomCapacity;
	}

	public void setRoomCapacity(Integer roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public String getRoomCustomName() {
		return this.roomCustomName;
	}

	public void setRoomCustomName(String roomCustomName) {
		this.roomCustomName = roomCustomName;
	}

	public String getRoomDescription() {
		return this.roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public String getRoomName() {
		return this.roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomNo() {
		return this.roomNo;
	}

	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	public String getRoomNotes() {
		return this.roomNotes;
	}

	public void setRoomNotes(String roomNotes) {
		this.roomNotes = roomNotes;
	}

	public String getRoomShortName() {
		return this.roomShortName;
	}

	public void setRoomShortName(String roomShortName) {
		this.roomShortName = roomShortName;
	}

	public Float getRoomSize() {
		return this.roomSize;
	}

	public void setRoomSize(Float roomSize) {
		this.roomSize = roomSize;
	}

	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public String getRoomX() {
		return this.roomX;
	}

	public void setRoomX(String roomX) {
		this.roomX = roomX;
	}

	public String getRoomY() {
		return this.roomY;
	}

	public void setRoomY(String roomY) {
		this.roomY = roomY;
	}

	public Boolean getSmokingAllowed() {
		return this.smokingAllowed;
	}

	public void setSmokingAllowed(Boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}

}