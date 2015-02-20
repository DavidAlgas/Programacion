package BasicosEstructuraCondicional;
import java.util.*;
//Calcular el mayor de tres n�meros enteros en Java.
public class BasicoEC06
{
	private Scanner leer;
	private int num1, num2, num3;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC06 --");
		BasicoEC06 bec = new BasicoEC06();
		bec.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Numero 1: ");
			num1 = leer.nextInt();
			System.out.print("Numero 2: ");
			num2 = leer.nextInt();
			System.out.print("Numero 3: ");
			num3 = leer.nextInt();
			
			if(num1 != 0 && num2 !=0 && num3 != 0)
			{
				cualMayor();
			}
		}while(num1 != 0 && num2 !=0 && num3 != 0);
	}
	
	private void cualMayor()
	{
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println("El mayor es: "+num1);
			}
			else
			{
				System.out.println("El mayor es: "+num3);
			}
		}
		else
		{
			if(num2>num3)
			{
				System.out.println("El mayor es: "+num2);
			}
			else
			{
				System.out.println("El mayor es: "+num3);
			}
		}	
	}
}