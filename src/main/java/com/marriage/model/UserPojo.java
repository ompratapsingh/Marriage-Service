package com.marriage.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author Ompratap
 *
 */
@Entity
@Table(name = "user_details")
public class UserPojo implements Serializable {

	private static final long serialVersionUID = -396487648825163092L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	@JsonProperty(required = true)
	private int id;

	@JsonProperty(required = true)
	@NotNull(message = "Name is null")
	private String name;

	@Column(unique = true)
	@JsonProperty(required = true)
	@NotNull(message = "Email is null")
	private String email;

	@JsonProperty(required = true)
	@NotNull(message = "phone is null")
	private long phone;

	@Column(name = "is_attend")
	private boolean isAttend;

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public boolean isAttend() {
		return isAttend;
	}

	public void setisAttend(boolean isAttend) {
		this.isAttend = isAttend;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
