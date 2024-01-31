package ejerciciosBidimensionales;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		int tabla[][] = new int[4][5];
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		int minimo = 10;
		int maximo = 0;
		int media = 0;
		int calculo=0;

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
			minimo = 10;
			maximo = 0;
			for (int j = 0; j < tabla[0].length; j++) {
				
				if (tabla[i][j] < minimo) {
					minimo = tabla[i][j];
				}

				if (tabla[i][j] > maximo) {
					maximo = tabla[i][j];
				}
				
				media+=tabla[i][j];
				calculo = media/tabla[0].length;

			}
			System.out.println("La nota minimo del alumno " + (i + 1) + ": " + minimo);
			System.out.println("La nota maxima del alumno " + (i + 1) + ": " + maximo);
			System.out.println("La nota media del alumno " + (i + 1) + ": " + calculo);
		}

	}
}