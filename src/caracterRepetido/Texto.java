package caracterRepetido;

import java.util.HashMap;
import java.util.Map;

public class Texto {

	private String texto;
	private char letra;
	private char comparar;
	private int contador;
	
	public void caracterRepetido() {
		
		Map<Character,Integer> caracter = new HashMap<Character,Integer>();
		
		texto.replaceAll(" ", " ");
		
		comparar = texto.charAt(0);
		
		for (int i=0; i < texto.length(); i++) {
			
			letra = texto.charAt(i);
			
			if (letra == comparar) {
				contador++;
		}
				
			if(letra != comparar)  {
			if(contador >= 2)  {
				contador++;
				
				caracter.put(comparar, contador);	
			}
				contador = 0;
			}
			
			comparar = letra;
		}
		
		if (letra == comparar) {
			contador++;
			caracter.put(comparar, contador);
	}
        for (Character key : caracter.keySet()) {

        	Integer value = caracter.get(key);
            System.out.println(key + " = " + value);
     }
		
	}	

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public char getComparar() {
		return comparar;
	}

	public void setComparar(char comparar) {
		this.comparar = comparar;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	
}
