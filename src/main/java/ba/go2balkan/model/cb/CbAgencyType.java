package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_agency_types database table.
 * 
 */
@Entity
@Table(name="cb_agency_types")
@NamedQuery(name="CbAgencyType.findAll", query="SELECT c FROM CbAgencyType c")
public class CbAgencyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="type_name")
	private String typeName;

	public CbAgencyType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

}