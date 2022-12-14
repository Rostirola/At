package br.edu.infnet.appsorvete.model.tests;

import br.edu.infnet.appsorvete.model.domain.Milkshake;

public class MilkshakeTest {

	public static void main(String[] args) {
		
		Milkshake m1 = new Milkshake(12, "morango", 3, 500);
		m1.setEspecial(false);
		m1.setChantily(true);
		System.out.println(m1);
		
		Milkshake m2 = new Milkshake(8, "napolitano", 5, 300);
		m2.setEspecial(false);
		m2.setChantily(true);
		System.out.println(m2);
		
		Milkshake m3 = new Milkshake(20, "nutella", 1, 1000);
		m3.setEspecial(true);
		m3.setChantily(false);
		System.out.println(m3);
		
	}
}
