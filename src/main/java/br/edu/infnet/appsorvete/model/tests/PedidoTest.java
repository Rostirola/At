package br.edu.infnet.appsorvete.model.tests;

import br.edu.infnet.appsorvete.model.domain.Cliente;
import br.edu.infnet.appsorvete.model.domain.Pedido;

public class PedidoTest {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juan", 947392017, 22, "juan@gmail.com", true);
		Cliente c3 = new Cliente("Elbert", 985743029, 30, "elbert@gmail.com", true);
		
		Pedido p1 = new Pedido();
		p1.setComentario("Primeiro pedido");
		p1.setCliente(c1);
		p1.setDinheiro(false);
		System.out.print(p1);

		Pedido p2 = new Pedido();
		p2.setComentario("Segundo pedido");
		p2.setCliente(c1);
		p2.setDinheiro(true);
		System.out.print(p2);

		Pedido p3 = new Pedido();
		p3.setComentario("Terceiro pedido");
		p3.setCliente(c3);
		p3.setDinheiro(false);
		System.out.print(p3);
		
	}
}
