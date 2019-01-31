package programas_1eraUnidad;
import java.text.DecimalFormat;
public class Programa10n {
public static void main (String args [] ){
			DecimalFormat formateador = new DecimalFormat ("####.##");
			double prod1, prod2, prod3, sum, desc;
			prod1 = 4635;
			prod2 = 3656;
			prod3 = 12355;
					System.out.println ("Precio de una bocina: ");
					System.out.println (formateador.format (prod1));
					System.out.println ("Precio de un celular: ");
					System.out.println (formateador.format (prod2));
					System.out.println ("Precio de una televisión: ");
					System.out.println (formateador.format (prod3));
					sum = (prod1+prod2+prod3);
					System.out.println ("La suma total es de: ");
					System.out.println (formateador.format (sum));
				 
						if (sum>=1500)
				
					System.out.println ("El descuento es del 11%");
					desc = ((sum*11)/100);
					System.out.println ("De " + sum + " el 11% es de ");
					System.out.println (formateador.format (desc));
					desc = sum - desc;
					System.out.println ("El total a pagar es de: ");
					System.out.println (formateador.format (desc));
				
						if (sum<1500)
				
					System.out.println ("El descuento es del 10%");
					desc = ((sum*10)/100);
					System.out.println ("De " + sum + " el 10% es de ");
					System.out.println  (formateador.format (desc));
					desc = sum - desc;
					System.out.println ("El total a pagar es de: ");
					System.out.println (formateador.format (desc));
				
	}
	}
