package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_entertainment database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_entertainment")
@NamedQuery(name="CbAccommodationEntertainment.findAll", query="SELECT c FROM CbAccommodationEntertainment c")
public class CbAccommodationEntertainment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Column(name="entertainment_name")
	private String entertainmentName;

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationEntertainment() {
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

	public String getEntertainmentName() {
		return this.entertainmentName;
	}

	public void setEntertainmentName(String entertainmentName) {
		this.entertainmentName = entertainmentName;
	}

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}