package model;

public class Infermiere extends User{
	
	private String name;
	private String surname;
	private String fiscalCode;
	
	public Infermiere() {
		this.name="marco";
		this.surname="bianchi";
		this.fiscalCode="THFHGGJ";
	}

	public String getName() {
		return this.name;
	}
	
	public String getSurname() {
		return this.surname;
	}
	
	public String getCode() {
		return this.fiscalCode;
	}
	
	/////////
	
}