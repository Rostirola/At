package br.edu.infnet.appsorvete.model.domain;

public abstract class Alimento {

	private float preco;
	private String sabor;
	private int quantidade;
	
	public Alimento(float preco, String sabor, int quantidade) {
		this.preco = preco;
		this.sabor = sabor;
		this.quantidade = quantidade;
	}
	
	public abstract float calcularValorVenda();
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(preco);
		sb.append(";");
		sb.append(sabor);
		sb.append(";");
		sb.append(quantidade);
		sb.append(";");
		
		return sb.toString();
	}

	public float getPreco() {
		return preco;
	}

	public String getSabor() {
		return sabor;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	
	
	
}
