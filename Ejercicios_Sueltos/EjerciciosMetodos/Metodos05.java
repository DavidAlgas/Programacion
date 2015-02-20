package EjerciciosMetodos;
import java.util.*;
//Contar el N� de cifras de un n�mero entero positivo (hay que controlarlo) pedido por teclado. 
//Crea un m�todo que realice esta acci�n, pasando el n�mero por par�metro, devolver� el n�mero de cifras
public class Metodos05 
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		Metodos05 mt = new Metodos05();
		mt.pedirNumero();
	}

	private void pedirNumero()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Numero: ");
		numero = leer.nextInt();
		
		System.out.println("El numero "+numero+" tiene "+contarN(numero)+" cifras.");
	}
	
	public int contarN(int num)
	{
		int cifras=0;
		
		while(num != 0)
		{
			num = num/10;
			cifras++;
		}
		return cifras;
	}
}
