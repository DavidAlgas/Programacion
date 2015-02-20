package BasicosEstructuraSecuencial;
import java.util.*;
//Conversor de grados ºC a ºF. La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
public class BasicoES04
{
	private Scanner leer;
	private double grados, F;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES04 --");
		BasicoES04 bes = new BasicoES04();
		bes.cargarDatos();
		bes.convertirGrados();
	}
	
	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Introducir Cº: ");
		grados = leer.nextDouble();
		
	}
	
	public void convertirGrados()
	{
		F = 32 + (9*grados/5);
		System.out.println(grados+" ºC son "+F+" ºF.");
	}
}