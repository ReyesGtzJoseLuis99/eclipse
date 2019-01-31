package programas_1eraUnidad;

import java.util.Scanner;

public class Programa07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc= new Scanner (System.in);
		
		System.out.println("Ingrese los grados Farenheit: ");
		double grados=sc.nextDouble();
		double centigrados;
		
		centigrados= ((grados-32)/1.8);
		
		System.out.println("El resultado en Centigrados es: " + centigrados);

	}

}
