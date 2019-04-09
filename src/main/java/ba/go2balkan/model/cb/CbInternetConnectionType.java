package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_internet_connection_type database table.
 * 
 */
@Entity
@Table(name="cb_internet_connection_type")
@NamedQuery(name="CbInternetConnectionType.findAll", query="SELECT c FROM CbInternetConnectionType c")
public class CbInternetConnectionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="connection_type")
	private String connectionType;

	public CbInternetConnectionType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getConnectionType() {
		return this.connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

}