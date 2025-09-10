package luis.calderon.examen;

import java.util.Scanner;

public class Utilidades {
	
	public static int menu(String[] menu) {
		Scanner entrada=new Scanner(System.in);
		String[] menu_array = { "**********   Menu Parte6   *************","1)Par/Impar", "2)Estadisticos", "3)Analisis de texto",
				"4)Operaciones con Arrays","5)Comprobar Primo / Cadena","6)Salir" };
		for (int i = 0; i < menu_array.length; i++) {

			System.out.println(menu_array[i]);
		}
		System.out.println("Introduce una opcion");
		int opcion = entrada.nextInt();
		return opcion;

	}
	
	
	public static boolean esPrimo(int x) {
		return false;
	}
	
	public static String normalizaEspacios(String s) {
		
		
		return s.replace(" ", "").strip();
		
		
		
		
	}

}
