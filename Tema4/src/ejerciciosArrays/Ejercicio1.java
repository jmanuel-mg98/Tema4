package ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int n=0;
		int m=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("introduce el tamaño y el contenido del array: ");
		n=sc.nextInt();
		m=sc.nextInt();
		int tabla[]=new int [n];
		Arrays.fill(tabla,m);
		System.out.println(Arrays.toString(tabla));

		
		
		

	}

}
