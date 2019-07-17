package Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Enum.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	
	public Order(Date moment, OrderStatus status) {	
		this.moment = moment;
		this.status = status;
	}

	public Order() {
		
	}

	public Date getMoment() {
		return this.moment;
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
	
	
	
	
	

	

}
