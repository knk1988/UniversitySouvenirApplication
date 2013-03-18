package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;

import ft.team1.se21.model.Member;

public class MemberDataFile extends DataFile {

	List<Member> memberList;

	public List<Member> readMembers(String path) throws IOException {

		List<String> readMemberList = super.readFromFile(path);
		for (String item : readMemberList) {
			String[] memberData = item.split(Constants.COMMA);
			Member member = new Member();
			member.setMemberId(memberData[0]);
			member.setName(memberData[1]);
			member.setPoints(Integer.parseInt(memberData[2]));
			memberList.add(member);
		}
		return memberList;
	}

	public void writeMembers(String path) throws IOException {
		List<String> items = new ArrayList<>();
		StringBuilder buildMember = new StringBuilder();
		for (Member member : memberList) {
			buildMember.append(member.getMemberId());
			buildMember.append(Constants.COMMA);
			buildMember.append(member.getName());
			buildMember.append(Constants.COMMA);
			buildMember.append(member.getPoints());
			buildMember.append(Constants.NEWLINE);
			items.add(buildMember.toString());
		}
		super.writeToFile(path, items);
	}

}
