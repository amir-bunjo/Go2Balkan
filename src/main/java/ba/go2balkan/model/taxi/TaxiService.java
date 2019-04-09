package ba.go2balkan.model.taxi;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the taxi_services database table.
 * 
 */
@Entity
@Table(name="taxi_services")
@NamedQuery(name="TaxiService.findAll", query="SELECT t FROM TaxiService t")
public class TaxiService implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private BigInteger accommodation;

	private BigInteger account;

	private float commision;

	@Column(name="entrant_price")
	private float entrantPrice;

	@Column(name="entrant_vat")
	private int entrantVat;

	private BigInteger event;

	private String from;

	private BigInteger gratis;

	@Column(name="output_price")
	private float outputPrice;

	private int tax;

	private String to;

	private BigInteger tour;

	private int vat;

	@Column(name="vat_base")
	private float vatBase;

	@Column(name="vat_free")
	private float vatFree;

	//bi-directional many-to-one association to TaxiCompany
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="taxi_company")
	private TaxiCompany taxiCompanyBean;

	//bi-directional many-to-one association to TaxiDriver
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="driver")
	private TaxiDriver taxiDriver;

	public TaxiService() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getAccommodation() {
		return this.accommodation;
	}

	public void setAccommodation(BigInteger accommodation) {
		this.accommodation = accommodation;
	}

	public BigInteger getAccount() {
		return this.account;
	}

	public void setAccount(BigInteger account) {
		this.account = account;
	}

	public float getCommision() {
		return this.commision;
	}

	public void setCommision(float commision) {
		this.commision = commision;
	}

	public float getEntrantPrice() {
		return this.entrantPrice;
	}

	public void setEntrantPrice(float entrantPrice) {
		this.entrantPrice = entrantPrice;
	}

	public int getEntrantVat() {
		return this.entrantVat;
	}

	public void setEntrantVat(int entrantVat) {
		this.entrantVat = entrantVat;
	}

	public BigInteger getEvent() {
		return this.event;
	}

	public void setEvent(BigInteger event) {
		this.event = event;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigInteger getGratis() {
		return this.gratis;
	}

	public void setGratis(BigInteger gratis) {
		this.gratis = gratis;
	}

	public float getOutputPrice() {
		return this.outputPrice;
	}

	public void setOutputPrice(float outputPrice) {
		this.outputPrice = outputPrice;
	}

	public int getTax() {
		return this.tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public String getTo() {
		return this.to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigInteger getTour() {
		return this.tour;
	}

	public void setTour(BigInteger tour) {
		this.tour = tour;
	}

	public int getVat() {
		return this.vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public float getVatBase() {
		return this.vatBase;
	}

	public void setVatBase(float vatBase) {
		this.vatBase = vatBase;
	}

	public float getVatFree() {
		return this.vatFree;
	}

	public void setVatFree(float vatFree) {
		this.vatFree = vatFree;
	}

	public TaxiCompany getTaxiCompanyBean() {
		return this.taxiCompanyBean;
	}

	public void setTaxiCompanyBean(TaxiCompany taxiCompanyBean) {
		this.taxiCompanyBean = taxiCompanyBean;
	}

	public TaxiDriver getTaxiDriver() {
		return this.taxiDriver;
	}

	public void setTaxiDriver(TaxiDriver taxiDriver) {
		this.taxiDriver = taxiDriver;
	}

}