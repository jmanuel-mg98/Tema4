package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		int tabla1[] = new int [30];
		for (int i=0;i<tabla1.length;i++) {
			num = (int)(Math.random()*10);
			tabla1[i]=num;
		}
		Arrays.sort(tabla1);
		System.out.println(Arrays.toString(tabla1));

	}

}
