package application;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.eneum.OrderStatus;

public class Program_Pedidoo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		DateTimeFormatter fmt= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt1= DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		
		
		System.out.println("Enter cliente data:");
		System.out.printf("Name:");
		String name=sc.nextLine();
		System.out.printf("Email:");
		String email= sc.next();
		System.out.printf("Birth date (DD/MM/YYYY) :");
		String btDate= sc.next();
		LocalDate birthDate= LocalDate.parse(btDate,fmt);
		
		System.out.println("Enter order data:");
		System.out.printf("Status:");
		String status= sc.next();
		
		Client cliente = new Client(name, email, birthDate);
	
		
		Order ordem= new Order(LocalDateTime.now(), OrderStatus.valueOf(status) , cliente);
		
		
		
		System.out.printf("How many items to this order ?");
		int n= sc.nextInt();
		
		for(int i=1; i<= n; i++) {
			System.out.println("Enter #"+i+ " item data :");
			System.out.printf("Product name:");
			sc.nextLine();
			String pname= sc.nextLine();
			System.out.printf("Product price:");
			Double pprice= sc.nextDouble();
			System.out.printf("Quantity:");
			int quantity= sc.nextInt();
			
			Product produto= new Product(pname, pprice);
			
			OrderItem ordemItem= new OrderItem(produto, quantity, pprice);
			
			ordem.addItem(ordemItem);
			
			
		}
		
		System.out.println();
		System.out.println(ordem);
		
		
		
		
				
	
		
		
		
		
		
		
		
		
		
		
		
		
		sc.close();
		
	}

}
