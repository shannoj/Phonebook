package phonebook;

public class Contact {
	
	private String name;
	private int phone;
	
	public Contact(String name) {
		this.name = name;
	}
	
	public Contact(String name, int phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPhone() {
		return phone;
	}

}

