package br.edu.infnet.appsorvete.model.domain;

import br.edu.infnet.appsorvete.model.exceptions.PrecoZeradoException;
import br.edu.infnet.appsorvete.model.exceptions.TamanhoSorveteInvalidoException;

public class Sorvete extends Alimento {

	private String tipo;
	private int tamanho;
	private boolean tooping;
	
	public Sorvete(float preco, String sabor, int quantidade, String tipo) throws PrecoZeradoException {
		super(preco, sabor, quantidade);
		this.tipo = tipo;
	}
	
	@Override
	public float calcularValorVenda() throws TamanhoSorveteInvalidoException {
		
		if(tamanho < 200) {
			throw new TamanhoSorveteInvalidoException ("O tamanho do sorvete está inválido!");
		}
		
		float temTooping = tooping ? 3 : 0;
		float valorTamanho = tamanho * 0.05f;
		
		return getPreco() + temTooping + valorTamanho;
	}
	
	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(";");
		sb.append(tipo);
		sb.append(";");
		sb.append(tamanho);
		sb.append(";");
		sb.append(tooping ? "tooping=S" : "tooping=N");
		sb.append(";");
		
		return sb.toString();
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public boolean isTooping() {
		return tooping;
	}
	public void setTooping(boolean tooping) {
		this.tooping = tooping;
	}
	
	
}
