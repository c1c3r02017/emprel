package br.com.emprel.model;

import java.util.Date;

public class AnimalComplaint extends Complaint {
	private String Race;
	private int Quantidade;
	private Date EventDate;
	private String EventAddress;
	private String Complement;
	private String Province;
	private String City;
	private String State;
	private String ZipCode;
	private String Phone;

	public String getRace() {
		return Race;
	}

	public void setRace(String race) {
		Race = race;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}

	public Date getEventDate() {
		return EventDate;
	}

	public void setEventDate(Date eventDate) {
		EventDate = eventDate;
	}

	public String getEventAddress() {
		return EventAddress;
	}

	public void setEventAddress(String eventAddress) {
		EventAddress = eventAddress;
	}

	public String getComplement() {
		return Complement;
	}

	public void setComplement(String complement) {
		Complement = complement;
	}

	public String getProvince() {
		return Province;
	}

	public void setProvince(String province) {
		Province = province;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getZipCode() {
		return ZipCode;
	}

	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}
}
