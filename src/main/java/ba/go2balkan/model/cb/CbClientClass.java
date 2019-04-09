package ba.go2balkan.model.cb;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the cb_client_classes database table.
 * 
 */
@Entity
@Table(name="cb_client_classes")
@NamedQuery(name="CbClientClass.findAll", query="SELECT c FROM CbClientClass c")
public class CbClientClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Byte id;

	@Column(name="class_name")
	private String className;

	public CbClientClass() {
	}

	public Byte getId() {
		return this.id;
	}

	public void setId(Byte id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

}