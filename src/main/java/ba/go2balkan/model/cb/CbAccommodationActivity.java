package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_activities database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_activities")
@NamedQuery(name="CbAccommodationActivity.findAll", query="SELECT c FROM CbAccommodationActivity c")
public class CbAccommodationActivity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Lob
	@Column(name="activity_icon")
	private byte[] activityIcon;

	@Column(name="activity_name")
	private String activityName;

	@Column(name="option_payable")
	private Boolean optionPayable;

	public CbAccommodationActivity() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(Integer accommodation) {
		this.accommodation = accommodation;
	}

	public byte[] getActivityIcon() {
		return this.activityIcon;
	}

	public void setActivityIcon(byte[] activityIcon) {
		this.activityIcon = activityIcon;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

}