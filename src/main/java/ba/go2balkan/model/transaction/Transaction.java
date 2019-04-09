package ba.go2balkan.model.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("transaction")
public class Transaction {
	// buyer
	@XmlAttribute(required = true, name = "ch-full-name")
	@JsonProperty("ch-full-name")
	private String fullName;
	@XmlAttribute(required = true, name = "ch-address")
	@JsonProperty("ch-address")
	private String address;
	@XmlAttribute(required = true, name = "ch-city")
	@JsonProperty("ch-city")
	private String city;
	@XmlAttribute(required = true, name = "ch_zip")
	@JsonProperty("ch-zip")
	private String zipCode;
	@XmlAttribute(required = true, name = "ch-country")
	@JsonProperty("ch-country")
	private String country;
	@XmlAttribute(required = true, name = "ch-phone")
	@JsonProperty("ch-phone")
	private String phone;
	@XmlAttribute(required = true, name = "ch-email")
	@JsonProperty("ch-email")
	private String email;

	// cardDetails
	@XmlAttribute(required = true)
	private String pan;
	@XmlAttribute(required = true)
	private String cvv;
	@XmlAttribute(required = true, name = "expiration-date")
	@JsonProperty("expiration-date")
	private String expDate; // (YYMM) format

	// orderDetails
	@XmlAttribute(required = true, name="order-info")
	@JsonProperty("order-info")
	private String orderInfo;
	@XmlAttribute(required = true, name="order-number")
	@JsonProperty("order-number")
	private String orderNumber;
	@XmlAttribute(required = true)
	private String amount;
	@XmlAttribute(required = true)
	private String currency;

	// processindgData
	@XmlAttribute(required = true)
	private String ip;
	@XmlAttribute(required = true)
	private String language;
	@XmlAttribute(required = true, name="transaction-type")
	@JsonProperty("transaction-type")
	private String transType;
	@XmlAttribute(required = true, name="authenticity-token")
	@JsonProperty("authenticity-token")
	private String authToken;
	@XmlAttribute(required = true)
	private String digest;

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getOrderInfo() {
		return orderInfo;
	}

	public void setOrderInfo(String orderInfo) {
		this.orderInfo = orderInfo;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getAuthToken() {
		return authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getDigest() {
		return digest;
	}

	public void setDigest(String digest) {
		this.digest = digest;
	}

//	public String getNumOfInstallments() {
//		return numOfInstallments;
//	}
//
//	public void setNumOfInstallments(String numOfInstallments) {
//		this.numOfInstallments = numOfInstallments;
//	}
//
//	public boolean isMoto() {
//		return moto;
//	}
//
//	public void setMoto(boolean moto) {
//		this.moto = moto;
//	}

}
