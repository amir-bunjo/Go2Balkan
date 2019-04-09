package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_staff_language database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_staff_language")
@NamedQuery(name="CbAccommodationStaffLanguage.findAll", query="SELECT c FROM CbAccommodationStaffLanguage c")
public class CbAccommodationStaffLanguage implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private String code;

	@Column(name="language_type")
	private String languageType;

	public CbAccommodationStaffLanguage() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLanguageType() {
		return this.languageType;
	}

	public void setLanguageType(String languageType) {
		this.languageType = languageType;
	}

}