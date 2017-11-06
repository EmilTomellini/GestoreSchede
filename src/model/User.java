package model;

public class User {
	
	private String name;
	private String surname;
	private String fiscalCode;
	
	public User() {
		//belo belo
		System.out.println("dio gano");
	}
	
	public User(String token) {
		switch (token) {
			case "m":
				model.Medico UserM = new model.Medico();
				break;
			case "i":
				model.Infermiere UserI = new model.Infermiere();
				break;
		}	
	}
	
}