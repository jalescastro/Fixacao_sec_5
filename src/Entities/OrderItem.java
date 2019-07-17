package Entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderItem {
	private Integer quantity;
	private Double price;
	private List<Product> proList = new ArrayList<>();
	

	public OrderItem(Integer quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}
	
	public OrderItem () {
		
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
	
	public List<Product> getProList() {
		return this.proList;
	}
	
	public void addItem(Product item){
	
			this.proList.add(item);
		
		
	}
	
	public void removeItem(Product item) {
		int cont;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many itens do you want to remove");
		cont = scan.nextInt();
		
		for (int i = 0; i < cont; i++) {
			
			this.proList.remove(item);
			
		}
		
		
	}
	
	
	public Double subTotal(List list) {
		
		
		return 2.0;
	}
	

}
