package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;


/**
 * The persistent class for the booking database table.
 * 
 */
@Entity
@Table(name="booking")
@NamedQuery(name="Booking.findAll", query="SELECT b FROM Booking b")
public class Booking implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	private Integer account;

	@Temporal(TemporalType.DATE)
	@Column(name="arrival_date")
	private Date arrivalDate;

	@Column(name="booked_rooms")
	private String bookedRooms;

	@Column(name="booked_services")
	private String bookedServices;

	@Column(name="booked_taxi")
	private String bookedTaxi;

	@Column(name="booking_status")
	private String bookingStatus;

	@Column(name="custom_id")
	private String customId;

	@Temporal(TemporalType.DATE)
	@Column(name="departure_date")
	private Date departureDate;

	@Column(name="g2b_fee")
	private Float g2bFee;

	@Column(name="gateway_id")
	private String gatewayId;

	@Column(name="grand_total")
	private Float grandTotal;

	@Column(name="invoice_number")
	private String invoiceNumber;

	private String note;

	@Column(name="paidin_amount")
	private Float paidinAmount;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="payment_date")
	private Date paymentDate;

	@Column(name="payment_mode")
	private String paymentMode;

	@Column(name="rent_unit_total_price")
	private Float rentUnitTotalPrice;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reservation_date")
	private Date reservationDate;

	@Column(name="reservation_holder_details")
	private String reservationHolderDetails;

	@Column(name="reservation_holder_id")
	private Integer reservationHolderId;

	@Column(name="services_total_price")
	private Float servicesTotalPrice;

	@Column(name="taxi_total_price")
	private Float taxiTotalPrice;

	@Column(name="to_account_ammount")
	private Float toAccountAmmount;

	public Booking() {
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

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public Date getArrivalDate() {
		return this.arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getBookedRooms() {
		return this.bookedRooms;
	}

	public void setBookedRooms(String bookedRooms) {
		this.bookedRooms = bookedRooms;
	}

	public String getBookedServices() {
		return this.bookedServices;
	}

	public void setBookedServices(String bookedServices) {
		this.bookedServices = bookedServices;
	}

	public String getBookedTaxi() {
		return this.bookedTaxi;
	}

	public void setBookedTaxi(String bookedTaxi) {
		this.bookedTaxi = bookedTaxi;
	}

	public String getBookingStatus() {
		return this.bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public Date getDepartureDate() {
		return this.departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Float getG2bFee() {
		return this.g2bFee;
	}

	public void setG2bFee(Float g2bFee) {
		this.g2bFee = g2bFee;
	}

	public String getGatewayId() {
		return this.gatewayId;
	}

	public void setGatewayId(String gatewayId) {
		this.gatewayId = gatewayId;
	}

	public Float getGrandTotal() {
		return this.grandTotal;
	}

	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public String getInvoiceNumber() {
		return this.invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Float getPaidinAmount() {
		return this.paidinAmount;
	}

	public void setPaidinAmount(Float paidinAmount) {
		this.paidinAmount = paidinAmount;
	}

	public Date getPaymentDate() {
		return this.paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public Float getRentUnitTotalPrice() {
		return this.rentUnitTotalPrice;
	}

	public void setRentUnitTotalPrice(Float rentUnitTotalPrice) {
		this.rentUnitTotalPrice = rentUnitTotalPrice;
	}

	public Date getReservationDate() {
		return this.reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public String getReservationHolderDetails() {
		return this.reservationHolderDetails;
	}

	public void setReservationHolderDetails(String reservationHolderDetails) {
		this.reservationHolderDetails = reservationHolderDetails;
	}

	public Integer getReservationHolderId() {
		return this.reservationHolderId;
	}

	public void setReservationHolderId(Integer reservationHolderId) {
		this.reservationHolderId = reservationHolderId;
	}

	public Float getServicesTotalPrice() {
		return this.servicesTotalPrice;
	}

	public void setServicesTotalPrice(Float servicesTotalPrice) {
		this.servicesTotalPrice = servicesTotalPrice;
	}

	public Float getTaxiTotalPrice() {
		return this.taxiTotalPrice;
	}

	public void setTaxiTotalPrice(Float taxiTotalPrice) {
		this.taxiTotalPrice = taxiTotalPrice;
	}

	public Float getToAccountAmmount() {
		return this.toAccountAmmount;
	}

	public void setToAccountAmmount(Float toAccountAmmount) {
		this.toAccountAmmount = toAccountAmmount;
	}

}