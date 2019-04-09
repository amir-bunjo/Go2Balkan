package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_internet_connection_location database table.
 * 
 */
@Entity
@Table(name="cb_internet_connection_location")
@NamedQuery(name="CbInternetConnectionLocation.findAll", query="SELECT c FROM CbInternetConnectionLocation c")
public class CbInternetConnectionLocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="location_name")
	private String locationName;

	public CbInternetConnectionLocation() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getLocationName() {
		return this.locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

}