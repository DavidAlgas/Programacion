package BasicosBasicos;
import java.util.*;
//Declarar Int C y asígnar valor. Mostrar si C es:
//positivo o negativo, si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que 100.
public class Basico07
{
	private Scanner leer;
	private int C;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico07 --");
		Basico07 bs7 = new Basico07();
		bs7.cargarValor();
	}
	
	public void cargarValor()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("El numero: ");
			C = leer.nextInt();
			
			if(C != 0)
			{
				if(C>=0)
				{
					System.out.println("--> Es positivo");
				}
				else
				{
					System.out.println("--> Es negativo");
				}
				
				if(C%2==0)
				{
					System.out.println("--> Es par");
				}
				else
				{
					System.out.println("--> Es Impar");
				}
				
				if(C%5==0)
				{
					System.out.println("--> Es multiplo de 5");
				}
				else
				{
					System.out.println("--> No es multiplo de 5");
				}
				
				if(C%10==0)
				{
					System.out.println("--> Es multiplo de 10");
				}
				else
				{
					System.out.println("--> No es multiplo de 10");
				}
				
				if(C>=100)
				{
					System.out.println("--> Es mayor de 100");
				}
				else
				{
					System.out.println("--> Es menor de 100");
				}
			}
		}while(C != 0);	
	}
}