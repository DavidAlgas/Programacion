package BasicosBasicos;
import java.util.*;
//Declarar una variable N de tipo int, una variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
//Mostrar: El valor de cada variable, la suma de N + A, la diferencia de A - N y
//el valor numérico correspondiente al carácter que contiene la variable C.
public class Basico01
{
	private Scanner leer;
	private int N;
	private double A;
	private String Z;
	private char C;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico01 --");
		Basico01 bs = new Basico01();
		bs.cargarDatos();
		bs.mostrarDatos();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Valor de N(int): ");
		N = leer.nextInt();
		System.out.print("Valor de A(double): ");
		A = leer.nextDouble();
		System.out.print("Valor de C(char): ");
		Z = leer.next();
		
		C = Z.charAt(0);
	}

	private void mostrarDatos()
	{
		System.out.println("Valor N: "+N);
		System.out.println("Valor A: "+A);
		System.out.println("Valor C: "+C);
		System.out.println(" ");
		
		System.out.println(N+" + "+A+" = "+(N+A));
		System.out.println(A+" - "+N+" = "+(A-N));
		System.out.println("Valor numérico del carácter " + C + " = " + (int)C);
	}
}