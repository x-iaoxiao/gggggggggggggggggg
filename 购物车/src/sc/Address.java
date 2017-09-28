package sc;

import java.util.Arrays;

public class Address {

	private String default_address;
	private String[] address;
	private String rename;
	private String tel;
	public Address() {}
	public Address(String default_address,String name,String tel) {
		this.default_address=default_address;
		this.rename=name;
		this.tel=tel;
	}
	public Address(String[] adress) {
		this.default_address=address[0];
		for(int i=1;i<address.length;i++) {
			this.address[i-1]=address[i];
		}
	}
	public String getDefault_address() {
		return default_address;
	}
	public void setDefault_address(String default_address) {
		this.default_address = default_address;
	}
	public String[] getAddress() {
		return address;
	}
	public void setAddress(String[] address) {
		this.address = address;
	}
	public String getRename() {
		return rename;
	}
	public void setRename(String rename) {
		this.rename = rename;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Address [default_address=" + default_address + ", address=" + Arrays.toString(address) + ", rename="
				+ rename + "]";
	}
	
}
