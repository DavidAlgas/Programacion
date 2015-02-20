package EjerciciosGenerales;
import java.util.*;
//Leer números y contar cuántos acaban en 2.
public class EjerciciosGenerales05
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales05 --");
		EjerciciosGenerales05 eg = new EjerciciosGenerales05();
		eg.cargaDato();
	}

	private void cargaDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor: ");
			numero = leer.nextInt();
			
			if(numero != 0)
			{
				acabaDos();
			}
		}while(numero != 0);
	}
	
	private void acabaDos()
	{
		if(numero%10==2)
		{
			System.out.println("Acaba en dos");
		}else
		{
			System.out.println("No acaba en dos");
		}
	}
}