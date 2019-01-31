package programas_1eraUnidad;
import java.util.Scanner;
public class Programa08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner (System.in);
		int dia;
		System.out.println ("Escribe un número del 1 al 7 ");
		dia = leer.nextInt();
		switch (dia){
		
		case 1:
			System.out.println ("Domingo");
		break;
		case 2:
			System.out.println ("Lunes");
		break;
		case 3:
			System.out.println ("Martes");
		break;
		case 4:
			System.out.println ("Miercoles");
		break;
		case 5:
			System.out.println ("Jueves");
		break;
		case 6:
			System.out.println ("Viernes");
		break;
		case 7:
			System.out.println ("Sabado");
		break;
		default:
		    System.out.println ("NO NO INGRESO UN NUMERO DEL 1 AL 7");
		    break;
		
		
		
		}
		
		
		
		
		

	}

}
