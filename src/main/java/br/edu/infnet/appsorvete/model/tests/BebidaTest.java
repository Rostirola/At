package br.edu.infnet.appsorvete.model.tests;

import br.edu.infnet.appsorvete.model.domain.Bebida;

public class BebidaTest {

	public static void main(String[] args) {
		
		Bebida b1 = new Bebida(12, "cola", 1, "cocacola");
		b1.setTamanho(500);
		b1.setAlcoolico(false);
		System.out.println(b1);
		
		Bebida b2 = new Bebida(5, "chopp", 3, "brahma");
		b2.setTamanho(473);
		b2.setAlcoolico(true);
		System.out.println(b2);
		
		Bebida b3 = new Bebida(2, "laranja", 2, "schin mini");
		b3.setTamanho(250);
		b3.setAlcoolico(false);
		System.out.println(b3);
	}
}
