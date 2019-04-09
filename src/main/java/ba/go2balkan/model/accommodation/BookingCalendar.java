package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the booking_calendar database table.
 * 
 */
@Entity
@Table(name="booking_calendar")
@NamedQuery(name="BookingCalendar.findAll", query="SELECT b FROM BookingCalendar b")
public class BookingCalendar implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	private Integer accommodation;

	@Temporal(TemporalType.DATE)
	@Column(name="check_in")
	private Date checkIn;

	@Temporal(TemporalType.DATE)
	@Column(name="check_out")
	private Date checkOut;

	private Integer room;

	@Column(name="room_type")
	private Integer roomType;

	public BookingCalendar() {
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

	public Date getCheckIn() {
		return this.checkIn;
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public Date getCheckOut() {
		return this.checkOut;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public Integer getRoom() {
		return this.room;
	}

	public void setRoom(Integer room) {
		this.room = room;
	}

	public Integer getRoomType() {
		return this.roomType;
	}

	public void setRoomType(Integer roomType) {
		this.roomType = roomType;
	}

}