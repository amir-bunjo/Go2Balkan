package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the discount_miscellaneous database table.
 * 
 */
@Entity
@Table(name="discount_miscellaneous")
@NamedQuery(name="DiscountMiscellaneous.findAll", query="SELECT d FROM DiscountMiscellaneous d")
public class DiscountMiscellaneous implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	private String account;

	private String description;

	@Column(name="discount_fixed_amount")
	private float discountFixedAmount;

	@Column(name="discount_name")
	private String discountName;

	@Column(name="discount_percentage_amount")
	private float discountPercentageAmount;

	private Integer event;

	@Column(name="fixed_calculation")
	private Boolean fixedCalculation;

	@Column(name="mice_event")
	private Integer miceEvent;

	@Temporal(TemporalType.DATE)
	@Column(name="price_end_date")
	private Date priceEndDate;

	@Temporal(TemporalType.DATE)
	@Column(name="price_start_date")
	private Date priceStartDate;

	private Integer room;

	private Integer tour;

	//bi-directional many-to-one association to DiscountClass
	@ManyToOne
	@JoinColumn(name="discount_class")
	private DiscountClass discountClassBean;

	public DiscountMiscellaneous() {
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

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getDiscountFixedAmount() {
		return this.discountFixedAmount;
	}

	public void setDiscountFixedAmount(float discountFixedAmount) {
		this.discountFixedAmount = discountFixedAmount;
	}

	public String getDiscountName() {
		return this.discountName;
	}

	public void setDiscountName(String discountName) {
		this.discountName = discountName;
	}

	public float getDiscountPercentageAmount() {
		return this.discountPercentageAmount;
	}

	public void setDiscountPercentageAmount(float discountPercentageAmount) {
		this.discountPercentageAmount = discountPercentageAmount;
	}

	public Integer getEvent() {
		return this.event;
	}

	public void setEvent(Integer event) {
		this.event = event;
	}

	public Boolean getFixedCalculation() {
		return this.fixedCalculation;
	}

	public void setFixedCalculation(Boolean fixedCalculation) {
		this.fixedCalculation = fixedCalculation;
	}

	public Integer getMiceEvent() {
		return this.miceEvent;
	}

	public void setMiceEvent(Integer miceEvent) {
		this.miceEvent = miceEvent;
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

	public Integer getRoom() {
		return this.room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getTour() {
		return this.tour;
	}

	public void setTour(Integer tour) {
		this.tour = tour;
	}

	public DiscountClass getDiscountClassBean() {
		return this.discountClassBean;
	}

	public void setDiscountClassBean(DiscountClass discountClassBean) {
		this.discountClassBean = discountClassBean;
	}

}