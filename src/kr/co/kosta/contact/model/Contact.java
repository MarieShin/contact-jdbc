package kr.co.kosta.contact.model;


public class Contact {

	private String name;
	private String email;
	private int age;
	private String address;

	public Contact() {

	}

	public Contact(String name, String email, int age, String address) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", age=" + age + ", address=" + address + "]";
	}

}
