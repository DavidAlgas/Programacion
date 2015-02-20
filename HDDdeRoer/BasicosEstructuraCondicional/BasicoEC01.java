package BasicosEstructuraCondicional;
import java.util.*;
//Programa Java que lea un n�mero entero y calcule si es par o impar.
public class BasicoEC01
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC01 --");
		BasicoEC01 bec = new BasicoEC01();
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
				parImpar();
			}
		}while(numero != 0);
		
	}
	
	private void parImpar()
	{
		if(numero%2==0)
		{
			System.out.println(numero+" es numero par");
		}
		else
		{
			System.out.println(numero+" NO es numero par");
		}
	}
}