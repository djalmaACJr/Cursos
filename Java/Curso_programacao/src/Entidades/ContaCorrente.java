package Entidades;

public class ContaCorrente {
	static int proxCodConta;
	
	private int numConta;
	private String nomeConta;
	private double saldoConta;
	
	private int geraCodConta(){
		proxCodConta ++;
		return proxCodConta;
	}
	
	public ContaCorrente(String nomeConta, double saldoConta) {
		super();
		this.numConta = geraCodConta();
		this.nomeConta = nomeConta;
		this.saldoConta = saldoConta;
	}
	
	public ContaCorrente(String nomeConta) {
		super();
		this.numConta = geraCodConta();
		this.nomeConta = nomeConta;
		this.saldoConta = 0;
	}

	
	public int getNumConta() {
		return numConta;
	}


	public String getNomeConta() {
		return nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public double getSaldoConta() {
		return saldoConta;
	}
	
	public void deposito(double valor) {
		this.saldoConta += valor;
	}
	
	public void saque(double valor) {
		this.saldoConta -= valor;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numConta=" + numConta + ", nomeConta=" + nomeConta + ", saldoConta=" + saldoConta + "]";
	}

	
}
