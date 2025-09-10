package luis.calderon.examen;

import java.util.Scanner;

public class Parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		par_impar();

	}
	
	public static void par_impar () {
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce un numero entero");
		
		int numero=entrada.nextInt();
		if(numero>0 && numero % 2 ==0) {
			System.out.println("el numero "+numero+" es positivo y par");	
		}
		if (numero>=0 && numero %2==1){
			System.out.println("el numero "+numero+" es positivo e impar");
			
		}
		if(numero<0 && numero % 2 == 0) {
			System.out.println("el numero "+numero+" es negativo y par");
			
			}
			
		if(numero<0 && numero % 2 == -1) {
			System.out.println("el numero "+numero+" es negativo e impar");
		}
		if(numero ==0) {
			System.out.println("El numero es "+numero);
		}
		
		
	}
	
}


	
