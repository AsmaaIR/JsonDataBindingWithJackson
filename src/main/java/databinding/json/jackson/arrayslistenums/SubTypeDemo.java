package databinding.json.jackson.arrayslistenums;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SubTypeDemo {
	public static void main(String[] args) {

		ObjectMapper mapper = new ObjectMapper();
//		mapper.enableDefaultTyping();
		mapper.enable(SerializationFeature.INDENT_OUTPUT);

		MemberAdult memberAdult = new MemberAdult("Asmaa", "1993-06-20", "x123");
		MemberChild memberChild = new MemberChild("Omar", "2002-01-07", 8, "Fatma");

		List<Member> members = new ArrayList<>();
		members.add(memberChild);
		members.add(memberAdult);

		Patients serializedPatient = new Patients();
		serializedPatient.setMembers(members);

		try {
			String jsonDataString = mapper.writeValueAsString(serializedPatient);
			System.out.println(jsonDataString);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			System.out.print(e);
		}
	}
}
