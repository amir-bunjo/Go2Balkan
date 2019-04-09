package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_client_types database table.
 * 
 */
@Entity
@Table(name="cb_client_types")
@NamedQuery(name="CbClientType.findAll", query="SELECT c FROM CbClientType c")
public class CbClientType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="client_type")
	private String clientType;

	public CbClientType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

}