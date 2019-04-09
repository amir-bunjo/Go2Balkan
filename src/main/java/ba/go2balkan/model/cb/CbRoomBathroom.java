package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_bathroom database table.
 * 
 */
@Entity
@Table(name="cb_room_bathroom")
@NamedQuery(name="CbRoomBathroom.findAll", query="SELECT c FROM CbRoomBathroom c")
public class CbRoomBathroom implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Lob
	@Column(name="amenity_icon")
	private byte[] amenityIcon;

	@Column(name="amenity_name")
	private String amenityName;

	public CbRoomBathroom() {
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

	public byte[] getAmenityIcon() {
		return this.amenityIcon;
	}

	public void setAmenityIcon(byte[] amenityIcon) {
		this.amenityIcon = amenityIcon;
	}

	public String getAmenityName() {
		return this.amenityName;
	}

	public void setAmenityName(String amenityName) {
		this.amenityName = amenityName;
	}

}