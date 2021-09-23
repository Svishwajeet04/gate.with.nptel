package com.vishwa.entities.helpers;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String city;
	private String hno;
	private String nation;
	private String state;
	private String Street;

	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public String getHno() {
		return hno;
	}

	public String getNation() {
		return nation;
	}

	public String getState() {
		return state;
	}

	public String getStreet() {
		return Street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setStreet(String street) {
		Street = street;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", Street=" + Street + ", city=" + city + ", state=" + state + ", nation="
				+ nation + "]";
	}

}
