package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_cancellation_policies database table.
 * 
 */
@Entity
@Table(name="cb_cancellation_policies")
@NamedQuery(name="CbCancellationPolicy.findAll", query="SELECT c FROM CbCancellationPolicy c")
public class CbCancellationPolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	private Integer account;

	@Column(name="policy_name")
	private String policyName;

	public CbCancellationPolicy() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

}