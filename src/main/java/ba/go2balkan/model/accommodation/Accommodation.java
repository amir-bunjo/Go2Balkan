package ba.go2balkan.model.accommodation;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the search procedure.
 * 
 */

@Entity
@Table(name="accommodation")
@NamedStoredProcedureQueries({
  @NamedStoredProcedureQuery(
          name = "getSearchResults",
          procedureName = "search",
          resultClasses = { Accommodation.class },
          parameters = {
                  @StoredProcedureParameter(
                          name = "category",
                          type = Date.class,
                          mode = ParameterMode.IN),
                  @StoredProcedureParameter(
                          name = "paramId",
                          type = Date.class,
                          mode = ParameterMode.IN),
                  @StoredProcedureParameter(
                          name = "startDate",
                          type = Date.class,
                          mode = ParameterMode.IN),
                  @StoredProcedureParameter(
                          name = "endDate",
                          type = Date.class,
                          mode = ParameterMode.IN)
          })
})

public class Accommodation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	@Column(name="accepted_cards")
	private String acceptedCards;

	@Column(name="accommodation_bathrooms")
	private String accommodationBathrooms;

	@Column(name="accommodation_bedrooms")
	private String accommodationBedrooms;

	@Column(name="accommodation_lvingrooms")
	private String accommodationLvingrooms;

	@Column(name="accommodation_pics")
	private String accommodationPics;

	@Column(name="accommodation_type")
	private String accommodationType;

	@Column(name="account")
	private Integer account;

	@Column(name="address")
	private String address;

	@Column(name="balkan_region")
	private Boolean balkanRegion;

	@Column(name="checkin_end")
	private String checkinEnd;

	@Column(name="checkin_start")
	private String checkinStart;

	@Column(name="checkout_end")
	private String checkoutEnd;

	@Column(name="checkout_start")
	private String checkoutStart;

	@Column(name="city")
	private String city;

	@Column(name="custom_id")
	private String customId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;

	@Lob
	@Column(name="description")
	private String description;

	@Column(name="email")
	private String email;

	@Column(name="googlemap_link")
	private String googlemapLink;

	@Column(name="important_information")
	private String importantInformation;

	@Column(name="is_active")
	private Boolean isActive;

	@Column(name="name")
	private String name;

	@Column(name="options_activities")
	private String optionsActivities;

	@Column(name="options_breakfast")
	private String optionsBreakfast;

	@Column(name="options_business_facilities")
	private String optionsBusinessFacilities;

	@Column(name="options_cleaning_services")
	private String optionsCleaningServices;

	@Column(name="options_common_areas")
	private String optionsCommonAreas;

	@Column(name="options_entertainment")
	private String optionsEntertainment;

	@Column(name="options_food_drink")
	private String optionsFoodDrink;

	@Column(name="options_frontdesk_services")
	private String optionsFrontdeskServices;

	@Column(name="options_internet")
	private String optionsInternet;

	@Column(name="options_miscellaneous")
	private String optionsMiscellaneous;

	@Column(name="options_parking")
	private String optionsParking;

	@Column(name="options_payment_types")
	private String optionsPaymentTypes;

	@Column(name="options_pool_spa")
	private String optionsPoolSpa;

	@Column(name="options_shops")
	private String optionsShops;

	@Column(name="options_transportation")
	private String optionsTransportation;

	@Column(name="pets_policy")
	private String petsPolicy;

	@Column(name="phone")
	private String phone;

	@Column(name="accommodation_promo_pic")
	private String promoPic;

	@Column(name="rank")
	private Float rank;

	@Column(name="rent_type")
	private String rentType;

	@Column(name="rooms_total")
	private Byte roomsTotal;

	@Column(name="staff_languages")
	private String staffLanguages;

	@Column(name="state")
	private String state;

	@Column(name="surroundings")
	private String surroundings;

	@Column(name="user_rating")
	private Float userRating;

	@Column(name="web")
	private String web;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="rent_items")
	private String rentItems;
	
	@Column(name="vat")
	private String vat;
	
	@Column(name="city_tax")
	private Float cityTax;

	public Accommodation() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAcceptedCards() {
		return this.acceptedCards;
	}

	public void setAcceptedCards(String acceptedCards) {
		this.acceptedCards = acceptedCards;
	}

	public String getAccommodationBathrooms() {
		return this.accommodationBathrooms;
	}

	public void setAccommodationBathrooms(String accommodationBathrooms) {
		this.accommodationBathrooms = accommodationBathrooms;
	}

	public String getAccommodationBedrooms() {
		return this.accommodationBedrooms;
	}

	public void setAccommodationBedrooms(String accommodationBedrooms) {
		this.accommodationBedrooms = accommodationBedrooms;
	}

	public String getAccommodationLvingrooms() {
		return this.accommodationLvingrooms;
	}

	public void setAccommodationLvingrooms(String accommodationLvingrooms) {
		this.accommodationLvingrooms = accommodationLvingrooms;
	}

	public String getAccommodationPics() {
		return this.accommodationPics;
	}

	public void setAccommodationPics(String accommodationPics) {
		this.accommodationPics = accommodationPics;
	}

	public String getAccommodationType() {
		return this.accommodationType;
	}

	public void setAccommodationType(String accommodationType) {
		this.accommodationType = accommodationType;
	}

	public Integer getAccount() {
		return this.account;
	}

	public void setAccount(Integer account) {
		this.account = account;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getBalkanRegion() {
		return this.balkanRegion;
	}

	public void setBalkanRegion(Boolean balkanRegion) {
		this.balkanRegion = balkanRegion;
	}

	public String getCheckinEnd() {
		return this.checkinEnd;
	}

	public void setCheckinEnd(String checkinEnd) {
		this.checkinEnd = checkinEnd;
	}

	public String getCheckinStart() {
		return this.checkinStart;
	}

	public void setCheckinStart(String checkinStart) {
		this.checkinStart = checkinStart;
	}

	public String getCheckoutEnd() {
		return this.checkoutEnd;
	}

	public void setCheckoutEnd(String checkoutEnd) {
		this.checkoutEnd = checkoutEnd;
	}

	public String getCheckoutStart() {
		return this.checkoutStart;
	}

	public void setCheckoutStart(String checkoutStart) {
		this.checkoutStart = checkoutStart;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCustomId() {
		return this.customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public Date getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGooglemapLink() {
		return this.googlemapLink;
	}

	public void setGooglemapLink(String googlemapLink) {
		this.googlemapLink = googlemapLink;
	}

	public String getImportantInformation() {
		return this.importantInformation;
	}

	public void setImportantInformation(String importantInformation) {
		this.importantInformation = importantInformation;
	}

	public Boolean getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOptionsActivities() {
		return this.optionsActivities;
	}

	public void setOptionsActivities(String optionsActivities) {
		this.optionsActivities = optionsActivities;
	}

	public String getOptionsBreakfast() {
		return this.optionsBreakfast;
	}

	public void setOptionsBreakfast(String optionsBreakfast) {
		this.optionsBreakfast = optionsBreakfast;
	}

	public String getOptionsBusinessFacilities() {
		return this.optionsBusinessFacilities;
	}

	public void setOptionsBusinessFacilities(String optionsBusinessFacilities) {
		this.optionsBusinessFacilities = optionsBusinessFacilities;
	}

	public String getOptionsCleaningServices() {
		return this.optionsCleaningServices;
	}

	public void setOptionsCleaningServices(String optionsCleaningServices) {
		this.optionsCleaningServices = optionsCleaningServices;
	}

	public String getOptionsCommonAreas() {
		return this.optionsCommonAreas;
	}

	public void setOptionsCommonAreas(String optionsCommonAreas) {
		this.optionsCommonAreas = optionsCommonAreas;
	}

	public String getOptionsEntertainment() {
		return this.optionsEntertainment;
	}

	public void setOptionsEntertainment(String optionsEntertainment) {
		this.optionsEntertainment = optionsEntertainment;
	}

	public String getOptionsFoodDrink() {
		return this.optionsFoodDrink;
	}

	public void setOptionsFoodDrink(String optionsFoodDrink) {
		this.optionsFoodDrink = optionsFoodDrink;
	}

	public String getOptionsFrontdeskServices() {
		return this.optionsFrontdeskServices;
	}

	public void setOptionsFrontdeskServices(String optionsFrontdeskServices) {
		this.optionsFrontdeskServices = optionsFrontdeskServices;
	}

	public String getOptionsInternet() {
		return this.optionsInternet;
	}

	public void setOptionsInternet(String optionsInternet) {
		this.optionsInternet = optionsInternet;
	}

	public String getOptionsMiscellaneous() {
		return this.optionsMiscellaneous;
	}

	public void setOptionsMiscellaneous(String optionsMiscellaneous) {
		this.optionsMiscellaneous = optionsMiscellaneous;
	}

	public String getOptionsParking() {
		return this.optionsParking;
	}

	public void setOptionsParking(String optionsParking) {
		this.optionsParking = optionsParking;
	}

	public String getOptionsPaymentTypes() {
		return this.optionsPaymentTypes;
	}

	public void setOptionsPaymentTypes(String optionsPaymentTypes) {
		this.optionsPaymentTypes = optionsPaymentTypes;
	}

	public String getOptionsPoolSpa() {
		return this.optionsPoolSpa;
	}

	public void setOptionsPoolSpa(String optionsPoolSpa) {
		this.optionsPoolSpa = optionsPoolSpa;
	}

	public String getOptionsShops() {
		return this.optionsShops;
	}

	public void setOptionsShops(String optionsShops) {
		this.optionsShops = optionsShops;
	}

	public String getOptionsTransportation() {
		return this.optionsTransportation;
	}

	public void setOptionsTransportation(String optionsTransportation) {
		this.optionsTransportation = optionsTransportation;
	}

	public String getPetsPolicy() {
		return this.petsPolicy;
	}

	public void setPetsPolicy(String petsPolicy) {
		this.petsPolicy = petsPolicy;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPromoPic() {
		return this.promoPic;
	}

	public void setPromoPic(String promoPic) {
		this.promoPic = promoPic;
	}

	public Float getRank() {
		return this.rank;
	}

	public void setRank(Float rank) {
		this.rank = rank;
	}

	public String getRentType() {
		return this.rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public Byte getRoomsTotal() {
		return this.roomsTotal;
	}

	public void setRoomsTotal(Byte roomsTotal) {
		this.roomsTotal = roomsTotal;
	}

	public String getStaffLanguages() {
		return this.staffLanguages;
	}

	public void setStaffLanguages(String staffLanguages) {
		this.staffLanguages = staffLanguages;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getSurroundings() {
		return this.surroundings;
	}

	public void setSurroundings(String surroundings) {
		this.surroundings = surroundings;
	}

	public Float getUserRating() {
		return this.userRating;
	}

	public void setUserRating(Float userRating) {
		this.userRating = userRating;
	}

	public String getWeb() {
		return this.web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}


	public String getRentItems() {
		return rentItems;
	}

	public void setRentItems(String rentItems) {
		this.rentItems = rentItems;
	}
	
	public String getVat() {
		
		return vat;
	}
	
	public void setVat(String vat) {
			
			this.vat = vat;
	}
	
	public Float getCityTax() {
			
			return cityTax;
		}
	
	public void setCityTax(Float cityTax) {
		
		this.cityTax= cityTax;
}
	
	
}