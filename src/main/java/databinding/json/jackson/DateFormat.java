package databinding.json.jackson;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DateFormat {

	public static void main(String[] args) throws ParseException {
		ObjectMapper mapper = new ObjectMapper();

		try {
			Patient patient = mapper.readValue(new File("patient.json"), Patient.class);

			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");

			Date date = df.parse(patient.getDateOfBirth());

			Event event = new Event("birthdate", date);

			mapper.setDateFormat(df);
			System.out.println(mapper.writeValueAsString(event));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
}
