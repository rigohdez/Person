package com.softtek.person.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Persons {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PER_SEQ")
	@SequenceGenerator(name = "PER_SEQ", sequenceName = "SEQ_1", allocationSize = 1)
	Long person_id;
	@Column(name ="FIRST_NAME")
	String first_name;
	@Column(name ="LAST_NAME")
	String last_name;
	@Column(name ="GENDER")
	String gender;
	@Column(name ="DNI")
	String dni;
	@Column(name ="EMAIL")
	String email;
	@Column(name ="STATUS")
	int status;
	
	public Long getPerson_id() {
		return person_id;
	}
	public void setPerson_id(Long person_id) {
		this.person_id = person_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Persons [person_id=" + person_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", gender=" + gender + ", dni=" + dni + ", email=" + email + ", status=" + status + "]";
	}
}
