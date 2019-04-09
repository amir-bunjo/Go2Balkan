package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_city_tax_types database table.
 * 
 */
@Entity
@Table(name="cb_city_tax_types")
@NamedQuery(name="CbCityTaxType.findAll", query="SELECT c FROM CbCityTaxType c")
public class CbCityTaxType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="tax_type")
	private String taxType;

	public CbCityTaxType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getTaxType() {
		return this.taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}