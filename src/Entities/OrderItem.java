package Entities;



public class OrderItem{
	
	//Atributos
	private	Integer quantity;
	private Double price;
	
	
	//composi��o
	private Product product;
	
	
	
	public OrderItem (Integer quantity, Double price,Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}
	
	public OrderItem() {
		
	}
		

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return getQuantity()*getProduct().getPrice();
	}
	
}
