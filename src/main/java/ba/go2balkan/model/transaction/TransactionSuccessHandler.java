package ba.go2balkan.model.transaction;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "transaction")
//@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName("transaction")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TransactionSuccessHandler implements Serializable {

	 // This class handles success-return from PikPay. 
	private static final long serialVersionUID = 1L;
	@JacksonXmlProperty(isAttribute = true, localName="acquirer")
	@JsonProperty("acquirer")
	private String acquirer;
    @JacksonXmlProperty(isAttribute = true, localName="acsv nil")
	@JsonProperty("acsv nil")
	private String acsv;
    @JacksonXmlProperty(isAttribute = true, localName="amount")
	@JsonProperty("amount")
	private String amount;
	@JacksonXmlProperty(isAttribute = true, localName="approval-code")
	@JsonProperty("approval-code")
	private String approvalCode;
	@JacksonXmlProperty(isAttribute = true, localName="cc-type")
	@JsonProperty("cc-type")
	private String ccType;
	@JacksonXmlProperty(isAttribute = true, localName="created-at")
	@JsonProperty("created-at")
	private String createdAt;
	@JacksonXmlProperty(isAttribute = true, localName="currency")
	@JsonProperty("currency")
	private String currency;
	@JacksonXmlProperty(isAttribute = true, localName="eci")
	@JsonProperty("eci")
	private String eci;
	@JacksonXmlProperty(isAttribute = true, localName="id")
	@JsonProperty("id")
	private String id;
	@JacksonXmlProperty(isAttribute = true, localName="order-number")
	@JsonProperty("order-number")
	private String orderNumber;
	@JacksonXmlProperty(isAttribute = true, localName="outgoing-amount")
	@JsonProperty("outgoing-amount")
	private String outgoingAmount;
	@JacksonXmlProperty(isAttribute = true, localName="outgoing-currency")
	@JsonProperty("outgoing-currency")
	private String outgoingCurrency;
	@JacksonXmlProperty(isAttribute = true, localName="reference-number")
	@JsonProperty("reference-number")
	private String referenceNumber;
	@JacksonXmlProperty(isAttribute = true, localName="response-code")
	@JsonProperty("response-code")
	private String responseCode;
	@JacksonXmlProperty(isAttribute = true, localName="response-message")
	@JsonProperty("response-message")
	private String responseMessage;
	@JacksonXmlProperty(isAttribute = true, localName="status")
	@JsonProperty("status")
	private String status;
	@JacksonXmlProperty(isAttribute = true, localName="systan")
	@JsonProperty("systan")
	private String systan;
	@JacksonXmlProperty(isAttribute = true, localName="xid nil")
	@JsonProperty("xid nil")
	private String xid;
	@JacksonXmlProperty(isAttribute = true, localName="enrollment")
	@JsonProperty("enrollment")
	private String enrollment;
	@JacksonXmlProperty(isAttribute = true, localName="authentication nil")
	@JsonProperty("authentication nil")
	private String authenticationN;
//	@JacksonXmlProperty(isAttribute = true, localName="pan-token")
//	@JsonProperty("pan-token")
//	private String panToken;
	@JacksonXmlProperty(isAttribute = true, localName="transaction-type")
	@JsonProperty("transaction-type")
	private String transType;
	public String getAcquirer() {
		return acquirer;
	}
	public void setAcquirer(String acquirer) {
		this.acquirer = acquirer;
	}
	public String getAcsv() {
		return acsv;
	}
	public void setAcsv(String acsv) {
		this.acsv = acsv;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getApprovalCode() {
		return approvalCode;
	}
	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}
	public String getCcType() {
		return ccType;
	}
	public void setCcType(String ccType) {
		this.ccType = ccType;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getEci() {
		return eci;
	}
	public void setEci(String eci) {
		this.eci = eci;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getOutgoingAmount() {
		return outgoingAmount;
	}
	public void setOutgoingAmount(String outgoingAmount) {
		this.outgoingAmount = outgoingAmount;
	}
	public String getOutgoingCurrency() {
		return outgoingCurrency;
	}
	public void setOutgoingCurrency(String outgoingCurrency) {
		this.outgoingCurrency = outgoingCurrency;
	}
	public String getReferenceNumber() {
		return referenceNumber;
	}
	public void setReferenceNumber(String referenceNumber) {
		this.referenceNumber = referenceNumber;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSystan() {
		return systan;
	}
	public void setSystan(String systan) {
		this.systan = systan;
	}
	public String getXid() {
		return xid;
	}
	public void setXid(String xid) {
		this.xid = xid;
	}
	public String getEnrollment() {
		return enrollment;
	}
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}
	public String getAuthenticationN() {
		return authenticationN;
	}
	public void setAuthenticationN(String authenticationN) {
		this.authenticationN = authenticationN;
	}
//	public String getPanToken() {
//		return panToken;
//	}
//	public void setPanToken(String panToken) {
//		this.panToken = panToken;
//	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}

}
