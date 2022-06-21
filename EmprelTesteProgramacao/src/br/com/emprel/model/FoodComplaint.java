package br.com.emprel.model;

public class FoodComplaint extends Complaint {
	String VictimName;
	String VictimAddress;
	String VictimComplement;
	String VictimProvince;
	String VictimClosestCity;
	String VictimState;
	String VictimZipCode;
	String VictimTelephone;

	// Event information
	int AmountPeopleAteMeal;
	int AmountSickPeople;
	int AmountPeopleHospital;
	int AmountDeath;
	int PlaceMedicalCare;
	int SuspiciousMeal;

	public String getVictimName() {
		return VictimName;
	}

	public void setVictimName(String victimName) {
		VictimName = victimName;
	}

	public String getVictimAddress() {
		return VictimAddress;
	}

	public void setVictimAddress(String victimAddress) {
		VictimAddress = victimAddress;
	}

	public String getVictimComplement() {
		return VictimComplement;
	}

	public void setVictimComplement(String victimComplement) {
		VictimComplement = victimComplement;
	}

	public String getVictimProvince() {
		return VictimProvince;
	}

	public void setVictimProvince(String victimProvince) {
		VictimProvince = victimProvince;
	}

	public String getVictimClosestCity() {
		return VictimClosestCity;
	}

	public void setVictimClosestCity(String victimClosestCity) {
		VictimClosestCity = victimClosestCity;
	}

	public String getVictimState() {
		return VictimState;
	}

	public void setVictimState(String victimState) {
		VictimState = victimState;
	}

	public String getVictimZipCode() {
		return VictimZipCode;
	}

	public void setVictimZipCode(String victimZipCode) {
		VictimZipCode = victimZipCode;
	}

	public String getVictimTelephone() {
		return VictimTelephone;
	}

	public void setVictimTelephone(String victimTelephone) {
		VictimTelephone = victimTelephone;
	}

	public int getAmountPeopleAteMeal() {
		return AmountPeopleAteMeal;
	}

	public void setAmountPeopleAteMeal(int amountPeopleAteMeal) {
		AmountPeopleAteMeal = amountPeopleAteMeal;
	}

	public int getAmountSickPeople() {
		return AmountSickPeople;
	}

	public void setAmountSickPeople(int amountSickPeople) {
		AmountSickPeople = amountSickPeople;
	}

	public int getAmountPeopleHospital() {
		return AmountPeopleHospital;
	}

	public void setAmountPeopleHospital(int amountPeopleHospital) {
		AmountPeopleHospital = amountPeopleHospital;
	}

	public int getAmountDeath() {
		return AmountDeath;
	}

	public void setAmountDeath(int amountDeath) {
		AmountDeath = amountDeath;
	}

	public int getPlaceMedicalCare() {
		return PlaceMedicalCare;
	}

	public void setPlaceMedicalCare(int placeMedicalCare) {
		PlaceMedicalCare = placeMedicalCare;
	}

	public int getSuspiciousMeal() {
		return SuspiciousMeal;
	}

	public void setSuspiciousMeal(int suspiciousMeal) {
		SuspiciousMeal = suspiciousMeal;
	}

}
