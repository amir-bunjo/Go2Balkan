package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="cb_locations")
@NamedQuery(name="CbLocation.findAll", query="SELECT c FROM CbLocation c")
public class CbLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String zip;

	private String city;
	
	private String canton;

	private String entity;

	private String state;

	private Float vat;
	
	@Column(name="city_tax")
	private Float cityTax;


	public CbLocation() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCanton() {
		return this.canton;
	}

	public void setCanton(String canton) {
		this.canton = canton;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Float getCityTax() {
		return this.cityTax;
	}

	public void setCityTax(Float cityTax) {
		this.cityTax = cityTax;
	}

	public String getEntity() {
		return this.entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Float getVat() {
		return this.vat;
	}

	public void setVat(Float vat) {
		this.vat = vat;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

}