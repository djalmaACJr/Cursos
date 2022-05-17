package Entidades;

public class locatario {

	public String Nome;
	public String Email;
	

	@Override
	public String toString() {
		return "locatario [Nome=" + Nome + ", Email=" + Email + "]";
	}
	
	public locatario(String nome, String email) {
		super();
		Nome = nome;
		Email = email;
	}

}
