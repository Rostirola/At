package br.edu.infnet.appsorvete.model.tests;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.appsorvete.model.domain.Alimento;
import br.edu.infnet.appsorvete.model.domain.Bebida;
import br.edu.infnet.appsorvete.model.domain.Cliente;
import br.edu.infnet.appsorvete.model.domain.Milkshake;
import br.edu.infnet.appsorvete.model.domain.Pedido;
import br.edu.infnet.appsorvete.model.domain.Sorvete;

public class PedidoTest {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juan", 947392017, 22, "juan@gmail.com", true);
		Cliente c3 = new Cliente("Elbert", 985743029, 30, "elbert@gmail.com", true);
		
		Bebida b1 = new Bebida(12, "cola", 1, "cocacola");
		b1.setTamanho(500);
		b1.setAlcoolico(false);
		Bebida b2 = new Bebida(5, "chopp", 3, "brahma");
		b2.setTamanho(473);
		b2.setAlcoolico(true);
		Bebida b3 = new Bebida(2, "laranja", 2, "schin mini");
		b3.setTamanho(250);
		b3.setAlcoolico(false);
		
		Milkshake m1 = new Milkshake(12, "morango", 3, 500);
		m1.setEspecial(false);
		m1.setChantily(true);
		Milkshake m2 = new Milkshake(8, "napolitano", 5, 300);
		m2.setEspecial(false);
		m2.setChantily(true);
		Milkshake m3 = new Milkshake(20, "nutella", 1, 1000);
		m3.setEspecial(true);
		m3.setChantily(false);
		
		Sorvete s1 = new Sorvete(5, "misto", 1, "casquinha");
		s1.setTamanho(300);
		s1.setTooping(true);
		Sorvete s2 = new Sorvete(8, "natagoiaba", 3, "cascao");
		s2.setTamanho(500);
		s2.setTooping(true);
		Sorvete s3 = new Sorvete(8, "acaibanana", 12, "cascao");
		s3.setTamanho(500);
		s3.setTooping(false);
		
		List<Alimento> alimentoP1 = new ArrayList<Alimento>();
		alimentoP1.add(s3);
		alimentoP1.add(b1);
		alimentoP1.add(m3);
		
		List<Alimento> alimentoP2 = new ArrayList<Alimento>();
		alimentoP2.add(s2);
		alimentoP2.add(b3);
		alimentoP2.add(m1);
		
		List<Alimento> alimentoP3 = new ArrayList<Alimento>();
		alimentoP3.add(s1);
		alimentoP3.add(b2);
		alimentoP3.add(m2);
		
		Pedido p1 = new Pedido();
		p1.setComentario("Primeiro pedido");
		p1.setCliente(c1);
		p1.setDinheiro(false);
		p1.setAlimentos(alimentoP1);
		p1.imprimir();

		Pedido p2 = new Pedido();
		p2.setComentario("Segundo pedido");
		p2.setCliente(c1);
		p2.setDinheiro(true);
		p2.setAlimentos(alimentoP2);
		p2.imprimir();

		Pedido p3 = new Pedido();
		p3.setComentario("Terceiro pedido");
		p3.setCliente(c3);
		p3.setDinheiro(false);
		p3.setAlimentos(alimentoP3);
		p3.imprimir();
		
	}
}
