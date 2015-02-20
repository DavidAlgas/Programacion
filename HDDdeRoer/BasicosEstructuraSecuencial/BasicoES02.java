package BasicosEstructuraSecuencial;
import java.util.*;
//Introducir nombre y muestre por pantalla: “Buenos dias"+nombre_introducido.
public class BasicoES02
{
	private Scanner leer;
	private String nombre;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoES02 --");
		BasicoES02 bes = new BasicoES02();
		bes.cargarDatos();
		bes.mostrarDatos();
	}

	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Nombre: ");
		nombre = leer.next();
	}
	
	private void mostrarDatos()
	{
		System.out.println("Buenos Dias "+nombre);
	}
}