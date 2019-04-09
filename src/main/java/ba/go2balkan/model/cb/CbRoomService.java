package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_services database table.
 * 
 */
@Entity
@Table(name="cb_room_services")
@NamedQuery(name="CbRoomService.findAll", query="SELECT c FROM CbRoomService c")
public class CbRoomService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Lob
	@Column(name="service_icon")
	private byte[] serviceIcon;

	@Column(name="service_name")
	private String serviceName;

	public CbRoomService() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public byte[] getServiceIcon() {
		return this.serviceIcon;
	}

	public void setServiceIcon(byte[] serviceIcon) {
		this.serviceIcon = serviceIcon;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}