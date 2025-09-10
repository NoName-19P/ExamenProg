package luis.calderon.examen;

import java.util.Scanner;

public class Parte2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		estadistico();

	}
	
	public static void estadistico() {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Cuantos enteros quieres introducir");
		int n=entrada.nextInt();
		int[]numeros=new int[n];
		int suma=0;
		int max=0;
		int min=0;
		for(int i=0;i<numeros.length;i++) {
			System.out.println("introduce numero");
			int num=entrada.nextInt();
			numeros[i]=num;
			suma=suma+numeros[i];
			if(num>max) {
				max=num;
			}
			
			if(numeros[0]>=0 || numeros[0]<=0){
				min=numeros[0];
				
				
			}
			
			
		}
		
		System.out.println("La suma total es "+suma);
		System.out.println("El maximo es "+max);
		System.out.println("El minimo es "+min);
	}

}
