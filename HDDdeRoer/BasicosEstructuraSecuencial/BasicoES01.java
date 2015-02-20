package BasicosEstructuraSecuencial;
import java.util.*;
//Introducir dos números enteros por teclado y mostrarlos por pantalla.
public class BasicoES01
{
	private Scanner leer;
	private int A, B;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoES01 --");
		BasicoES01 bes = new BasicoES01();
		bes.cargarDatos();
		bes.mostrarDatos();
	}

	private void cargarDatos() 
	{
		leer = new Scanner(System.in);
		
		System.out.print("Valor 1: ");
		A = leer.nextInt();
		System.out.print("Valor 2: ");
		B = leer.nextInt();
	}

	private void mostrarDatos()
	{
		System.out.println("Valor 1: "+A);
		System.out.println("Valor 2: "+B);
	}
}