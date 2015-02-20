package BasicosEstructuraSecuencial;
import java.util.*;
//Calcular la hipotenusa sabiendo los catetos. h^2 = c^2+c^2. 
public class BasicoES07
{
	private Scanner leer;
	private double cateto1, cateto2, hipotenusa;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES07 --");
		BasicoES07 bes = new BasicoES07();
		bes.cargarDatos();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Cateto 1: ");
			cateto1 = leer.nextDouble();
			System.out.print("Cateto 2: ");
			cateto2 = leer.nextDouble();
			
			if(cateto1 != 0 && cateto2 != 0)
			{
				calcularCatetos();
			}
			
		}while(cateto1 != 0 && cateto2 != 0);
	}
	
	private void calcularCatetos()
	{
		hipotenusa = Math.sqrt(Math.pow(cateto1,2)+ Math.pow(cateto2, 2));
		
		System.out.println("El triangulo con los catetos de "+cateto1+" cm y "+cateto2+" cm.");
		System.out.println("Tiene una hipotenusa de "+hipotenusa+" cm.");
	}
}