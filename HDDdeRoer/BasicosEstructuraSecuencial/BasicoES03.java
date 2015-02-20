package BasicosEstructuraSecuencial;
import java.util.*;
//insertar Int por tecladoy muestra por pantalla el doble y el triple de ese número.
public class BasicoES03
{
	private Scanner leer;
	private int numero;

	public static void main(String[] args)
	{
		System.out.println("  -- BasicoES03 --");
		BasicoES03 bes = new BasicoES03();
		bes.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor: ");
			numero = leer.nextInt();
			
			if(numero != 0)
			{
				mostrarDato();
			}
		}while(numero != 0);
		
	}

	private void mostrarDato()
	{
		System.out.println("El doble de "+numero+" es: "+(numero*2));
		System.out.println("El triple de "+numero+" es: "+(numero*3));
	}
}