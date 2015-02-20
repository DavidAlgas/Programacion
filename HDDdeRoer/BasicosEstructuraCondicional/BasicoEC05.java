package BasicosEstructuraCondicional;
import java.util.*;
//Introducir dos numeros por teclado y mostrar su division. Se debe comprobar que el divisor no puede ser cero. 
public class BasicoEC05
{
	private Scanner leer;
	private int num1, num2;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC05 --");
		BasicoEC05 bec = new BasicoEC05();
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
			
			if(num1 != 0 && num2 !=0)
			{
				division();
			}
		}while(num1 != 0 && num2 !=0);
	}
	
	private void division()
	{
		if(num1%num2 != 0)
		{
			System.out.println(num1+"/"+num2+" = "+(num1/num2));
		}
		else
		{
			System.out.println("No se muestra si el resto es 0");
		}
	}
}