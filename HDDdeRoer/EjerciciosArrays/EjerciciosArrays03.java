package EjerciciosArrays;
import java.util.*;
//Guardar en un Array 10 notas de alumnos. Calcular la media de los valores y mostrar las notas superiores a la media.
public class EjerciciosArrays03
{
	private Scanner leer;
	private int[] notas;
	private int nota, contador=1, suma, media, Nmayores=0; 
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays03 --");
		EjerciciosArrays03 eja = new EjerciciosArrays03();
		eja.cargarValores();
		eja.calcularMediaYmayor();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		notas = new int[10];
		
		for(int a=0; a<notas.length; a++)
		{
			System.out.print("Nota"+contador+": ");
			nota = leer.nextInt();
			notas[a] = nota;
			contador++;
		}
	}

	private void calcularMediaYmayor()
	{
		for(int a=0; a<notas.length; a++)
		{
			suma = suma + notas[a];
		}
		media = suma/notas.length;
		System.out.println("La media de notas es: "+media);
		
		System.out.println("");
		System.out.println("Mayores a la media");
		for(int a=0; a<notas.length; a++)
		{
			if(notas[a]>media)
			{
				System.out.println(notas[a]);
				Nmayores++;
			}	
		}
		System.out.println("Hay "+Nmayores+" notas mayores a la media");
		
	}
}