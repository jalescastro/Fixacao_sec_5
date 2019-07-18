package Entities;

import java.util.Date;
import java.util.List;

import Enum.OrderStatus;

public class Order{
	
	private Date moment;
	private OrderStatus status;
	
	
	
	
	//Composição
	private Client client;
	private List<OrderItem> list;
	
	public Order(Date date, OrderStatus status2, Client client2) {
		
	}
	
	public Date getMoment() {
		return this. moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public OrderStatus getStatus() {
		return this.status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	public Client getClient() {
		return this.client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public List<OrderItem> getList() {
		return this.list;
	}
	
	public void addItem(OrderItem item) {
		
		getList().add(item);
		
	}
	
	public void removeItem(OrderItem item) {
		
		getList().remove(item);
		
	}
	
	
	public Double total () {
		Double aux = 0.0;
		int cont = 0;
		for (OrderItem item : list) {
			
			aux += item.subTotal();
					
			cont++;
		}
		
		return aux;
	}
	
	
	
	
	
	
}