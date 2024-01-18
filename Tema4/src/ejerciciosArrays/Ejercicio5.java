package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla1[] = new int [9];
		int num;
		for (int i=1;i<tabla1.length;i++) {
			System.out.println("Escribe la puntuacion del judador "+i+": ");
			num= sc.nextInt();
			tabla1[i]=num;
		}
		Arrays.sort(tabla1);
        int[]ordenadas = new int[8];
        for (int i = 0; i < 8; i++) {
            ordenadas[i] = tabla1[7 - i];
        }
        System.out.println("Ranking de puntuaciones:");

        for (int i = 0; i < 8; i++) {
            System.out.println("Jugador " + (i + 1) + ": " + ordenadas[i]);
        }
		
	}

}
