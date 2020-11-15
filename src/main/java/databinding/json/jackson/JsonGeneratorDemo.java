package databinding.json.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGeneratorDemo {

	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
		JsonFactory jsonFactory = new JsonFactory();
		try {
			JsonGenerator jsonGenerator = jsonFactory.createGenerator(System.out);
			jsonGenerator.setPrettyPrinter(new DefaultPrettyPrinter());
			jsonGenerator.setCodec(mapper);

			jsonGenerator.writeStartObject();

			jsonGenerator.writeFieldName("first_name");
			jsonGenerator.writeString("Asmaa");

			jsonGenerator.writeFieldName("last_name");
			jsonGenerator.writeString("Ibrahim");

			jsonGenerator.writeStringField("dob", "3/4/2019");

			Patient patient = new Patient();
			patient.setFirstName("Sarah");
			patient.setLastName("Ramadan");

			jsonGenerator.writeFieldName("Paatient_Object");
			jsonGenerator.writeObject(patient);

			jsonGenerator.writeFieldName("recent-visit-array");
			jsonGenerator.writeStartArray();
			jsonGenerator.writeString("23/12/1971");
			jsonGenerator.writeString("27/3/1961");
			jsonGenerator.writeString("20/06/1993");
			jsonGenerator.writeEndArray();

			jsonGenerator.writeEndObject();
			jsonGenerator.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}