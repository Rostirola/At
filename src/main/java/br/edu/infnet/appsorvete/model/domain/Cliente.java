package br.edu.infnet.appsorvete.model.domain;

public class Cliente {

	private String nome;
	private int cpf;
	private int idade;
	private String email;
	private boolean genero;
	
	
	
	public Cliente(String nome, int cpf, int idade, String email, boolean genero) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.email = email;
		this.genero = genero;
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append(nome);
		sb.append(";");
		sb.append(cpf);
		sb.append(";");
		sb.append(idade);
		sb.append(";");
		sb.append(email);
		sb.append(";");
		sb.append(genero);
		sb.append(";");
		
		return sb.toString();
	}	

	public boolean isGenero() {
		return genero;
	}

	public String getEmail() {
		return email;
	}

	public int getIdade() {
		return idade;
	}

	public int getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	
	
	
}
