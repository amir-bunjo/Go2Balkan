package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_miscellaneous database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_miscellaneous")
@NamedQuery(name="CbAccommodationMiscellaneous.findAll", query="SELECT c FROM CbAccommodationMiscellaneous c")
public class CbAccommodationMiscellaneous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Column(name="option_name")
	private String optionName;

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationMiscellaneous() {
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

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}