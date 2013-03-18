package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.Category;


public class CategoryDataFile extends DataFile {
	List<Category> categoryList;

	public List<Category> readCategories(String path) throws IOException {

		List<String> readItemsList = super.readFromFile(path);
		for (String item : readItemsList) {
			String[] categoryData = item.split(Constants.COMMA);
			Category categoryItem = new Category();
			categoryItem.setCategoryCode(categoryData[0]);
			categoryItem.setName(categoryData[1]);
			categoryList.add(categoryItem);
		}
		return categoryList;
	}

	public void writeCategories(String path) throws IOException {
		List<String> items = new ArrayList<>();
		StringBuilder buildCategory = new StringBuilder();
		for (Category item : categoryList) {
			buildCategory.append(item.getCategoryCode());
			buildCategory.append(Constants.COMMA);
			buildCategory.append(item.getName());			
			buildCategory.append(Constants.NEWLINE);
			items.add(buildCategory.toString());
		}
		super.writeToFile(path, items);
	}

}
