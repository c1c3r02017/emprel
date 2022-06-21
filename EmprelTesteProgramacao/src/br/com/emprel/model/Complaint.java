/**
 * 
 */
package br.com.emprel.model;

/**
 * @author cjosi
 *
 */
public abstract class Complaint {
	protected int id;

	protected String Description;
	protected String Observations;
	protected String name;
	protected String Address;
	protected String Complement;
	protected String Province;
	protected String City;
	protected String State;
	protected String ZipCode;
	protected String Phone;
	protected String mail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getObservations() {
		return Observations;
	}

	public void setObservations(String observations) {
		Observations = observations;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
