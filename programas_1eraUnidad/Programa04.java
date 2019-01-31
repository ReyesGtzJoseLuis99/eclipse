package programas_1eraUnidad;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		
			byte edad;
			System.out.print(" Ingresa tu edad: ");
			edad = leer.nextByte();
			
			if(edad>=18)
		          System.out.println("El usuario es mayor de edad");
			else
				  System.out.println("El usuario es menor de edad");
	}
}

