package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.Product;

// Product Data File
public class ProductDataFile extends DataFile {
	List<Product> productList = new ArrayList<Product>();

	public List<Product> readProducts(String path) throws IOException {
		// TODO Auto-generated method stub
		List<String> readItemsList = super.readFromFile(path);
		for (String item : readItemsList) {
			System.out.println(item);
			String[] productData = item.split(Constants.COMMA);
			System.out.println("size"+productData.length);
			Product product = new Product();
			product.setProductId(productData[0]);
			System.out.println("productData[0]"+productData[0]);
			System.out.println("productData[1]"+productData[1]);
			product.setProductName(productData[1]);
			product.setDescription(productData[2]);
			product.setQuantity(Integer.parseInt(productData[3]));
			product.setPrice(Float.parseFloat(productData[4]));
			product.setBarcodeNumber(productData[5]);
			product.setThreshold(Integer.parseInt(productData[6]));
			product.setOrderQuantity(Integer.parseInt(productData[7]));
			product.setCategoryCode(productData[8]);
			productList.add(product);
		}
		return productList;
	}

	public void writeProducts(String path) throws IOException {
		// TODO Auto-generated method stub
		List<String> items = new ArrayList<>();
		
		for (Product item : productList) {
			StringBuilder buildProduct = new StringBuilder();
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
			buildProduct.append(Constants.COMMA);
			buildProduct.append(item.getCategoryCode());
			buildProduct.append(Constants.NEWLINE);
			items.add(buildProduct.toString());
		}
		super.writeToFile(path, items);
	
	}

	/**
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}

	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

}
