package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_vat_rates database table.
 * 
 */
@Entity
@Table(name="cb_vat_rates")
@NamedQuery(name="CbVatRate.findAll", query="SELECT c FROM CbVatRate c")
public class CbVatRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	private Integer location;

	@Column(name="vat_rate")
	private Float vatRate;

	@Column(name="vat_rate_name")
	private String vatRateName;

	public CbVatRate() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public Integer getLocation() {
		return this.location;
	}

	public void setLocation(Integer location) {
		this.location = location;
	}

	public Float getVatRate() {
		return this.vatRate;
	}

	public void setVatRate(Float vatRate) {
		this.vatRate = vatRate;
	}

	public String getVatRateName() {
		return this.vatRateName;
	}

	public void setVatRateName(String vatRateName) {
		this.vatRateName = vatRateName;
	}

}