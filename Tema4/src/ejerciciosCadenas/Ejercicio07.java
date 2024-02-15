package ejerciciosCadenas;

public class Ejercicio07 {

	public static void main(String[] args) {
		String frase="ole ole holanda";
		String palabra="ole";
		int contador=0;
		
		contador =contarPalabra(frase, palabra);
		System.out.println("la palabra aparacece "+contador+" veces");
	}

	public static int contarPalabra(String frase, String palabra) {
		int repeticion= 0;
		String [] palabras=frase.split(" ");
		for (int i=0;i<palabras.length;i++) {
			if(palabras[i].equalsIgnoreCase(palabra)) {
				repeticion++;
			}
		}
		return repeticion;
	}

}
