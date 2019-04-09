package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_breakfast_types database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_breakfast_types")
@NamedQuery(name="CbAccommodationBreakfastType.findAll", query="SELECT c FROM CbAccommodationBreakfastType c")
public class CbAccommodationBreakfastType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="breakfast_type")
	private String breakfastType;

	public CbAccommodationBreakfastType() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBreakfastType() {
		return this.breakfastType;
	}

	public void setBreakfastType(String breakfastType) {
		this.breakfastType = breakfastType;
	}

}