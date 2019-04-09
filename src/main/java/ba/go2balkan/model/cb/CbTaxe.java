package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_taxes database table.
 * 
 */
@Entity
@Table(name="cb_taxes")
@NamedQuery(name="CbTaxe.findAll", query="SELECT c FROM CbTaxe c")
public class CbTaxe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	private Integer accommodation;

	private Integer account;

	@Column(name="fix_ammount")
	private Float fixAmmount;

	private Float percentage;

	@Column(name="tax_name")
	private String taxName;

	public CbTaxe() {
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

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Float getFixAmmount() {
		return this.fixAmmount;
	}

	public void setFixAmmount(Float fixAmmount) {
		this.fixAmmount = fixAmmount;
	}

	public Float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	public String getTaxName() {
		return this.taxName;
	}

	public void setTaxName(String taxName) {
		this.taxName = taxName;
	}

}