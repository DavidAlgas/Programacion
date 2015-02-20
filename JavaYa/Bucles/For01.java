package Bucles;
//Programa que lea n pares de datos, cada par de datos corresponde a la medida de la base y la altura de un tri�ngulo. El programa deber� informar:
//a) De cada tri�ngulo la medida de su base, su altura y su superficie. 
//b) La cantidad de tri�ngulos cuya superficie es mayor a 12.
import java.util.*;
public class For01
{
	static Scanner leer;
	static int base, altura, superficie, mayores, cantidad;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		
		System.out.println("  -- For01 --");
		System.out.print("N� de triangulos: ");
		cantidad = leer.nextInt();
		
		for(int a = 1; a<=cantidad; a++)
		{
			System.out.print("Introducir altura: ");
			altura = leer.nextInt();
			System.out.print("Introducir base: ");
			base = leer.nextInt();
			
			superficie = base*altura/2;
			System.out.println("La superficie es: "+superficie);
			
			if(superficie>12)
			{
				mayores = mayores + 1;
			}
		}
		
		System.out.println("Hay "+cantidad+" triangulos con superficia mayor de 12");
	}
}