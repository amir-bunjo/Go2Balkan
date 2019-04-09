package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the cb_gratis database table.
 * 
 */
@Entity
@Table(name="cb_gratis")
@NamedQuery(name="CbGrati.findAll", query="SELECT c FROM CbGrati c")
public class CbGrati implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer account;

	@Column(name="class")
	private Integer class_;

	@Column(name="clients_no_gratis")
	private Integer clientsNoGratis;

	private String description;

	@Column(name="entry_price")
	private Float entryPrice;

	@Column(name="fitness_amount")
	private Float fitnessAmount;

	@Column(name="gratis_class")
	private int gratisClass;

	@Temporal(TemporalType.DATE)
	@Column(name="gratis_end_date")
	private Date gratisEndDate;

	@Column(name="gratis_name")
	private String gratisName;

	@Temporal(TemporalType.DATE)
	@Column(name="gratis_start_date")
	private Date gratisStartDate;

	@Column(name="gratis_type")
	private Integer gratisType;

	@Temporal(TemporalType.DATE)
	@Column(name="max_age")
	private Date maxAge;

	@Temporal(TemporalType.DATE)
	@Column(name="min_age")
	private Date minAge;

	private Integer reference;

	private String total;

	private Float vat;

	@Column(name="vat_base")
	private Float vatBase;

	public CbGrati() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Integer getClass_() {
		return this.class_;
	}

	public void setClass_(Integer class_) {
		this.class_ = class_;
	}

	public Integer getClientsNoGratis() {
		return this.clientsNoGratis;
	}

	public void setClientsNoGratis(Integer clientsNoGratis) {
		this.clientsNoGratis = clientsNoGratis;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Float getEntryPrice() {
		return this.entryPrice;
	}

	public void setEntryPrice(Float entryPrice) {
		this.entryPrice = entryPrice;
	}

	public Float getFitnessAmount() {
		return this.fitnessAmount;
	}

	public void setFitnessAmount(Float fitnessAmount) {
		this.fitnessAmount = fitnessAmount;
	}

	public int getGratisClass() {
		return this.gratisClass;
	}

	public void setGratisClass(int gratisClass) {
		this.gratisClass = gratisClass;
	}

	public Date getGratisEndDate() {
		return this.gratisEndDate;
	}

	public void setGratisEndDate(Date gratisEndDate) {
		this.gratisEndDate = gratisEndDate;
	}

	public String getGratisName() {
		return this.gratisName;
	}

	public void setGratisName(String gratisName) {
		this.gratisName = gratisName;
	}

	public Date getGratisStartDate() {
		return this.gratisStartDate;
	}

	public void setGratisStartDate(Date gratisStartDate) {
		this.gratisStartDate = gratisStartDate;
	}

	public Integer getGratisType() {
		return this.gratisType;
	}

	public void setGratisType(Integer gratisType) {
		this.gratisType = gratisType;
	}

	public Date getMaxAge() {
		return this.maxAge;
	}

	public void setMaxAge(Date maxAge) {
		this.maxAge = maxAge;
	}

	public Date getMinAge() {
		return this.minAge;
	}

	public void setMinAge(Date minAge) {
		this.minAge = minAge;
	}

	public Integer getReference() {
		return this.reference;
	}

	public void setReference(Integer reference) {
		this.reference = reference;
	}

	public String getTotal() {
		return this.total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public Float getVat() {
		return this.vat;
	}

	public void setVat(Float vat) {
		this.vat = vat;
	}

	public Float getVatBase() {
		return this.vatBase;
	}

	public void setVatBase(Float vatBase) {
		this.vatBase = vatBase;
	}

}