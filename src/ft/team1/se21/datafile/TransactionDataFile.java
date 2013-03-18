package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ft.team1.se21.constants.Constants;

import ft.team1.se21.model.Member;
import ft.team1.se21.model.TransactionLineItem;

public class TransactionDataFile extends DataFile {
	
	Map<String,List<TransactionLineItem>> transactionList;

	public List<TransactionLineItem> readTransactions(String path) throws IOException {

		List<String> readTransactionList = super.readFromFile(path);
		for (String item : readTransactionList) {
			String[] transactionData = item.split(Constants.COMMA);
			TransactionLineItem transactionItem = new TransactionLineItem();
			transactionItem.setMemberId(transactionData[0]);
			transactionItem.setMemberId(transactionData[1]);
			transactionItem.setMemberId(transactionData[2]);
			transactionList.add(transactionItem);
		}
		return transactionList;
	}

	public void writeMembers(String path) throws IOException {
		List<String> items = new ArrayList<>();
		// Change it later
		List<Member> memberList = null;
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
