package ft.team1.se21.test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import ft.team1.se21.manager.ProductManager;

import ft.team1.se21.model.Product;

public class ProductManagerTest {



/*@Test
	public void testAddProduct() throws IOException {
		
		Product prod = new Product(null, "UCBshirt","UCB",4,(float)1500.0,"abc001",15,25,"CLO");
		assertNotNull(prod);
		ProductManager prMgr = new ProductManager();
		prMgr.addProduct(prod);
		Product prodTest = prMgr.getProduct("CLO/1");
		assertEquals(prodTest.getProductName(),"UCBshirt");
		assertEquals(prodTest.getDescription(),"UCB");
		assertEquals(prodTest.getQuantity(),4);		
		assertEquals(prodTest.getBarcodeNumber(),"abc001");
		assertEquals(prodTest.getThreshold(),15);
		assertEquals(prodTest.getOrderQuantity(),25);
		
		
	}*/

	@Test
	public void testGetProductsToOrder() throws IOException {
		Product prod1 = new Product(null, "UCBshirt","UCB",4,(float)1500.0,"abc001",15,25,"CLO");
		Product prod2 = new Product(null, "LevisShirt","Levis",3,(float)1500.0,"abc001",20,25,"CLO");
		Product prod3 = new Product(null, "Mug","DecorationMug",26,(float)1500.0,"abc001",20,25,"MUG");
		ProductManager prMgr = new ProductManager();
		prMgr.addProduct(prod1);
		prMgr.addProduct(prod2);
		prMgr.addProduct(prod3);
		List<Product> productsBThrshold = new ArrayList<Product>();
		productsBThrshold = prMgr.getProductsToOrder();
		System.out.println("productsBThrshold"+productsBThrshold);
		assertEquals(2,productsBThrshold.size());
		
	}
	/*
	@Test
	public Product testGetProduct() {
		//fail("Not yet implemented");
		return null;
	}
*/
	@Test
	public void testGenerateReport() {
		ProductManager prMgr = new ProductManager();
		prMgr.generateReport();
	}

}
