package br.edu.infnet.appsorvete.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Pedido {

	private String comentario;
	private boolean dinheiro;
	private LocalDateTime data;
	private String vendedor;
	private Cliente cliente;
	private List<Alimento> alimentos;

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public boolean isDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(boolean dinheiro) {
		this.dinheiro = dinheiro;
	}
	
	public void imprimir() {
		System.out.println("Pedido: " + this);
		System.out.println("Qtde Alimentos: " + alimentos.size());
		System.out.println("Cliente: " + cliente);
	}

	public Pedido() {

		data = LocalDateTime.now();
	}
	
	@Override
	public String toString() {
		
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

		return String.format("%s;%s;%s", comentario, dinheiro ? "dinheiro" : "cartao", data.format(formato));
		
		 
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public LocalDateTime getData() {
		return data;
	}

}
