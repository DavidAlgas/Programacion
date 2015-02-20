package EjerciciosArrays;
import java.util.*;
//Contar el número de elementos positivos, negativos y ceros en un array de 10 enteros.

public class EjerciciosArrays05
{
	private Scanner leer;
	private int[] numeros;
	private int numero, positivos=0, negativos=0, zero=0; 
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays05 --");
		EjerciciosArrays05 eja = new EjerciciosArrays05();
		eja.cargarValores();
		eja.contarNumeros();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		numeros = new int[10];
		
		for(int a=0; a<numeros.length; a++)
		{
			System.out.print("Numero: ");
			numero = leer.nextInt();
			numeros[a] = numero;
		}
	}

	private void contarNumeros()
	{
		for(int a=0; a<numeros.length; a++)
		{
			if(numeros[a]>0)
			{
				positivos++;
			}
			if(numeros[a]<0)
			{
				negativos++;
			}
			if(numeros[a]==0)
			{
				zero++;
			}
		}
		System.out.println("En el array hay");
		System.out.println(positivos+" numeros positivos");
		System.out.println(negativos+" numeros negativos");
		System.out.println(zero+" ceros");
	}
}