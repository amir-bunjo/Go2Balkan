package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_account_types database table.
 * 
 */
@Entity
@Table(name="cb_account_types")
@NamedQuery(name="CbAccountType.findAll", query="SELECT c FROM CbAccountType c")
public class CbAccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="type_name")
	private String typeName;

	@Column(name="type_role")
	private String typeRole;

	public CbAccountType() {
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

	public String getTypeRole() {
		return this.typeRole;
	}

	public void setTypeRole(String typeRole) {
		this.typeRole = typeRole;
	}

}