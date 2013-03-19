package ft.team1.se21.model;

public class Member {
	private String memberName;
	private String memberId;
	private int points;
	private Boolean firstTimeStatus;

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(String memberName, String memberId, int points, Boolean firstTimeStatus) {
		super();
		this.memberName = memberName;
		this.memberId = memberId;
		this.points = points;
		this.firstTimeStatus = firstTimeStatus;
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

	public Boolean getFirstTimeStatus() {
		return firstTimeStatus;
	}

	public void setFirstTimeStatus(Boolean firstTimeStatus) {
		this.firstTimeStatus = firstTimeStatus;
	}
	

}