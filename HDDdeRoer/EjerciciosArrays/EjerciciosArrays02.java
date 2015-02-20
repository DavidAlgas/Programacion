package EjerciciosArrays;
import java.util.*;
//Guardar en un Array 10 numeros enteros. Calcular la media de los valores que esten en posiciones pares del Array.
public class EjerciciosArrays02
{
	private Scanner leer;
	private int[] numeros;
	private int numero, contador=1, suma, media, pares=0; 
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays02 --");
		EjerciciosArrays02 eja = new EjerciciosArrays02();
		eja.cargarValores();
		eja.calcularMedia();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		numeros = new int[10];
		
		for(int a=0; a<numeros.length; a++)
		{
			System.out.print("Valor"+contador+": ");
			numero = leer.nextInt();
			numeros[a] = numero;
			contador++;
		}
	}

	private void calcularMedia()
	{
		for(int a=0; a<numeros.length; a++)
		{
			if(a%2==0)
			{
				suma = suma + numeros[a];
				pares++;
			}
		}
		media = suma/pares;
		System.out.println("Media: "+media);
	}
}