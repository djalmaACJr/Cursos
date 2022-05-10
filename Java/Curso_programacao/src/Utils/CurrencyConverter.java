package Utils;

public  class CurrencyConverter {
	
	static final double TAX = 0.06;
	
	static public double converter(double qtde, double vlr ) {
		double total = qtde * vlr;
		return total += total * TAX ;
	}
	

}
