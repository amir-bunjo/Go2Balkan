package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_bed_preferences database table.
 * 
 */
@Entity
@Table(name="cb_bed_preferences")
@NamedQuery(name="CbBedPreference.findAll", query="SELECT c FROM CbBedPreference c")
public class CbBedPreference implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="preference1_capacity")
	private byte preference1Capacity;

	@Column(name="preference1_name")
	private String preference1Name;

	@Column(name="preference2_capacity")
	private byte preference2Capacity;

	@Column(name="preference2_name")
	private String preference2Name;

	public CbBedPreference() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public byte getPreference1Capacity() {
		return this.preference1Capacity;
	}

	public void setPreference1Capacity(byte preference1Capacity) {
		this.preference1Capacity = preference1Capacity;
	}

	public String getPreference1Name() {
		return this.preference1Name;
	}

	public void setPreference1Name(String preference1Name) {
		this.preference1Name = preference1Name;
	}

	public byte getPreference2Capacity() {
		return this.preference2Capacity;
	}

	public void setPreference2Capacity(byte preference2Capacity) {
		this.preference2Capacity = preference2Capacity;
	}

	public String getPreference2Name() {
		return this.preference2Name;
	}

	public void setPreference2Name(String preference2Name) {
		this.preference2Name = preference2Name;
	}

}