package BasicosEstructuraCondicional;
import java.util.*;
//Leer un n�mero entero y muestre si el n�mero es m�ltiplo de 10.
public class BasicoEC02
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC02 --");
		BasicoEC02 bec = new BasicoEC02();
		bec.cargarDato();
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
				multiplo();
			}
		}while(numero != 0);
		
	}
	
	private void multiplo()
	{
		if(numero%10==0)
		{
			System.out.println(numero+" es multiplo de 10");
		}
		else
		{
			System.out.println(numero+" NO es multiplo de 10");
		}
	}
}