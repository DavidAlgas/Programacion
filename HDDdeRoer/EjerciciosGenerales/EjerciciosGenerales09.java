package EjerciciosGenerales;
import java.util.Scanner;
//Mostrar los N primeros términos de la serie de Fibonacci 
// 1, 1, 2, 3, 5, 8, 13,....... 
public class EjerciciosGenerales09
{
	private Scanner leer;
	private int numero, fibo1=1, fibo2=1;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales09 --");
		EjerciciosGenerales09 eg = new EjerciciosGenerales09();
		eg.cargarDatos();
		eg.mostrar();
	}
	
	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		do
		{
			System.out.print("Introduce numero mayor a 1: ");
            numero = leer.nextInt();
            
        }while(numero<=1);
	}
	
	private void mostrar()
	{
		System.out.println("Los "+numero+" primeros términos de la serie de Fibonacci son:");
		System.out.print(fibo1+" ");
		
		for(int i=2; i<=numero; i++)
		{
			System.out.print(fibo2+" ");
			fibo2 = fibo1 + fibo2;
			fibo1 = fibo2 - fibo1;
		}
		System.out.println();
	}
}