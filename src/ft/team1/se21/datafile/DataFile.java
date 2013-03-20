package ft.team1.se21.datafile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class DataFile {

	private List<String> items;

	public List<String> readFromFile(String path) throws IOException {
		items = new ArrayList<String>();
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String lineItem;
		while ((lineItem = bufferedReader.readLine()) != null) {
			items.add(lineItem);
		}
		return items;
	}

	protected void writeToFile(String path, List<String> items)
			throws IOException {
		FileWriter fileWriter = new FileWriter(path);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
	//bufferedWriter.flush();
		
		for (String lineItem : items) {
			System.out.println("inside for"+lineItem);
			bufferedWriter.write(lineItem);
			//bufferedWriter.newLine();
			
		}
		bufferedWriter.close();
		fileWriter.close();
		
		
	}

}
