package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.Set;


/**
 * The persistent class for the cb_room_types database table.
 * 
 */
@Entity
@Table(name="cb_room_types")
@NamedQuery(name="CbRoomType.findAll", query="SELECT c FROM CbRoomType c")
public class CbRoomType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	@Column(name="has_bathrooms")
	private Boolean hasBathrooms;

	@Column(name="has_bedrooms")
	private Boolean hasBedrooms;

	@Column(name="has_livingrooms")
	private Boolean hasLivingrooms;

	@Column(name="room_type")
	private String roomType;

	//bi-directional many-to-one association to CbRoomTypeName
	@OneToMany(mappedBy="cbRoomType")
	@JsonManagedReference
	private Set<CbRoomTypeName> cbRoomTypeNames;

	public CbRoomType() {
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public Boolean getHasBathrooms() {
		return this.hasBathrooms;
	}

	public void setHasBathrooms(Boolean hasBathrooms) {
		this.hasBathrooms = hasBathrooms;
	}

	public Boolean getHasBedrooms() {
		return this.hasBedrooms;
	}

	public void setHasBedrooms(Boolean hasBedrooms) {
		this.hasBedrooms = hasBedrooms;
	}

	public Boolean getHasLivingrooms() {
		return this.hasLivingrooms;
	}

	public void setHasLivingrooms(Boolean hasLivingrooms) {
		this.hasLivingrooms = hasLivingrooms;
	}

	public String getRoomType() {
		return this.roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public Set<CbRoomTypeName> getCbRoomTypeNames() {
		return this.cbRoomTypeNames;
	}

	public void setCbRoomTypeNames(Set<CbRoomTypeName> cbRoomTypeNames) {
		this.cbRoomTypeNames = cbRoomTypeNames;
	}

	public CbRoomTypeName addCbRoomTypeName(CbRoomTypeName cbRoomTypeName) {
		getCbRoomTypeNames().add(cbRoomTypeName);
		cbRoomTypeName.setCbRoomType(this);

		return cbRoomTypeName;
	}

	public CbRoomTypeName removeCbRoomTypeName(CbRoomTypeName cbRoomTypeName) {
		getCbRoomTypeNames().remove(cbRoomTypeName);
		cbRoomTypeName.setCbRoomType(null);

		return cbRoomTypeName;
	}

}