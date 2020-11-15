package databinding.json.jackson.arrayslistenums;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum Height {
	INCH("inches", 1.23), CENTIMETER("CM", 15.5);

	private String unit;
	private final double length;

	private Height(String unit, double length) {
		this.unit = unit;
		this.length = length;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public double getLength() {
		return length;
	}

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			
			System.out.println(mapper.writeValueAsString(Height.INCH.length*86+ "CM"));
		} catch (JsonProcessingException e) {

			
		}

	}

}
