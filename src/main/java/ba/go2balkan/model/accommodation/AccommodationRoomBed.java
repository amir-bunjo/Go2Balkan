package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accommodation_room_beds database table.
 * 
 */
@Entity
@Table(name="accommodation_room_beds")
@NamedQuery(name="AccommodationRoomBed.findAll", query="SELECT a FROM AccommodationRoomBed a")
public class AccommodationRoomBed implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="bedroom_bed_option")
	private String bedroomBedOption;

	@Column(name="beds_num")
	private Integer bedsNum;

	private Boolean booked;

	private Integer room;

	@Column(name="room_type")
	private Integer roomType;

	public AccommodationRoomBed() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBedroomBedOption() {
		return this.bedroomBedOption;
	}

	public void setBedroomBedOption(String bedroomBedOption) {
		this.bedroomBedOption = bedroomBedOption;
	}

	public Integer getBedsNum() {
		return this.bedsNum;
	}

	public void setBedsNum(Integer bedsNum) {
		this.bedsNum = bedsNum;
	}

	public Boolean getBooked() {
		return this.booked;
	}

	public void setBooked(Boolean booked) {
		this.booked = booked;
	}

	public Integer getRoom() {
		return this.room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

}