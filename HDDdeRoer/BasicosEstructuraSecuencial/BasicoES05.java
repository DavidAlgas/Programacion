package BasicosEstructuraSecuencial;
import java.util.*;
//Insertar radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia.
//Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2  
public class BasicoES05
{
	private Scanner leer;
	private double radio, longitud, area;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES05 --");
		BasicoES05 bes = new BasicoES05();
		bes.cargarDatos();
	}
	
	public void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("El circulo de radio: ");
			radio = leer.nextDouble();
			
			if(radio != 0)
			{
				calcularDatos();
			}
		}while(radio != 0);
	}
	
	public void calcularDatos()
	{
		longitud = 2*Math.PI*radio;
		area = Math.PI*Math.pow(radio, 2);
		System.out.println("Tiene una longitud de "+longitud+" cm.");
		System.out.println("Y un area de "+area+" cm2.");
	}
}
