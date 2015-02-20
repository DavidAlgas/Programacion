package EjerciciosMetodos;
import java.util.*;
//Pedir N� por teclado y con un m�todo se lo pasamos por par�metro para que nos indique si es o no un n�mero primo,
//debe devolver true si es primo sino false.
public class Metodos03
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		Metodos03 mt = new Metodos03();
		mt.pedirNumero();
	}

	private void pedirNumero()
	{
		leer = new Scanner(System.in);
		
		System.out.print("El numero ");
		numero = leer.nextInt();
		
		if(esPrimo(numero))
		{
			System.out.println("Es primo");
		}
		else
		{
			System.out.println("No es primo");
		}
		
		
	}
	
	public boolean esPrimo(int num)
	{
        int cont=0;
        
        for(int divisor=(int)Math.sqrt(num) ;divisor>1; divisor--)
        {
        	if (num%divisor==0)//contabilizados los divisibles
        	{
        		cont++;
        	}
        }
        
        if (cont>=1)//Seg�n el numero de divisibles es o no primo
        {
        	return false;
        }
        else
        {
        	return true;
        }
	}
}