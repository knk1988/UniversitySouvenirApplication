//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : POLineItems.java
//  @ Date : 3/16/2013
//  @ Author : 
//
//

package ft.team1.se21.model;


public class POLineItem {

	private String productId;
	private String vendorName;
	private int quantity;

	public POLineItem() {
		super();

	}

	public POLineItem(String productId, String vendorName, int quantity) {
		super();
		this.productId = productId;
		this.vendorName = vendorName;
		this.quantity = quantity;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
