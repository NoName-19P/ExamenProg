package LuisCalderonExamen;

import java.util.Scanner;

public class UtilidadesExamen {
	static Scanner entrada = new Scanner(System.in);

	public static int[] crear_array() {

		System.out.println("Introduce el tamaño del array entre 1 y 100");
		int tam = entrada.nextInt();
		int[] numeros = new int[tam];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce los numeros q quieras asignar a cada pos");
			int numeros_array = entrada.nextInt();
			numeros[i] = numeros_array;

		}

		return numeros;
	}

	public static void mostrar_arrray(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}

	}

	public static double calcular_promedio(int[] nums) {
		int suma = 0;
		double result = 0;
		for (int i = 0; i < nums.length; i++) {
			suma = suma + nums[i];

		}
		result = suma / nums.length;
		return result;
	}

	public static void max_min(int[] nums) {
		 int cont_max=0;
		 int cont_min=1000;
		
		for(int i=0;i<nums.length;i++) {
			if(cont_max<=nums[i]) {
				cont_max=nums[i];
			}
	
		}
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]<cont_min) {
				cont_min=nums[i];
			}
		}
		
		
		
		System.out.println("El valor max es "+cont_max);
		System.out.println("El valor min es "+cont_min);

	}
	
	public static int[]filtrar_mayores_promedio(int[]num,double promedio) {
		
		int tam=0;
		int cont=0;
		
		for(int i=0;i<num.length;i++) {
			if(num[i]>promedio) {
				cont++;
			
			}
		}
		
		
		int[]numeros_mayor_promedio = new int[cont];
		for(int i=0;i<num.length;i++) {
			if(num[i]>promedio) {
				for(int j=0;j<numeros_mayor_promedio.length;j++) {
					numeros_mayor_promedio[j]=num[i];
				}
			}
		}
		
		
		
		return numeros_mayor_promedio;
		
	}

}
