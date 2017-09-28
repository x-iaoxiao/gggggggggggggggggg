package sc;

public class Customer {

	private String id;
	private Personal_information personal_information;
	public Customer() {}
	public Customer(String id) {
		this.id=id;
	}
	public Customer(Personal_information personal_information,String id) {
		this.id=id;
		this.personal_information=personal_information;
//		this.personal_information.setName(name);
//		this.personal_information.setTel(tel);
//		this.personal_information.setAddress(address);
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Personal_information getPersonal_information() {
		return personal_information;
	}
	public void setPersonal_information(Personal_information personal_information) {
		this.personal_information = personal_information;
	}
	
}
