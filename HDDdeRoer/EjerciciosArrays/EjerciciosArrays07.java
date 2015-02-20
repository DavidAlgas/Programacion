package EjerciciosArrays;
import java.util.*;
//Leer N alturas y calcular la altura media. Calcular cu�ntas hay superiores a la media y cu�ntas inferiores.
public class EjerciciosArrays07
{
	private Scanner leer;
	private int[] alturas;
	private int altura, contador=1, superiores=0, inferiores=0, media, suma, size;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays07 --");
		EjerciciosArrays07 eja = new EjerciciosArrays07();
		eja.cargarValores();
		eja.calcularMedia();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		System.out.print("Tama�o Array: ");
		size = leer.nextInt();
		alturas = new int[size];
		
		for(int a=0; a<alturas.length; a++)
		{
			System.out.print("Cargar Altura "+contador+": ");
			altura = leer.nextInt();
			alturas[a] = altura;
			contador++;
		}
	}

	private void calcularMedia()
	{
		for(int a=0; a<alturas.length; a++)
		{
			suma = suma + alturas[a];
		}
		media = suma/alturas.length;
		
		for(int a=0; a<alturas.length; a++)
		{
			if(alturas[a]>media)
			{
				superiores++;
			}
			else
			{
				inferiores++;
			}
		}
		System.out.println("Mayores a la media: "+superiores);
		System.out.println("Menores a la media: "+inferiores);
	}
}