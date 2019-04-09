package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_media_tech database table.
 * 
 */
@Entity
@Table(name="cb_room_media_tech")
@NamedQuery(name="CbRoomMediaTech.findAll", query="SELECT c FROM CbRoomMediaTech c")
public class CbRoomMediaTech implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Lob
	@Column(name="amenity_icon")
	private byte[] amenityIcon;

	@Column(name="amenity_name")
	private String amenityName;

	public CbRoomMediaTech() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
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