package BasicosBasicos;
import java.util.*;
//declarar 4 int A, B, C y D y asígnale un valor.
//Realizar: B tome el valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
public class Basico04
{
	private Scanner leer;
	private int A, B, C, D, aux;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico04 --");
		Basico04 bs4 = new Basico04();
		bs4.cargarValor();
		bs4.intercambiarValores();
		bs4.resultado();
	}
	private void cargarValor()
	{
		leer = new Scanner(System.in);
		
		System.out.println(" - Cargar Valores -");
		System.out.print("Valor A: ");
		A = leer.nextInt();
		System.out.print("Valor B: ");
		B = leer.nextInt();
		System.out.print("Valor C: ");
		C = leer.nextInt();
		System.out.print("Valor D: ");
		D = leer.nextInt();
		
		
		System.out.println("Valores Originales");
		System.out.println("Valor A: "+A);
		System.out.println("Valor B: "+B);
		System.out.println("Valor C: "+C);
		System.out.println("Valor D: "+D);
	}
	
	private void intercambiarValores()
	{
		aux = B;
		B = C;
		C = A;
		A = D;
		D = aux;
	}
	
	private void resultado()
	{
		System.out.println("Valores Cambiados");
		System.out.println("Valor A: "+A);
		System.out.println("Valor B: "+B);
		System.out.println("Valor C: "+C);
		System.out.println("Valor D: "+D);
	}

}