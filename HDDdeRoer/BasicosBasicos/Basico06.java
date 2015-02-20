package BasicosBasicos;
import java.util.*;
//Declarar int B asígnale valor. Mostrar si B es positivo o negativo (0 positivo).
public class Basico06
{
	private Scanner leer;
	private int B;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico06 --");
		Basico06 bs6 = new Basico06();
		bs6.cargarValor();
	}
	
	private void cargarValor()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor: ");
			B = leer.nextInt();
			
			if(B != 0)
			{
				if(B>=0)
				{
					System.out.println("Es positivo");
				}
				else
				{
					System.out.println("NO es positivo");
				}
			}
		}while(B != 0);
		
	}
}