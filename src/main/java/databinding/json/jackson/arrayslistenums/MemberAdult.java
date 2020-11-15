package databinding.json.jackson.arrayslistenums;

public class MemberAdult extends Member {

	private String memberId;

	public MemberAdult(String name, String dob, String memberId) {
		super(name, dob);
		this.memberId = memberId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

}
