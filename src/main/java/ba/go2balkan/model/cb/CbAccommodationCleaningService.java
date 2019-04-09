package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_accommodation_cleaning_services database table.
 * 
 */
@Entity
@Table(name="cb_accommodation_cleaning_services")
@NamedQuery(name="CbAccommodationCleaningService.findAll", query="SELECT c FROM CbAccommodationCleaningService c")
public class CbAccommodationCleaningService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Column(name="option_payable")
	private Boolean optionPayable;

	@Column(name="service_name")
	private String serviceName;

	public CbAccommodationCleaningService() {
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

	public Boolean getOptionPayable() {
		return this.optionPayable;
	}

	public void setOptionPayable(Boolean optionPayable) {
		this.optionPayable = optionPayable;
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

}