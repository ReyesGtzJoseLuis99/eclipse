package programas_1eraUnidad;

import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Ingrese un numero: ");
		int a = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
	}

}
