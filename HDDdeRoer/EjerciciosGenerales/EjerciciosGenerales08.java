package EjerciciosGenerales;
import java.util.Scanner;
//Numeros Amigos Dos números son amigos si la suma de los divisores propios del primero
//es igual al segundo y viceversa.

public class EjerciciosGenerales08
{
	private Scanner leer;
	private int num1, num2, suma1=0, suma2=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales10 --");
		EjerciciosGenerales08 eg = new EjerciciosGenerales08();
		eg.cargarDatos();
		eg.sumaDivisores();
	}
	
	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Valor 1: ");
		num1 = leer.nextInt();
		System.out.print("Valor 2: ");
		num2 = leer.nextInt();
	}
	
	private void sumaDivisores()
	{
		for(int divisor=1; divisor<num1; divisor++)
		{
			if(num1%divisor==0)
			{
				suma1 = suma1 + divisor;
			}
		}
		
		for(int divisor=1; divisor<num2; divisor++)
		{
			if(num2%divisor==0)
			{
				suma2 = suma2 + divisor;
			}
		}
		
		if(num1==suma2 && num2==suma1)
		{
			System.out.println(num1+" y "+num2+" son amigos.");
		}
	}
}