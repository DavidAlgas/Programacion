package Deberes;
import java.util.*;

public class ejerif
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		System.out.print("Introducir A�o: ");
		int a�o = leer.nextInt();
		
		if(a�o%4 == 0)
		{
			System.out.println("A�o Bisiesto");
		}
		
		if(a�o%100 == 0)
		{
			System.out.println("A�o NO Bisiesto");
		}
		
		if(a�o%400==0)
		{
			System.out.println("A�o Bisiesto");
		}
	}
}



/*Implementar una aplicaci�n en Java que nos permita introducir un a�o por teclado y nos diga si el a�o es bisiesto o no.
 * Nota: C�mo saber si un a�o va a ser bisiesto

Los a�os bisiestos son los divisibles entre 4 (como 2004, 2008, etc.)
Excepto si es divisible entre 100, entonces no es bisiesto (como 2100, 2200, etc.)
Excepto si es divisible entre 400, entonces s� (como 2000, 2400)*/