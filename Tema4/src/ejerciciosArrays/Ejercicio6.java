package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		 int[] tabla1 = new int[1000];
	        for (int i = 0; i < tabla1.length; i++) {
	            tabla1[i] = (int) (Math.random() * 100);
	        }
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Introduce un numero para ver si existe: ");
	        int valor = sc.nextInt();
	        int contador = 0;
	        for (int i = 0; i < tabla1.length; i++) {
	            if (tabla1[i] == valor) {
	                contador++;
	            }
	        }
	        if (contador > 0) {
	            System.out.println("El valor " + valor + " existe en la tabla y aparece " + contador + " veces.");
	        } else {
	            System.out.println("El valor " + valor + " no existe en la tabla.");
	        }
	    }
	}
