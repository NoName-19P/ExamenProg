package luis.calderon.examen;

import java.util.Scanner;

public class Parte3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		analisis_texto();

	}
	
	public static void analisis_texto() {
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce una cadena");
		String cadena=entrada.nextLine();
		//String nueva_cadena=Utilidades.normalizaEspacios(cadena);
		//System.out.println("La nueva cadena es "+nueva_cadena);
		
		int contVocales=0;
		int contEspacios=1;
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)=='a'|| cadena.charAt(i)=='e'||cadena.charAt(i)=='i'||cadena.charAt(i)=='o'||cadena.charAt(i)=='u') {
				contVocales++;
				
			}
			
			
		}
		
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.charAt(i)==' ') {
				contEspacios++;;
			}
		}
		
		StringBuilder sb=new StringBuilder();
		sb.append(cadena);
		

		System.out.println("Vocales= "+ contVocales);
		System.out.println("Palabras= "+ contEspacios);
		System.out.println("Invertido= " +sb.reverse());
		
	}

}
