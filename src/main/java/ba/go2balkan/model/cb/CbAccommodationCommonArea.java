package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_common_areas database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_common_areas")
@NamedQuery(name="CbAccommodationCommonArea.findAll", query="SELECT c FROM CbAccommodationCommonArea c")
public class CbAccommodationCommonArea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Column(name="area_name")
	private String areaName;

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationCommonArea() {
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

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}