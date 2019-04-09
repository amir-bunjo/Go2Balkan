package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_room_outdoor_view database table.
 * 
 */
@Entity
@Table(name="cb_room_outdoor_view")
@NamedQuery(name="CbRoomOutdoorView.findAll", query="SELECT c FROM CbRoomOutdoorView c")
public class CbRoomOutdoorView implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Lob
	@Column(name="view_icon")
	private byte[] viewIcon;

	@Column(name="view_name")
	private String viewName;

	public CbRoomOutdoorView() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public byte[] getViewIcon() {
		return this.viewIcon;
	}

	public void setViewIcon(byte[] viewIcon) {
		this.viewIcon = viewIcon;
	}

	public String getViewName() {
		return this.viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}