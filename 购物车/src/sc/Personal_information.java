package sc;

public class Personal_information {

	private String name;
//	private String tel;
	public Personal_information() {}
	public Personal_information(String name) {
		this.name=name;
	}
//	public Personal_information(String name) {
//		this.name=name;
//		this.tel=tel;
//		this.address.setDefault_address(address);
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
	
//	public String getAddress() {
//		return address.getDefault_address();
//	}
//	public void setAddress(String default_address) {
//	   this.address.setDefault_address(default_address);
//	}
//	public void setAddress(String[] address) {
//		this.address.setAddress(address);
//	}
//	public void manageAddress(String[] address) {
//		this.address.setAddress(address);
//	}
}
