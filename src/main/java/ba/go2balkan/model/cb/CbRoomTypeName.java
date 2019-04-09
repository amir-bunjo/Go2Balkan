package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


/**
 * The persistent class for the cb_room_type_names database table.
 * 
 */
@Entity
@Table(name="cb_room_type_names")
@NamedQuery(name="CbRoomTypeName.findAll", query="SELECT c FROM CbRoomTypeName c")
public class CbRoomTypeName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	@Column(name="room_type_name")
	private String roomTypeName;

	//bi-directional many-to-one association to CbRoomType
	@ManyToOne
	@JoinColumn(name="room_type")
	@JsonBackReference
	private CbRoomType cbRoomType;

	public CbRoomTypeName() {
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getRoomTypeName() {
		return this.roomTypeName;
	}

	public void setRoomTypeName(String roomTypeName) {
		this.roomTypeName = roomTypeName;
	}

	public CbRoomType getCbRoomType() {
		return this.cbRoomType;
	}

	public void setCbRoomType(CbRoomType cbRoomType) {
		this.cbRoomType = cbRoomType;
	}

}