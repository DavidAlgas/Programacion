package EjerciciosSueltos;
import java.util.Scanner;
// Pedir el lado de un cuadrado, comprobar que es un n�mero mayor que cero y calcular el �rea del cuadrado.

public class AreaCuadrado
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		int area, lado;
		
		System.out.print("Lado Cuadrado: ");
		lado = leer.nextInt();
		
		if(lado>0)
		{
			System.out.println("Es mayor de 0");
			area = lado*lado;
			System.out.println("Area: "+area);
		}
	}
}