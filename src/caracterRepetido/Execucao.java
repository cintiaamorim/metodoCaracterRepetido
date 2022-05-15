package caracterRepetido;

import javax.swing.JOptionPane;

public class Execucao extends Texto {

	public static void main(String[] args) {
		
		Texto texto = new Texto();		
		
		 String frase = JOptionPane.showInputDialog("Digite o texto");

		 texto.setTexto(frase);
		 
		 System.out.println("Texto:" + frase);
		 
		 texto.caracterRepetido();
		 
		 
	}

}
