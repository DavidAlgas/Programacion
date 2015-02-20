package BasicosEstructuraSecuencial;
import java.util.*;
//Insertar longitud del radio de una esfera. Calcular volumen. v = (4/3)*PI*r^3 
public class BasicoES08
{
	private Scanner leer;
	private double radio, volumen;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES08 --");
		BasicoES08 bes = new BasicoES08();
		bes.cargarDatos();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Radio: ");
			radio = leer.nextDouble();
			
			if(radio != 0)
			{
				calcularVolumen();
			}
		}while(radio != 0);
	}
	
	private void calcularVolumen()
	{
		volumen =(4.0/3)*Math.PI*Math.pow(radio, 3);
		System.out.println("Volumen: "+volumen);
	}
}