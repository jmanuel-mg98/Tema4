package ejerciciosCadenas;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase="";
		String palabras="";
		System.out.println("Introduce palabras para crear una frase. Para salir escribe fin");
		palabras=sc.next();
		while (!palabras.equalsIgnoreCase("fin")) {
			frase+=palabras+" ";
			System.out.println("introduce otra palabra");
			palabras=sc.next();
		}
	System.out.println(frase);
	
		
		
		

	}

}
