package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_business_facilities database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_business_facilities")
@NamedQuery(name="CbAccommodationBusinessFacility.findAll", query="SELECT c FROM CbAccommodationBusinessFacility c")
public class CbAccommodationBusinessFacility implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Column(name="facility_name")
	private String facilityName;

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationBusinessFacility() {
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

	public String getFacilityName() {
		return this.facilityName;
	}

	public void setFacilityName(String facilityName) {
		this.facilityName = facilityName;
	}

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}