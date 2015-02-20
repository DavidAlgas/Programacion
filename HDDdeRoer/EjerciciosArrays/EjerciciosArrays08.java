package EjerciciosArrays;
import java.util.*;
//Leer el nombre y sueldo de 10 empleados y mostrar el nombre y sueldo del empleado que más gana.
public class EjerciciosArrays08
{
	private Scanner leer;
	private String[] nombres;
	private int[] sueldos;
	private int contador=1, sueldo;
	private String nombre;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays08 --");
		EjerciciosArrays08 eja = new EjerciciosArrays08();
		eja.cargarValores();
		eja.mayorSueldo();
	}

	private void cargarValores()
	{
		leer = new Scanner(System.in);
		nombres = new String[10];
		sueldos = new int[10];
		
		for(int a=0; a<sueldos.length; a++)
		{
			System.out.print("Nombre "+contador+": ");
			nombre = leer.next();
			nombres[a] = nombre;
			System.out.print("Sueldo "+contador+": ");
			sueldo = leer.nextInt();
			sueldos[a] = sueldo;
			contador++;
		}
	}

	private void mayorSueldo()
	{
		int sueldoMax = sueldos[0];
		String nombreMax = nombres[0];
		for(int a=0; a<sueldos.length; a++)
		{
			if(sueldos[a]>sueldoMax)
			{
				sueldoMax = sueldos[a];
				nombreMax = nombres[a];
			}
		}
		System.out.println("El que mas cobra es:");
		System.out.println(nombreMax+" con un sueldo de "+sueldoMax+"€.");
	}
}