package ft.team1.se21.datafile;

import java.io.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ft.team1.se21.constants.Constants;

import ft.team1.se21.model.Member;
import ft.team1.se21.model.TransactionLineItem;

public class TransactionDataFile extends DataFile {

	private Map<String, List<TransactionLineItem>> transactionMap;

	public Map<String, List<TransactionLineItem>> getTransactionMap() {
		return transactionMap;
	}

	public void setTransactionMap(
			Map<String, List<TransactionLineItem>> transactionMap) {
		this.transactionMap = transactionMap;
	}
	
	public long getLastTransactionId(String path) throws IOException{
		 long transactionId;
		 File file = new File(path);
		 String lastLine = getTail(file);
		 String[] arr =lastLine.split(",");
		 if(arr[0] == null || arr[0] == ""){
			 transactionId = 0;
		 }
		 else{
			 transactionId = Long.parseLong(arr[0]);
		 }		 
		 return transactionId;
	}
	
	private String getTail(File file) throws IOException {
		RandomAccessFile fileHandler = null;
	    try {
	        fileHandler = new RandomAccessFile(file, "r");
	        long fileLength = file.length() - 1;
	        StringBuilder sb = new StringBuilder();

	        for(long filePointer = fileLength; filePointer != -1; filePointer--){
	            fileHandler.seek( filePointer );
	            int readByte = fileHandler.readByte();

	            if( readByte == 0xA ) {
	                if( filePointer == fileLength ) {
	                    continue;
	                } else {
	                    break;
	                }
	            } else if( readByte == 0xD ) {
	                if( filePointer == fileLength - 1 ) {
	                    continue;
	                } else {
	                    break;
	                }
	            }
	            sb.append( ( char ) readByte );
	        }
	        String lastLine = sb.reverse().toString();
	        return lastLine;
	    } catch( java.io.FileNotFoundException e ) {
	        e.printStackTrace();
	        return null;
	    } catch( java.io.IOException e ) {
	        e.printStackTrace();
	        return null;
	    }
	    finally {
	    	fileHandler.close(); 
	    }
	}

	public Map<String, List<TransactionLineItem>> readTransactions(String path)
			throws IOException, ParseException {

		List<String> readTransactionList = super.readFromFile(path);
		transactionMap = new HashMap<String, List<TransactionLineItem>>();
		for (String item : readTransactionList) {
			String[] transactionData = item.split(Constants.COMMA);
			TransactionLineItem transactionItem = new TransactionLineItem();
			List<TransactionLineItem> txnLineItemList;
			transactionItem.setMemberId(transactionData[1]);
			transactionItem.setProductId(transactionData[2]);
			transactionItem.setQuantity(Integer.parseInt(transactionData[3]));
			SimpleDateFormat dateFormat = new SimpleDateFormat();
			transactionItem.setTxnDate(dateFormat.parse(transactionData[4]));
			if (transactionMap.get(transactionData[0]) != null) {

				List<TransactionLineItem> txnItemList = transactionMap
						.get(transactionData[0]);
				txnItemList.add(transactionItem);

			} else {
				txnLineItemList = new ArrayList<TransactionLineItem>();
				txnLineItemList.add(transactionItem);
				transactionMap.put(transactionData[0], txnLineItemList);
			}
		}
		return transactionMap;
	}

	public void writeTransactions(String path) throws IOException {
//		List<String> items = new ArrayList<>();
//		// Change it later
//		List<Member> memberList = null;
//		StringBuilder buildTransaction = new StringBuilder();
//		for (Transaction txnItem : ) {
//			buildMember.append(member.getMemberId());
//			buildMember.append(Constants.COMMA);
//			buildMember.append(member.getName());
//			buildMember.append(Constants.COMMA);
//			buildMember.append(member.getPoints());
//			buildMember.append(Constants.NEWLINE);
//			items.add(buildMember.toString());
//		}
//		Map<String,List<TransactionLineItem>> transMap=getTransactionMap();
//		transMap.get(key)
//		
//		super.writeToFile(path, items);
	}

}
