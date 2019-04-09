package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_service_availability database table.
 * 
 */
@Entity
@Table(name="cb_service_availability")
@NamedQuery(name="CbServiceAvailability.findAll", query="SELECT c FROM CbServiceAvailability c")
public class CbServiceAvailability implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="availability_name")
	private String availabilityName;

	@Column(name="breakfast_availability_name")
	private String breakfastAvailabilityName;

	@Column(name="pets_allowed")
	private String petsAllowed;

	public CbServiceAvailability() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getAvailabilityName() {
		return this.availabilityName;
	}

	public void setAvailabilityName(String availabilityName) {
		this.availabilityName = availabilityName;
	}

	public String getBreakfastAvailabilityName() {
		return this.breakfastAvailabilityName;
	}

	public void setBreakfastAvailabilityName(String breakfastAvailabilityName) {
		this.breakfastAvailabilityName = breakfastAvailabilityName;
	}

	public String getPetsAllowed() {
		return this.petsAllowed;
	}

	public void setPetsAllowed(String petsAllowed) {
		this.petsAllowed = petsAllowed;
	}

}