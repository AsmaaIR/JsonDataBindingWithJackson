package databinding.json.jackson.treemodel;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelReader {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {

		ObjectMapper mapper = new ObjectMapper();

		String jsonString = "{\r\n" + 
				"  \"VID54321\": {\r\n" + 
				"    \"2787\": {\r\n" + 
				"      \"order_id\": \"2787\",\r\n" + 
				"      \"order_date\": \"2015-12-09 05:35:55\",\r\n" + 
				"      \"denomination_id\": \"3\",\r\n" + 
				"      \"denomination_name\": \"$10\",\r\n" + 
				"      \"order_quantity\": \"1\",\r\n" + 
				"      \"vendor_order_id\": \"VID54321\",\r\n" + 
				"      \"vendor_location\": \"VendorPoS1\",\r\n" + 
				"      \"vendor_current_balance\": \"890.00\",\r\n" + 
				"      \"vouchers\": {\r\n" + 
				"        \"5054\": {\r\n" + 
				"          \"Serial Number\": \"\\\"NEGDIT100707007\\\"\",\r\n" + 
				"          \"Pin Code\": \"\\\"XXMP8G9KD546Q038\\\"\"\r\n" + 
				"        }\r\n" + 
				"      }\r\n" + 
				"    }\r\n" + 
				"  }\r\n" + 
				"}\r\n" + 
				"";

		JsonNode jsonNode = mapper.readTree(jsonString);
		System.out.println(jsonNode.findValue("Serial Number"));

		JsonNode voucherElement = jsonNode.findPath("vouchers");
		System.out.println(voucherElement);
		System.out.println(voucherElement.isMissingNode());
		System.out.println(voucherElement.isEmpty());
		System.out.println(voucherElement.isNull());
		System.out.println(voucherElement.size() == 0);

	}
}
