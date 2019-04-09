package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the accommodation_prices_periods database table.
 * 
 */
@Entity
@Table(name="accommodation_prices_periods")
@NamedQuery(name="AccommodationPricesPeriod.findAll", query="SELECT a FROM AccommodationPricesPeriod a")
public class AccommodationPricesPeriod implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	private Integer bed;

	private Float commision;

	@Column(name="enduser_price")
	private Float enduserPrice;

	@Column(name="entrant_cost")
	private Float entrantCost;

	@Temporal(TemporalType.DATE)
	@Column(name="price_end_date")
	private Date priceEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="price_start_date")
	private Date priceStartDate;

	@Column(name="room_type")
	private Integer roomType;

	@Column(name="vat_amount")
	private Float vatAmount;

	@Column(name="vat_base")
	private Float vatBase;

	@Column(name="vat_free")
	private Float vatFree;

	public AccommodationPricesPeriod() {
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

	public Integer getBed() {
		return this.bed;
	}

	public void setBed(Integer bed) {
		this.bed = bed;
	}

	public Float getCommision() {
		return this.commision;
	}

	public void setCommision(Float commision) {
		this.commision = commision;
	}

	public Float getEnduserPrice() {
		return this.enduserPrice;
	}

	public void setEnduserPrice(Float enduserPrice) {
		this.enduserPrice = enduserPrice;
	}

	public Float getEntrantCost() {
		return this.entrantCost;
	}

	public void setEntrantCost(Float entrantCost) {
		this.entrantCost = entrantCost;
	}

	public Date getPriceEndDate() {
		return this.priceEndDate;
	}

	public void setPriceEndDate(Date priceEndDate) {
		this.priceEndDate = priceEndDate;
	}

	public Date getPriceStartDate() {
		return this.priceStartDate;
	}

	public void setPriceStartDate(Date priceStartDate) {
		this.priceStartDate = priceStartDate;
	}

	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

	public Float getVatAmount() {
		return this.vatAmount;
	}

	public void setVatAmount(Float vatAmount) {
		this.vatAmount = vatAmount;
	}

	public Float getVatBase() {
		return this.vatBase;
	}

	public void setVatBase(Float vatBase) {
		this.vatBase = vatBase;
	}

	public Float getVatFree() {
		return this.vatFree;
	}

	public void setVatFree(Float vatFree) {
		this.vatFree = vatFree;
	}

}