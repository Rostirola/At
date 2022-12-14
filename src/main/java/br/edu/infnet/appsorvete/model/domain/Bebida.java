package br.edu.infnet.appsorvete.model.domain;

public class Bebida extends Alimento {

	
	private String marca;
	private int tamanho;
	private boolean alcoolico;
	
	public Bebida(float preco, String sabor, int quantidade, String marca) {
		super(preco, sabor, quantidade);
		this.marca = marca;
	}
	
	@Override
	public float calcularValorVenda() {
		
		float valorAlcoolico = alcoolico ? 3 : 0;
		float valorTamanho = tamanho * 0.05f;
		
		return getPreco() + valorAlcoolico + valorTamanho;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(marca);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(alcoolico ? "cerveja" : "refri");
		sb.append(";");
		
		return sb.toString();
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isAlcoolico() {
		return alcoolico;
	}
	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

	
	
	
	
}
