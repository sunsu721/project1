package j2ee.group01.sportshop.entity;
// Generated Jun 1, 2016 9:27:59 AM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "sportshop")
public class User implements java.io.Serializable {

	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private String email;
	private boolean idRole;
	private int isActive;

	public User() {
	}

	public User(String username, String password, String fullname, String email, boolean idRole, int isActive) {
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.email = email;
		this.idRole = idRole;
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

	@Column(name = "username", nullable = false, length = 65535)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "password", nullable = false, length = 65535)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "fullname", nullable = false, length = 65535)
	public String getFullname() {
		return this.fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "email", nullable = false, length = 65535)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "id_role", nullable = false)
	public boolean isIdRole() {
		return this.idRole;
	}

	public void setIdRole(boolean idRole) {
		this.idRole = idRole;
	}

	@Column(name = "is_active", nullable = false)
	public int getIsActive() {
		return this.isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

}
