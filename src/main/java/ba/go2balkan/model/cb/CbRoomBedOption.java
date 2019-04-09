package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_bed_options database table.
 * 
 */
@Entity
@Table(name="cb_room_bed_options")
@NamedQuery(name="CbRoomBedOption.findAll", query="SELECT c FROM CbRoomBedOption c")
public class CbRoomBedOption implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="bed_option_capacity")
	private byte bedOptionCapacity;

	@Column(name="bed_option_icon")
	private String bedOptionIcon;

	@Column(name="bed_option_name")
	private String bedOptionName;

	public CbRoomBedOption() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public byte getBedOptionCapacity() {
		return this.bedOptionCapacity;
	}

	public void setBedOptionCapacity(byte bedOptionCapacity) {
		this.bedOptionCapacity = bedOptionCapacity;
	}

	public String getBedOptionIcon() {
		return this.bedOptionIcon;
	}

	public void setBedOptionIcon(String bedOptionIcon) {
		this.bedOptionIcon = bedOptionIcon;
	}

	public String getBedOptionName() {
		return this.bedOptionName;
	}

	public void setBedOptionName(String bedOptionName) {
		this.bedOptionName = bedOptionName;
	}

}