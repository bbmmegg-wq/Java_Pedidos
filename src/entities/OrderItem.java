package entities;

public class OrderItem {
	
	
	private Product produto;
	private Integer quantity;
	private Double price;
	
	
	
	
	public OrderItem(Product produto, Integer quantity, Double price) {
		
		this.produto = produto;
		this.quantity = quantity;
		this.price = price;
	}
	
	public OrderItem() {
		
	}

	public Product getProduto() {
		return produto;
	}

	public void setProduto(Product produto) {
		this.produto = produto;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public double subTotal() {
		double subTotal=0;
		subTotal= price*quantity;

		
		
		return subTotal;
		
	}
	
	public String toString() {
		return produto.getName()
			+ ", $"
			+ String.format("%.2f",price)
			+", Quantidade: "
			+ quantity
			+ ", Subtotal : $"
			+ String.format("%.2f", subTotal());
		
		
			
		
		
		
		
		
		
	}
	

}
