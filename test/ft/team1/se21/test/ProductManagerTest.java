package ft.team1.se21.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import ft.team1.se21.manager.ProductManager;
import ft.team1.se21.model.Category;
import ft.team1.se21.model.Product;

public class ProductManagerTest {

/*	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@SuppressWarnings("deprecation")
	@Test
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
		
		
	}
/*
	@Test
	public void testGetProductsToOrder() {
		//fail("Not yet implemented");
	}

	@Test
	public Product testGetProduct() {
		//fail("Not yet implemented");
		return null;
	}

	@Test
	public void testGenerateReport() {
		//fail("Not yet implemented");
	}
*/
}
