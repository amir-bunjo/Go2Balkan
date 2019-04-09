package ba.go2balkan.dto;

import java.util.Date;

public class AccommodationSale {
    private String clientName;
    private String room;
    private String price;
    private String paidOrRemaining;
    private Date startDate;
    private Date endDate;
    private String reservationDate;
    private String gatewayId;
    private Integer bookingId;
    
    public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPaidOrRemaining() {
        return paidOrRemaining;
    }

    public void setPaidOrRemaining(String paidOrRemaining) {
        this.paidOrRemaining = paidOrRemaining;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(String reservationDate) {
        this.reservationDate = reservationDate;
    }

	@Override
	public String toString() {
		return "AccommodationSale [clientName=" + clientName + ", room=" + room + ", price=" + price
				+ ", paidOrRemaining=" + paidOrRemaining + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", reservationDate=" + reservationDate + ", gatewayId=" + gatewayId + "]";
	}
}
