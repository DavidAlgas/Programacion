package BasicosEstructuraSecuencial;
import java.util.*;
//Pasar Km/h a m/s. La velocidad se lee por teclado.
public class BasicoES06
{
	private Scanner leer;
	private double khora, msegundo;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES06 --");
		BasicoES06 bes = new BasicoES06();
		bes.cargarDatos();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Km/h: ");
			khora = leer.nextDouble();
			
			if(khora != 0)
			{
				calcularDato();
			}
		}while(khora != 0);
	}
	
	private void calcularDato()
	{
		msegundo = khora*1000/3600;
		System.out.println(khora+" km/h son "+msegundo+" m/s.");
	}
}