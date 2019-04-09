package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_types database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_types")
@NamedQuery(name="CbAccommodationType.findAll", query="SELECT c FROM CbAccommodationType c")
public class CbAccommodationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="rent_type")
	private String rentType;

	@Column(name="type_name")
	private String typeName;

	public CbAccommodationType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getRentType() {
		return this.rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}