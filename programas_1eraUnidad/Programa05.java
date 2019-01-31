package programas_1eraUnidad;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		byte calificacion;
		System.out.print(" Ingresa tu calificacion: ");
		calificacion=leer.nextByte();
		
		if(calificacion>=80)
			System.out.println("El alumno esta aprobado :D ");
		else
			System.out.println("El alumno esta reprobado :( ");
	}

}
