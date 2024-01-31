package ejerciciosBidimensionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int minimo = 10;
		int maximo = 0;

		for (int i = 0; i < tabla.length; i++) {
			for (int j = 0; j < tabla[0].length; j++) {
				System.out.print("Introduce la nota " + (j + 1) + " del alumno " + (i + 1) + ": ");
				tabla[i][j] = sc.nextInt();

			}
			System.out.println();
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			for (int j = 0; j < tabla[0].length; j++) {

				System.out.print(tabla[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < tabla.length; i++) {
			System.out.print("Alumno " + (i + 1) + ": ");
			for (int j = 0; j < tabla[0].length; j++) {
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
					System.out.println("La nota minimo del alumno: " + (i + 1) + " es: " + minimo);

				}
				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
					System.out.println("La nota maxima del alumno: " + (i + 1) + " es: " + maximo);
				}
			}
			
		}

	}

}
