package study.practice.practice59;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class OrderService {
	
public OrderInfoDTO getOrderInfo() {
		
		OrderInfoDTO orderInfoDTO = null;
		
		try {
			 
			 String jsonText = "{\r\n"
			 		+ "\"id\": 1,\r\n"
			 		+ "\"name\": \"John Doe\",\r\n"
			 		+ "\"contacts\": [\r\n"
			 		+ "{\r\n"
			 		+ "\"type\": \"email\",\r\n"
			 		+ "\"value\": \"john.doe@example.com\"\r\n"
			 		+ "},\r\n"
			 		+ "{\r\n"
			 		+ "\"type\": \"phone\",\r\n"
			 		+ "\"value\": \"01023456789\"\r\n"
			 		+ "}\r\n"
			 		+ "],\r\n"
			 		+ "\"address\": {\r\n"
			 		+ "\"street\": \"123 Main Street\",\r\n"
			 		+ "\"city\": \"Seoul\",\r\n"
			 		+ "\"zipcode\": \"12345\"\r\n"
			 		+ "},\r\n"
			 		+ "\"orders\": [\r\n"
			 		+ "{\r\n"
			 		+ "\"orderId\": \"ORD-001\",\r\n"
			 		+ "\"date\": \"2024-07-09\",\r\n"
			 		+ "\"items\": [\r\n"
			 		+ "{\r\n"
			 		+ "\"id\": 1,\r\n"
			 		+ "\"name\": \"Smartphone\",\r\n"
			 		+ "\"quantity\": 2\r\n"
			 		+ "},\r\n"
			 		+ "{\r\n"
			 		+ "\"id\": 2,\r\n"
			 		+ "\"name\": \"Laptop\",\r\n"
			 		+ "\"quantity\": 1\r\n"
			 		+ "}\r\n"
			 		+ "]\r\n"
			 		+ "},\r\n"
			 		+ "{\r\n"
			 		+ "\"orderId\": \"ORD-002\",\r\n"
			 		+ "\"date\": \"2024-07-10\",\r\n"
			 		+ "\"items\": [\r\n"
			 		+ "{\r\n"
			 		+ "\"id\": 3,\r\n"
			 		+ "\"name\": \"Headphones\",\r\n"
			 		+ "\"quantity\": 1\r\n"
			 		+ "}\r\n"
			 		+ "]\r\n"
			 		+ "}\r\n"
			 		+ "]\r\n"
			 		+ "}";
			// 파싱
			JSONParser jsonParser = new JSONParser();
			JSONObject obj = (JSONObject) jsonParser.parse(jsonText);
			
			int id = ((Long) obj.get("id")).intValue();
			String name = (String) obj.get("name");
			
			JSONArray contacts = (JSONArray)obj.get("contacts");
			JSONObject address = (JSONObject) obj.get("address");
			JSONArray orders = (JSONArray)obj.get("orders");			
			
			// DTO 옮겨담고
			orderInfoDTO = new OrderInfoDTO();
			
			orderInfoDTO.setId(id);
			orderInfoDTO.setName(name);
			
			List<ContactDTO> contactList = new ArrayList<>();
			for(int i=0; i<contacts.size(); i++) {
				JSONObject contact = (JSONObject) contacts.get(i);
				ContactDTO ct = new ContactDTO();
				ct.setType(contact.get("type").toString());
				ct.setValue(contact.get("value").toString());
				contactList.add(ct);
			}
			orderInfoDTO.setContacts(contactList);
			
			AddressDTO addressDTO = new AddressDTO();
			addressDTO.setStreet(address.get("street").toString());
			addressDTO.setCity(address.get("city").toString());
			addressDTO.setZipcode(address.get("zipcode").toString());			
			orderInfoDTO.setAddress(addressDTO);
			
			List<OrderDTO> orderList = new ArrayList<>();
			 
			for(int i=0; i<orders.size(); i++) {
				JSONObject order = (JSONObject)orders.get(i);
				OrderDTO oi = new OrderDTO();
				
				oi.setOrderId(order.get("orderId").toString());
				oi.setDate(order.get("date").toString());
				
				List<ItemDTO> itemList = new ArrayList<>();
				
				JSONArray items = (JSONArray)order.get("items");				
				for(int j=0; j<items.size(); j++){
					JSONObject item = (JSONObject)items.get(j);
					
					ItemDTO itemDTO = new ItemDTO();
					itemDTO.setId(Integer.parseInt(item.get("id").toString()));
					itemDTO.setName(item.get("name").toString());
					itemDTO.setQty(Integer.parseInt(item.get("quantity").toString()));
					
					itemList.add(itemDTO);
				}				
				oi.setItems(itemList);
				
				orderList.add(oi);
			}
			orderInfoDTO.setOrders(orderList);
			
		
		} catch (Exception e) {
			
		}
		
		return orderInfoDTO;
	}
}
