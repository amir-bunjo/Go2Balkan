package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_surroundings database table.
 * 
 */
@Entity
@Table(name="cb_surroundings")
@NamedQuery(name="CbSurrounding.findAll", query="SELECT c FROM CbSurrounding c")
public class CbSurrounding implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Short id;

	@Column(name="surrounding_icon")
	private String surroundingIcon;

	@Column(name="surrounding_name")
	private String surroundingName;

	public CbSurrounding() {
	}

	public Short getId() {
		return this.id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getSurroundingIcon() {
		return this.surroundingIcon;
	}

	public void setSurroundingIcon(String surroundingIcon) {
		this.surroundingIcon = surroundingIcon;
	}

	public String getSurroundingName() {
		return this.surroundingName;
	}

	public void setSurroundingName(String surroundingName) {
		this.surroundingName = surroundingName;
	}

}