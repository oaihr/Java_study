package study.practice.practice59;

import java.util.List;

public class OrderInfoDTO {
	
	int id;
	String name;
	
	List<ContactDTO> contacts;
	
	AddressDTO address;
	
	List<OrderDTO> orders;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ContactDTO> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactDTO> contacts) {
		this.contacts = contacts;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public List<OrderDTO> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDTO> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "OrderInfoDTO [id=" + id + ", name=" + name + ", contacts=" + contacts + ", address=" + address
				+ ", orders=" + orders + "]";
	}
	
	
}

