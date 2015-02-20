package BasicosBasicos;
import java.util.*;
//Declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asigna a cada una un valor.
//A continuación reliza y muestra por pantalla una serie de operaciones entre ellas. 
public class Basico02
{
	private Scanner leer;
	private int X, Y;
	private double M, N;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico02 --");
		Basico02 bs2 = new Basico02();
		bs2.cargarDatos();
		bs2.operacionesInt();
		bs2.operacionesDouble();
		bs2.operacionesMixtas();
	}

	private void cargarDatos()
	{
		leer = new Scanner(System.in);
		System.out.print("Int 1: ");
		X = leer.nextInt();
		System.out.print("Int 2: ");
		Y = leer.nextInt();
		System.out.print("Double 1: ");
		M = leer.nextDouble();
		System.out.print("Double 2: ");
		N = leer.nextDouble();
		
	}
	private void operacionesInt()
	{
		System.out.println(" - Operaciones Int -");
		System.out.println(X+" + "+Y+" = "+(X+Y));
		System.out.println(X+" - "+Y+" = "+(X-Y));
		System.out.println(X+" x "+Y+" = "+(X*Y));
		System.out.println(X+" / "+Y+" = "+(X/Y));
		System.out.println("El resto es: "+(X%Y));
		System.out.println("");
	}

	private void operacionesDouble()
	{
		System.out.println(" - Operaciones Double -");
		System.out.println(N+" + "+M+" = "+(N+M));
		System.out.println(N+" - "+M+" = "+(N-M));
		System.out.println(N+" x "+M+" = "+(N*M));
		System.out.println(N+" / "+M+" = "+(N/M));
		System.out.println("El resto es: "+(N%M));
		System.out.println("");
	}

	private void operacionesMixtas()
	{
		System.out.println(" - Operaciones Mixtas -");
		System.out.println(X+" + "+N+" = "+(X+N));
		System.out.println(Y+" / "+M+" = "+(Y/M));
		System.out.println("El resto es: "+(Y%M));
		System.out.println("");
		
		System.out.println("El doble de cada variable:");
		System.out.println("De "+X+" es: "+(X*2));
		System.out.println("De "+Y+" es: "+(Y*2));
		System.out.println("De "+N+" es: "+(N*2));
		System.out.println("De "+M+" es: "+(M*2));
		System.out.println("");
		
		System.out.println("Suma de todas las variables");
		System.out.println("Suma: "+((X+Y)+(N+M)));
		System.out.println("Producto de todas las variables");
		System.out.println("Producto: "+((X*Y)*(N*M)));
	}
}