package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_extrabed_client_types database table.
 * 
 */
@Entity
@Table(name="cb_room_extrabed_client_types")
@NamedQuery(name="CbRoomExtrabedClientType.findAll", query="SELECT c FROM CbRoomExtrabedClientType c")
public class CbRoomExtrabedClientType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="clienttype_name")
	private String clienttypeName;

	private String note;

	public CbRoomExtrabedClientType() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getClienttypeName() {
		return this.clienttypeName;
	}

	public void setClienttypeName(String clienttypeName) {
		this.clienttypeName = clienttypeName;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

}