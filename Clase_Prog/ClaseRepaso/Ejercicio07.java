package ClaseRepaso;
import java.util.*;

//Programa lea la longitud de los catetos de un tri�ngulo rect�ngulo y calcule
//la longitud de la hipotenusa seg�n el teorema de Pit�goras.
public class Ejercicio07
{
	static Scanner leer; 
	
	public static void main(String[] args)
	{
		leer = new Scanner (System.in);
		
		double catetoA, catetoB, resultado;
		
		System.out.print("Introduce catetoA: ");
		catetoA = leer.nextDouble();
		System.out.print("Introduce catetoB: ");
		catetoB = leer.nextDouble();
		
		resultado = Math.sqrt(Math.pow(catetoA,2)+ Math.pow(catetoB, 2));
		
		System.out.print("La hipotenusa es: " +resultado);
	}	
}