package BasicosBasicos;
import java.util.*;
//Declarar int A y asígnar valor. Indicar si A es par o impar. 
public class Basico05
{
	private Scanner leer;
	private int A;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico05 --");
		Basico05 bs5 = new Basico05();
		bs5.cargarValor();
	}
	
	private void cargarValor()
	{
		leer = new Scanner(System.in);
		do
		{
			System.out.print("Valor: ");
			A = leer.nextInt();
			if(A != 0)
			{
				if(A%2==0)
				{
					System.out.println(A+" es numero PAR");
				}
				else
				{
					System.out.println(A+" NO es numero PAR");
				}
			}			
		}while(A != 0);
	}		
}