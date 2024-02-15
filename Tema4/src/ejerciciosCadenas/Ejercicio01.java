package ejerciciosCadenas;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		System.out.println("introduce una frase:");
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		System.out.println("introduce otra frase: ");
		String frase2 = sc.nextLine();
		if (frase.length()>frase2.length()) {
			System.out.println("la primera frase es mayor que la segunda");
		}else 
			System.out.println("la segunda es mayor que la primera");
		
	}

}