package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_transportation database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_transportation")
@NamedQuery(name="CbAccommodationTransportation.findAll", query="SELECT c FROM CbAccommodationTransportation c")
public class CbAccommodationTransportation implements Serializable {
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

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationTransportation() {
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

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}