package ft.team1.se21.model;

public class Member {
	private String memberName;
	private String memberId;
	private int points;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String memberName, String memberId, int points) {
		super();
		this.memberName = memberName;
		this.memberId = memberId;
		this.points = points;
	}

	public String getName() {
		return memberName;
	}

	public void setName(String name) {
		this.memberName = name;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}