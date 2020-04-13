package Principal;

import java.util.Scanner;

import Classes.Soma;

public class Resultado {

	public static void main(String[] args) {
		
		
		System.out.print("Qual a cor do seus olhos? ");
		Scanner sc = new Scanner(System.in);
		Soma s = new Soma();

		s.setOlho(sc.nextLine());
		System.out.println(s.toString());

		s.corOlho();
	

	}

}
