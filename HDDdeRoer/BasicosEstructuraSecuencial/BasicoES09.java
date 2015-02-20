package BasicosEstructuraSecuencial;
import java.util.*;
//Calcula el área de un triángulo a partir de la longitud de sus lados. 
//Area = RaizCuadrada(p*(p-a)*(p-b)*(p-c)) __ donde p =  (a+b+c)/2
public class BasicoES09
{
	private Scanner leer;
	private double area, lado1, lado2, lado3, p;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES09 --");
		BasicoES09 bes = new BasicoES09();
		bes.cargarDatos();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Lado 1: ");
			lado1 = leer.nextDouble();
			System.out.print("Lado 2: ");
			lado2 = leer.nextDouble();
			System.out.print("Lado 3: ");
			lado3 = leer.nextDouble();
			
			if(lado1 != 0 && lado2 != 0 && lado3 != 0)
			{
				calcularArea();
			}
		}while(lado1 != 0 && lado2 != 0 && lado3 != 0);
	}
	
	private void calcularArea()
	{
		p = (lado1+lado2+lado3)/2;
		area = Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
		System.out.println("Tiene un area de "+area);
	}
}