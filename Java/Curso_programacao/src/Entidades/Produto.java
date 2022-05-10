package Entidades;

import java.util.Objects;

public class Produto {

	private String name;
	private double price;
	private int Quantity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public Produto(String name, double price, int Quantity ) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price =price;
		this.Quantity = Quantity;
	}
	
	public Produto(String name, double price ) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price =price;
		this.Quantity = 0;
	}	
	
	public double totalValueInStock() {
		return price * Quantity;
	}
	
	public void addProduct(int qtde) {
		this.Quantity += qtde;
	}
	
	public void removeProdutct(int qtde) {
		this.Quantity -= qtde;
	}

	@Override
	public String toString() {
		return "Produto [name=" + name + ", price=" + price + ", Quantity=" + Quantity + "]";
	}
	


}
