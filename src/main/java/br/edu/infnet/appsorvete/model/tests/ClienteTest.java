package br.edu.infnet.appsorvete.model.tests;

import br.edu.infnet.appsorvete.model.domain.Cliente;

public class ClienteTest {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Juan", 947392017, 22, "juan@gmail.com", true);
		System.out.print(c1);
		
		Cliente c2 = new Cliente("Juliana", 938503783, 17, "juliana@gmail.com", false);
		System.out.print(c2);
		
		Cliente c3 = new Cliente("Elbert", 985743029, 30, "elbert@gmail.com", true);
		System.out.print(c3);
	}
}
