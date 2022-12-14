package br.edu.infnet.appsorvete.model.tests;

import br.edu.infnet.appsorvete.model.domain.Sorvete;
import br.edu.infnet.appsorvete.model.exceptions.PrecoZeradoException;

public class SorveteTest {

	public static void main(String[] args) {
		
		try {
			Sorvete s1 = new Sorvete(5, "misto", 1, "casquinha");
			s1.setTamanho(300);
			s1.setTooping(true);
			System.out.println(s1);
		} catch (PrecoZeradoException e) {
			System.out.println("[ERRO}" + e.getMessage());
		}
		
		
		try {
			Sorvete s2 = new Sorvete(8, "natagoiaba", 3, "cascao");
			s2.setTamanho(500);
			s2.setTooping(true);
			System.out.println(s2);
		} catch (PrecoZeradoException e) {
			System.out.println("[ERRO}" + e.getMessage());
		}
		
		
		try {
			Sorvete s3 = new Sorvete(8, "acaibanana", 12, "cascao");
			s3.setTamanho(500);
			s3.setTooping(false);
			System.out.println(s3);
		} catch (PrecoZeradoException e) {
			System.out.println("[ERRO}" + e.getMessage());
		}
		
		
	}
}
