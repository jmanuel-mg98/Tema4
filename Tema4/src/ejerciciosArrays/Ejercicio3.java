package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tabla1[] = new int [10];
		int tabla2[] = new int [10];
		int num;
		for (int i=0;i<tabla1.length;i++) {
			System.out.println("Escribe un Numero");
			num= sc.nextInt();
			tabla1[i]=num;
		}
		for (int i=0;i<tabla2.length;i++) {
			System.out.println("Escribe un Numero");
			num= sc.nextInt();
			tabla2[i]=num;

		}
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.equals(tabla1, tabla2));
	}

}
