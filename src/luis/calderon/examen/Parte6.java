package luis.calderon.examen;

import java.util.Scanner;

public class Parte6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada=new Scanner(System.in);
		
		int opcion=0;
		
		do {
			opcion=Utilidades.menu(args);
			
			switch(opcion) {
			
			case 1:
				Parte1.par_impar();
				break;
				
			case 2:
				Parte2.estadistico();
				break;
			
			case 3:
				Parte3.analisis_texto();
				break;
			
			case 4:
				Parte4.operacionesArrays();
				break;
				
			case 5:
				System.out.println("Introduce cadena");
				String cadena=entrada.nextLine();
				System.out.println(Utilidades.normalizaEspacios(cadena));	
				break;
				
				
				
			case 6:
				System.out.println("Has salido");
				break;
				
			}
			
				
			
		}while(opcion!=6);
			
		

	}

}
