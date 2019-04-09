package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_amenities database table.
 * 
 */
@Entity
@Table(name="cb_room_amenities")
@NamedQuery(name="CbRoomAmenity.findAll", query="SELECT c FROM CbRoomAmenity c")
public class CbRoomAmenity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	private Integer accommodation;

	@Column(name="amenity_icon")
	private String amenityIcon;

	@Column(name="amenity_name")
	private String amenityName;

	public CbRoomAmenity() {
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Integer getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(Integer accommodation) {
		this.accommodation = accommodation;
	}

	public String getAmenityIcon() {
		return this.amenityIcon;
	}

	public void setAmenityIcon(String amenityIcon) {
		this.amenityIcon = amenityIcon;
	}

	public String getAmenityName() {
		return this.amenityName;
	}

	public void setAmenityName(String amenityName) {
		this.amenityName = amenityName;
	}

}