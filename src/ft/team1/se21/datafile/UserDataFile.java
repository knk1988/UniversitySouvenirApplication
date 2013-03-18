package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.Category;
import ft.team1.se21.model.User;

public class UserDataFile extends DataFile {
List<User> userList;

public List<User> readUserList(String path) throws IOException {

	List<String> readItemsList = super.readFromFile(path);
	for (String item : readItemsList) {
		String[] userData = item.split(Constants.COMMA);
		User userItem = new User();
		userItem.setUserId(userData[0]);
		userItem.setPassword(userData[1]);
		userList.add(userItem);
	}
	return userList;
}

public void writeUserList(String path) throws IOException {
	List<String> items = new ArrayList<>();
	StringBuilder buildCategory = new StringBuilder();
	for (User item : userList) {
		buildCategory.append(item.getUserId());
		buildCategory.append(Constants.COMMA);
		buildCategory.append(item.getPassword());			
		buildCategory.append(Constants.NEWLINE);
		items.add(buildCategory.toString());
	}
	super.writeToFile(path, items);
}


}
