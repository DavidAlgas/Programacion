package EjerciciosMetodos;
import java.util.*;
//Calcular factorial de un n�mero, lo realizara mediante un m�todo al que le pasamos el n�mero como par�metro. 
//Para ello se multiplica los n�meros anteriores hasta llegar a uno. Por ejemplo, si es 5, se hara 5*4*3*2*1=120.
public class Metodos04 
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		Metodos04 mt = new Metodos04();
		mt.pedirNumero();
	}

	private void pedirNumero()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Factorial de ");
		numero = leer.nextInt();
		
		System.out.println(factorial(numero));
	}
	
	public int factorial(int num)
	{
        int factorial = num;//Se inicia con el numero anterior al que introducimos
        
        for(int cont=(numero-1); cont>0; cont--)
        {
        	factorial = factorial*cont;//Acumulamos el resultado
        }
        return factorial;
	}
}