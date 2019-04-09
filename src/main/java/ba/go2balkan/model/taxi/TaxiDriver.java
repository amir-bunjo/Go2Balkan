package ba.go2balkan.model.taxi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the taxi_drivers database table.
 * 
 */
@Entity
@Table(name="taxi_drivers")
@NamedQuery(name="TaxiDriver.findAll", query="SELECT t FROM TaxiDriver t")
public class TaxiDriver implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="bank_account")
	private String bankAccount;

	@Column(name="bank_name")
	private String bankName;

	private String email;

	private String mobile;

	private String name;

	private String phone;

	private String surname;

	//bi-directional many-to-one association to TaxiCompany
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="taxi_company")
	private TaxiCompany taxiCompanyBean;

	//bi-directional many-to-one association to TaxiService
	@OneToMany(mappedBy="taxiDriver")
	private Set<TaxiService> taxiServices;

	public TaxiDriver() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public TaxiCompany getTaxiCompanyBean() {
		return this.taxiCompanyBean;
	}

	public void setTaxiCompanyBean(TaxiCompany taxiCompanyBean) {
		this.taxiCompanyBean = taxiCompanyBean;
	}

	public Set<TaxiService> getTaxiServices() {
		return this.taxiServices;
	}

	public void setTaxiServices(Set<TaxiService> taxiServices) {
		this.taxiServices = taxiServices;
	}

	public TaxiService addTaxiService(TaxiService taxiService) {
		getTaxiServices().add(taxiService);
		taxiService.setTaxiDriver(this);

		return taxiService;
	}

	public TaxiService removeTaxiService(TaxiService taxiService) {
		getTaxiServices().remove(taxiService);
		taxiService.setTaxiDriver(null);

		return taxiService;
	}

}