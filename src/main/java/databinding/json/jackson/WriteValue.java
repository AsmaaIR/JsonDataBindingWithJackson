package databinding.json.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class WriteValue {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();

		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		Patient patient = new Patient("Asmaa", "Ibrahim", "1993-06-20", "01068175872", "Cairo");

		try {
			mapper.writeValue(new File("writeValue.json"), patient);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}
