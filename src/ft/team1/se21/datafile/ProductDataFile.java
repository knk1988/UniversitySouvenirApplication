package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.Product;

public class ProductDataFile extends DataFile {
	List<Product> productList;

	public List<Product> readProducts(String path) throws IOException {
		// TODO Auto-generated method stub
		List<String> readItemsList = super.readFromFile(path);
		for (String item : readItemsList) {
			String[] productData = item.split(Constants.COMMA);
			Product product = new Product();
			product.setProductId(productData[0]);
			product.setProductName(productData[1]);
			product.setDescription(productData[2]);
			product.setQuantity(productData[3]);
			product.setPrice(productData[4]);
			product.setBarcodeNumber(productData[5]);
			product.setThreshold(productData[6]);
			product.setOrderQuantity(productData[7]);
			productList.add(product);
		}
		return productList;
	}

	protected void writeProducts(String path) throws IOException {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<>();
		StringBuilder buildProduct = new StringBuilder();
		for (Product item : productList) {
			buildProduct.append(item.getProductId());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getProductName());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getDescription());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getQuantity());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getPrice());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getBarcodeNumber());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getThreshold());
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getOrderQuantity());
			buildProduct.append(Constants.NEWLINE);
			items.add(buildProduct.toString());
		}
		super.writeToFile(path, items);
	}

}
