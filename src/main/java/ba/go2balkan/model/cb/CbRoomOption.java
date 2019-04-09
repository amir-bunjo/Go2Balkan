package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_options database table.
 * 
 */
@Entity
@Table(name="cb_room_options")
@NamedQuery(name="CbRoomOption.findAll", query="SELECT c FROM CbRoomOption c")
public class CbRoomOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Lob
	@Column(name="option_icon")
	private byte[] optionIcon;

	@Column(name="option_name")
	private String optionName;

	@Lob
	@Column(name="service_icon")
	private byte[] serviceIcon;

	@Column(name="service_name")
	private String serviceName;

	public CbRoomOption() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public byte[] getOptionIcon() {
		return this.optionIcon;
	}

	public void setOptionIcon(byte[] optionIcon) {
		this.optionIcon = optionIcon;
	}

	public String getOptionName() {
		return this.optionName;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
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