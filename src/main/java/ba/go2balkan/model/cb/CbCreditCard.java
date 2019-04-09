package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_credit_cards database table.
 * 
 */
@Entity
@Table(name="cb_credit_cards")
@NamedQuery(name="CbCreditCard.findAll", query="SELECT c FROM CbCreditCard c")
public class CbCreditCard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Lob
	@Column(name="card_icon")
	private String cardIcon;

	@Column(name="card_name")
	private String cardName;

	public CbCreditCard() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getCardIcon() {
		return this.cardIcon;
	}

	public void setCardIcon(String cardIcon) {
		this.cardIcon = cardIcon;
	}

	public String getCardName() {
		return this.cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

}