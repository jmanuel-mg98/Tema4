package ejerciciosArrays;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[] apuestaUsuario = new int[6];
        for (int i = 0; i < 6; i++) {
            apuestaUsuario[i] = (int) (Math.random() * 49) + 1;
        }
        int[] combinacionGanadora = new int[6];
        for (int i = 0; i < 6; i++) {
            combinacionGanadora[i] = (int) (Math.random() * 49) + 1;
        }
        Arrays.sort(combinacionGanadora);
        System.out.println("Apuesta del usuario: " + Arrays.toString(apuestaUsuario));
        System.out.println("Combinación ganadora: " + Arrays.toString(combinacionGanadora));
        int aciertos = 0;
        for (int numeroUsuario : apuestaUsuario) {
            if (Arrays.binarySearch(combinacionGanadora, numeroUsuario) >= 0) {
                aciertos++;
            }
        }
        System.out.println("Número de aciertos: " + aciertos);
    }
}
