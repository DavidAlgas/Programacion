package BasicosEstructuraSecuencial;
import java.util.*;
//Programa que lee un número de 3 cifras y muestra sus cifras por separado.
public class BasicoES10
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES10 --");
		BasicoES10 bes = new BasicoES10();
		bes.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor de 3 cifras: ");
			numero = leer.nextInt();
			if(numero>999 && numero<100)
			{
				desmontar();
			}
		}while(numero>999 && numero<100);
	}
	
	private void desmontar()
	{
		System.out.println("Cifra 1: "+(numero/100));
		System.out.println("Cifra 2: "+(numero/10)%10);
		System.out.println("Cifra 3: "+(numero%10));
	}
}