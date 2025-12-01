package entities;
import entities.OrderItem;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entities.eneum.OrderStatus;

public class Order {
	private DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	
	
	private LocalDateTime moment;
	private OrderStatus status;
	
	private List<OrderItem> listaDeItens= new ArrayList <>();
	
	
	private Client cliente;
	
	

	public Order() {
		
	}



	public Order(LocalDateTime moment, OrderStatus status, Client cliente) {
		
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}



	public LocalDateTime getMoment() {
		return moment;
	}


	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}	



	public OrderStatus getStatus() {
		return status;
	}



	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	


	public Client getCliente() {
		return cliente;
	}



	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(OrderItem item) {
		listaDeItens.add(item);
	}
	public void removeItem(OrderItem item) {
		listaDeItens.remove(item);
	}
	
	public double total() {
		double soma=0.0;
		for (OrderItem c: listaDeItens) {
			soma+= c.subTotal();
			
		}
		return soma;
	}
	
	public String toString() {
		StringBuilder sb= new StringBuilder();
		
		sb.append("ORDER SUMARY :\n");
		sb.append("Order moment: ");
		sb.append( moment.format(fmt1));
		sb.append("\nOrder Status :");
		sb.append (status);
		sb.append("\n");
		sb.append(cliente);
		
		sb.append("\nOrder items: \n");
		
		
		for (OrderItem c: listaDeItens) {
			sb.append(c);
			
			sb.append("\n");
			
			
			
		}
		sb.append("\nTotal Price :$");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		

	}
}
