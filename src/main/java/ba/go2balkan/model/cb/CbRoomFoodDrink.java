package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_food_drinks database table.
 * 
 */
@Entity
@Table(name="cb_room_food_drinks")
@NamedQuery(name="CbRoomFoodDrink.findAll", query="SELECT c FROM CbRoomFoodDrink c")
public class CbRoomFoodDrink implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	@Lob
	@Column(name="amenity_icon")
	private byte[] amenityIcon;

	@Column(name="amenity_name")
	private String amenityName;

	public CbRoomFoodDrink() {
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
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