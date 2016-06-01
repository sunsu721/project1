package j2ee.group01.sportshop.entity;
// Generated Jun 1, 2016 9:27:59 AM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "sportshop")
public class Order implements java.io.Serializable {

	private Integer id;
	private String fullname;
	private String address;
	private String phone;
	private String email;
	private String shipAddress;
	private String shipName;
	private String shipPhone;
	private Date dateCreate;
	private Date dateDelivery;
	private String note;
	private double totalAmount;
	private double totalAmountReal;
	private int isActive;

	public Order() {
	}

	public Order(String fullname, String address, String phone, String email, String shipAddress, String shipName,
			String shipPhone, Date dateCreate, Date dateDelivery, String note, double totalAmount,
			double totalAmountReal, int isActive) {
		this.fullname = fullname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.shipAddress = shipAddress;
		this.shipName = shipName;
		this.shipPhone = shipPhone;
		this.dateCreate = dateCreate;
		this.dateDelivery = dateDelivery;
		this.note = note;
		this.totalAmount = totalAmount;
		this.totalAmountReal = totalAmountReal;
		this.isActive = isActive;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "fullname", nullable = false, length = 65535)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "address", nullable = false, length = 65535)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone", nullable = false, length = 65535)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false, length = 65535)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "ship_address", nullable = false, length = 65535)
	public String getShipAddress() {
		return this.shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	@Column(name = "ship_name", nullable = false, length = 65535)
	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Column(name = "ship_phone", nullable = false, length = 65535)
	public String getShipPhone() {
		return this.shipPhone;
	}

	public void setShipPhone(String shipPhone) {
		this.shipPhone = shipPhone;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_create", nullable = false, length = 19)
	public Date getDateCreate() {
		return this.dateCreate;
	}

	public void setDateCreate(Date dateCreate) {
		this.dateCreate = dateCreate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_delivery", nullable = false, length = 19)
	public Date getDateDelivery() {
		return this.dateDelivery;
	}

	public void setDateDelivery(Date dateDelivery) {
		this.dateDelivery = dateDelivery;
	}

	@Column(name = "note", nullable = false, length = 65535)
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "total_amount", nullable = false, precision = 22, scale = 0)
	public double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "total_amount_real", nullable = false, precision = 22, scale = 0)
	public double getTotalAmountReal() {
		return this.totalAmountReal;
	}

	public void setTotalAmountReal(double totalAmountReal) {
		this.totalAmountReal = totalAmountReal;
	}

	@Column(name = "is_active", nullable = false)
	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

}
