package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla1[] = new int [8];
		int num;
		for (int i=0;i<tabla1.length;i++) {
			System.out.println("Escribe la puntuacion del judagor "+i+": ");
			num= sc.nextInt();
			tabla1[i]=num;
		}
		
	}

}
