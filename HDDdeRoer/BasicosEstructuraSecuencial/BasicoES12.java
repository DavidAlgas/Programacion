package BasicosEstructuraSecuencial;
import java.util.*;
//Leer Int de 5 cifras y muestre sus cifras igual que en el ejemplo.
//Por ejemplo para un número N = 12345   La salida debe ser en piramide:5, 45, 345 ,2345 ,12345
public class BasicoES12
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES12 --");
		BasicoES12 bes = new BasicoES12();
		bes.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor de 5 cifras: ");
			numero = leer.nextInt();
			
			if(numero<99999 && numero>10000)
			{
				desmontar();
			}
		}while(numero<99999 && numero>10000);
	}
	
	public void desmontar()
	{
		System.out.println(numero%10);
		System.out.println(numero%100);
		System.out.println(numero%1000);
		System.out.println(numero%10000);
		System.out.println(numero);
	}
}