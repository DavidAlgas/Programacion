package EjerciciosGenerales;
import java.util.*;
//Intercambiar el contenido de dos variables
public class EjerciciosGenerales01
{
	private Scanner leer;
	private int valor1, valor2, aux;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales01 --");
		EjerciciosGenerales01 eg = new EjerciciosGenerales01();
		eg.cargaDatos();
		eg.intercambiar();
	}

	private void cargaDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Valor 1: ");
		valor1 = leer.nextInt();
		System.out.print("Valor 2: ");
		valor2 = leer.nextInt();
		
	}

	private void intercambiar()
	{
		aux = valor1;
		valor1 = valor2;
		valor2 = aux;
		System.out.println("Ahora");
		System.out.println("Valor1: "+valor1);
		System.out.println("Valor2: "+valor2);
	}
}