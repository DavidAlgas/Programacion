package EjerciciosArrays;
import java.util.*;
//Guardar en un Array 10 numeros enteros. Calcular la media de los valores positivos.
public class EjerciciosArrays01
{
	private Scanner leer;
	private int[] numeros;
	private int numero, contador=1, sumaPos, mediaPos;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays01 --");
		EjerciciosArrays01 eja = new EjerciciosArrays01();
		eja.cargarValores();
		eja.calcularMedia();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		numeros = new int[10];
		
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
			sumaPos = sumaPos + numeros[a];
		}
		mediaPos = sumaPos/numeros.length;
		
		System.out.println("Media de los positivos "+mediaPos);
	}
}