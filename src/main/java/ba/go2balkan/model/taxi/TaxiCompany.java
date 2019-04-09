package ba.go2balkan.model.taxi;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the taxi_companies database table.
 * 
 */
@Entity
@Table(name="taxi_companies")
@NamedQuery(name="TaxiCompany.findAll", query="SELECT t FROM TaxiCompany t")
public class TaxiCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="account_number")
	private String accountNumber;

	private String address;

	@Column(name="bank_name")
	private String bankName;

	private java.math.BigInteger city;

	@Column(name="contact_person")
	private String contactPerson;

	private String email;

	private String fax;

	@Column(name="id_number")
	private String idNumber;

	@Lob
	private byte[] logo;

	private String mobile;

	private String name;

	private String phone;

	@Column(name="tax_number")
	private String taxNumber;

	private String web;

	//bi-directional many-to-one association to TaxiDriver
	@OneToMany(mappedBy="taxiCompanyBean")
	private Set<TaxiDriver> taxiDrivers;

	//bi-directional many-to-one association to TaxiService
	@OneToMany(mappedBy="taxiCompanyBean")
	private Set<TaxiService> taxiServices;

	public TaxiCompany() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public java.math.BigInteger getCity() {
		return this.city;
	}

	public void setCity(java.math.BigInteger city) {
		this.city = city;
	}

	public String getContactPerson() {
		return this.contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getIdNumber() {
		return this.idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public byte[] getLogo() {
		return this.logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
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

	public String getTaxNumber() {
		return this.taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public Set<TaxiDriver> getTaxiDrivers() {
		return this.taxiDrivers;
	}

	public void setTaxiDrivers(Set<TaxiDriver> taxiDrivers) {
		this.taxiDrivers = taxiDrivers;
	}

	public TaxiDriver addTaxiDriver(TaxiDriver taxiDriver) {
		getTaxiDrivers().add(taxiDriver);
		taxiDriver.setTaxiCompanyBean(this);

		return taxiDriver;
	}

	public TaxiDriver removeTaxiDriver(TaxiDriver taxiDriver) {
		getTaxiDrivers().remove(taxiDriver);
		taxiDriver.setTaxiCompanyBean(null);

		return taxiDriver;
	}

	public Set<TaxiService> getTaxiServices() {
		return this.taxiServices;
	}

	public void setTaxiServices(Set<TaxiService> taxiServices) {
		this.taxiServices = taxiServices;
	}

	public TaxiService addTaxiService(TaxiService taxiService) {
		getTaxiServices().add(taxiService);
		taxiService.setTaxiCompanyBean(this);

		return taxiService;
	}

	public TaxiService removeTaxiService(TaxiService taxiService) {
		getTaxiServices().remove(taxiService);
		taxiService.setTaxiCompanyBean(null);

		return taxiService;
	}

}