package databinding.json.jackson;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParserDemo {

	public static void main(String[] args) throws JsonParseException, IOException {

		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jsonParser = null;
		jsonParser = jsonFactory.createParser(new File("Streaming.json"));

		while (jsonParser.nextToken() != null) {

			JsonToken token = jsonParser.getCurrentToken();
//			System.out.println(token);

			if (token.equals(JsonToken.FIELD_NAME)) {

				String fieldName = jsonParser.currentName();

				jsonParser.nextToken();
				if (fieldName.equals("firstName")) {

					System.out.println(jsonParser.getValueAsString());
				}
			}

		}

		jsonParser.close();
	}

}
