package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_payment_modes database table.
 * 
 */
@Entity
@Table(name="cb_payment_modes")
@NamedQuery(name="CbPaymentMode.findAll", query="SELECT c FROM CbPaymentMode c")
public class CbPaymentMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="payment_mode")
	private String paymentMode;

	public CbPaymentMode() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

}