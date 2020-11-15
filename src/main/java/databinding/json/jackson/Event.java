package databinding.json.jackson;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class Event {

	public String name;

//	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd hh:mm")
//	public Date birthDate;

	@JsonSerialize(using = CustomDataSerialize.class)
	public Date birthDate;

	public Event(String name, Date birthDate) {

		this.name = name;
		this.birthDate = birthDate;
	}

}
