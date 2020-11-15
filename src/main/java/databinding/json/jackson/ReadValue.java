package databinding.json.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadValue {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			Patient patient = mapper.readValue(new File("patient.json"), Patient.class);

			System.out.println(patient.toString());

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
