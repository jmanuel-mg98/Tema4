package ejerciciosCadenas;

import java.util.Arrays;

public class Ejercicio05 {

	public static void main(String[] args) {
		String frase= "ya vienen los reyes magos";
		System.out.println(fraseReves(frase));	
	}

	public static String fraseReves(String frase) {
		String fraseReves="";
		for (int i=frase.length()-1;i>=0;i--) {
		fraseReves+=frase.charAt(i);
		}
		return fraseReves;
	}

}
