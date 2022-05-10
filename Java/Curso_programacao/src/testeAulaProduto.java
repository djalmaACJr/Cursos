import Entidades.Produto;

public class testeAulaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto product = new Produto("televisão", 1500, 5);
		System.out.printf("dados do Produto: nome [%s], " +
				                            "qtde: %d " + 
				                            "valor unit %.2f " + 
				                            "Total em estoque : %.2f", 
				                            product.getName(), 
				                            product.getQuantity(), 
				                            product.getPrice(), 
				                            product.totalValueInStock()
				          );
	   
		//System.out.println(product.toString());
		System.out.println("");
		product.addProduct(3);
		System.out.println("novo estoque " + product.getQuantity());
		product.removeProdutct(1);
		System.out.println(product);
		

	}

}
