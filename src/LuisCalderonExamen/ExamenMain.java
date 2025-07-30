package LuisCalderonExamen;

import java.util.Arrays;

public class ExamenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = UtilidadesExamen.crear_array();

		UtilidadesExamen.mostrar_arrray(numeros);
		
		double promedio=UtilidadesExamen.calcular_promedio(numeros);
		System.out.println("El promedio de las notas son"+promedio);

		UtilidadesExamen.max_min(numeros);
		
		int[]numeros_promedio=UtilidadesExamen.filtrar_mayores_promedio(numeros, promedio);
		System.out.println(Arrays.toString(numeros_promedio));
		

		
		

	}

}
