package model;

public class Medico extends User{
	
	private String name;
	private String surname;
	private String fiscalCode;
	
	public Medico() {
		this.name="marco";
		this.surname="rossi";
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

}