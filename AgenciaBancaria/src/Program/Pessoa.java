package Program;

public class Pessoa {
	
	private static int counter = 1;
	
	private String nome;
	private String cpf;
	private String email;
	
	
	
	public Pessoa(String nome, String cpf, String email) {
		nome = nome;
		cpf = cpf;
		email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public String getCPF() {
		return cpf;
	}
	public void setCPF(String cPF) {
		cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		email = email;
	}
	
}
