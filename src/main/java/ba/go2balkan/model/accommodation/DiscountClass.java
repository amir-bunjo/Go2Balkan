package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the discount_classes database table.
 * 
 */
@Entity
@Table(name="discount_classes")
@NamedQuery(name="DiscountClass.findAll", query="SELECT d FROM DiscountClass d")
public class DiscountClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

	@Column(name="class_name")
	private String className;

	@Column(name="rule_source")
	private String ruleSource;

	//bi-directional many-to-one association to DiscountAge
	@OneToMany(mappedBy="discountClassBean")
	private Set<DiscountAge> discountAges;

	//bi-directional many-to-one association to DiscountMiscellaneous
	@OneToMany(mappedBy="discountClassBean")
	private Set<DiscountMiscellaneous> discountMiscellaneouses;

	//bi-directional many-to-one association to DiscountQuantity
	@OneToMany(mappedBy="discountClass")
	private Set<DiscountQuantity> discountQuantities;


	public DiscountClass() {
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getRuleSource() {
		return this.ruleSource;
	}

	public void setRuleSource(String ruleSource) {
		this.ruleSource = ruleSource;
	}

	public Set<DiscountAge> getDiscountAges() {
		return this.discountAges;
	}

	public void setDiscountAges(Set<DiscountAge> discountAges) {
		this.discountAges = discountAges;
	}

	public DiscountAge addDiscountAge(DiscountAge discountAge) {
		getDiscountAges().add(discountAge);
		discountAge.setDiscountClassBean(this);

		return discountAge;
	}

	public DiscountAge removeDiscountAge(DiscountAge discountAge) {
		getDiscountAges().remove(discountAge);
		discountAge.setDiscountClassBean(null);

		return discountAge;
	}

	public Set<DiscountMiscellaneous> getDiscountMiscellaneouses() {
		return this.discountMiscellaneouses;
	}

	public void setDiscountMiscellaneouses(Set<DiscountMiscellaneous> discountMiscellaneouses) {
		this.discountMiscellaneouses = discountMiscellaneouses;
	}

	public DiscountMiscellaneous addDiscountMiscellaneous(DiscountMiscellaneous discountMiscellaneous) {
		getDiscountMiscellaneouses().add(discountMiscellaneous);
		discountMiscellaneous.setDiscountClassBean(this);

		return discountMiscellaneous;
	}

	public DiscountMiscellaneous removeDiscountMiscellaneous(DiscountMiscellaneous discountMiscellaneous) {
		getDiscountMiscellaneouses().remove(discountMiscellaneous);
		discountMiscellaneous.setDiscountClassBean(null);

		return discountMiscellaneous;
	}

	public Set<DiscountQuantity> getDiscountQuantities() {
		return this.discountQuantities;
	}

	public void setDiscountQuantities(Set<DiscountQuantity> discountQuantities) {
		this.discountQuantities = discountQuantities;
	}

	public DiscountQuantity addDiscountQuantities(DiscountQuantity discountQuantities) {
		getDiscountQuantities().add(discountQuantities);
		discountQuantities.setDiscountClass(this);

		return discountQuantities;
	}

	public DiscountQuantity removeDiscountQuantities(DiscountQuantity discountQuantities) {
		getDiscountQuantities().remove(discountQuantities);
		discountQuantities.setDiscountClass(null);

		return discountQuantities;
	}

}