package ba.go2balkan.services.custom;

import java.util.Date;


public class AccommodationBookingSales {
    private Integer id;
    private Integer account;
    private String reservationHolderDetails;
    private String bookedRooms;
    private Float grandTotal;
    private Float paidinAmount;
    private Date arrivalDate;
    private Date departureDate;
    private Date reservationDate;
    private String gatewayId;
    
	public AccommodationBookingSales(Integer id, Integer account, String reservationHolderDetails, String bookedRooms,
			Float grandTotal, Float paidinAmount, Date arrivalDate, Date departureDate, Date reservationDate,
			String gatewayId) {
		super();
		this.id = id;
		this.account = account;
		this.reservationHolderDetails = reservationHolderDetails;
		this.bookedRooms = bookedRooms;
		this.grandTotal = grandTotal;
		this.paidinAmount = paidinAmount;
		this.arrivalDate = arrivalDate;
		this.departureDate = departureDate;
		this.reservationDate = reservationDate;
		this.gatewayId = gatewayId;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getReservationHolderDetails() {
        return reservationHolderDetails;
    }

    public void setReservationHolderDetails(String reservationHolderDetails) {
        this.reservationHolderDetails = reservationHolderDetails;
    }

    public String getBookedRooms() {
        return bookedRooms;
    }

    public void setBookedRooms(String bookedRooms) {
        this.bookedRooms = bookedRooms;
    }
    
    public Float getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(Float grandTotal) {
		this.grandTotal = grandTotal;
	}

	public Float getPaidinAmount() {
        return paidinAmount;
    }

    public void setPaidinAmount(Float paidinAmount) {
        this.paidinAmount = paidinAmount;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }
}
