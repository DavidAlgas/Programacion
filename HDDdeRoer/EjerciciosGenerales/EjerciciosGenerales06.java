package EjerciciosGenerales;
import java.util.*;
//Numero perfecto. Un número es perfecto si es igual a la suma de todos sus divisores positivos sin incluir el propio número.
//El 6 tiene como divisores: 1, 2, 3. Si sumamos 1 + 2 + 3 = 6 
public class EjerciciosGenerales06
{
	private Scanner leer;
	private int numero, suma=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales06 --");
		EjerciciosGenerales06 eg = new EjerciciosGenerales06();
		eg.cargaDato();
	}

	private void cargaDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor: ");
			numero = leer.nextInt();
			
			if(numero>0)
			{
				perfecto();
			}
		}while(numero>0);
	}
	
	private void perfecto()
	{
		for(int divisor=1; divisor<numero; divisor++)
		{
			if(numero%divisor==0)
			{
				suma = suma + divisor;
			}
		}
		
		if(suma == numero)
		{
			System.out.println(numero+" es perfecto");
		}else
		{
			System.out.println(numero+" no es perfecto");
		}
	}
}