package EjerciciosArrays;
import java.util.*;
//Guardar en un Array 10 numeros enteros. Calcular la media de los valores positivos y negativos por separado.
public class EjerciciosArrays06
{
	private Scanner leer;
	private int[] numeros;
	private int numero, contador=1, sumaPos, sumaNeg, mediaPos, mediaNeg, positivos=0, negativos=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays06 --");
		EjerciciosArrays06 eja = new EjerciciosArrays06();
		eja.cargarValores();
		eja.calcularMedia();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		numeros = new int[4];
		
		for(int a=0; a<numeros.length; a++)
		{
			System.out.print("Cargar Valor"+contador+": ");
			numero = leer.nextInt();
			numeros[a] = numero;
			contador++;
		}
	}

	private void calcularMedia()
	{
		for(int a=0; a<numeros.length; a++)
		{
			if(numeros[a]>=0)
			{
				sumaPos = sumaPos + numeros[a];
				positivos++;
			}
			else
			{
				sumaNeg = sumaNeg + numeros[a];
				negativos++;
			}
		}
		
		mediaPos = sumaPos/positivos;
		mediaNeg = sumaNeg/negativos;
		
		System.out.println("Media de los positivos "+mediaPos);
		System.out.println("Media de los negativos "+mediaNeg);
	}
}