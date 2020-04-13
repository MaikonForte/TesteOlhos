package Classes;

public class Soma {

	private String olho;

	// Metodos Especiais
	public String getOlho() {
		return olho;
	}

	public void setOlho(String olho) {
		this.olho = olho;
	}

	//Metodos publicos
	public void corOlho() {
		if (this.olho.equals("Azul") || this.olho.equals("Azuis")  || this.olho.equals("azul") || this.olho.equals("azuis")) {
			System.out.println("Sempre quis nessa joia pôr a mão\r\n" + 
					"Também, esses olhos azuis, quem é que não tem paixão");
		} 
		
		else if (this.olho.equals("Verde") || this.olho.equals("Verdes") || this.olho.equals("verde") || this.olho.equals("verdes")) {
			System.out.println("Jurei, vou te fazer feliz nada importa,\r\n" 
		+ "Mirei nos olhos verdes e senti,\r\n"
					+ "Pensei é a minha chance de ser feliz.");

		} else {
			System.out.println("Teus olhos castanhos\r\n" + 
		"De encantos tamanhos\r\n" 
		+ "São pecados meus");
		}
	}
	
	
	//Polimorfiso Sobrescreva
	@Override
	public String toString() {
		return "Cor dos Olhos = " + olho;
	}

}
