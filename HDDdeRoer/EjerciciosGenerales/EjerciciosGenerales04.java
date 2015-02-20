package EjerciciosGenerales;
import java.util.*;
//Mostrar tabla de multiplicar de un numero
public class EjerciciosGenerales04
{
	private Scanner leer;
	private int numero;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales04 --");
		EjerciciosGenerales04 eg = new EjerciciosGenerales04();
		eg.cargaDato();
	}

	private void cargaDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Tabla del ");
			numero = leer.nextInt();
			
			if(numero != 0)
			{
				cargarTabla();
			}
		}while(numero != 0);
	}
	
	private void cargarTabla()
	{
		for(int a=0; a<=10; a++)
		{
			int resultado = numero*a;
			System.out.println(numero+" x "+a+" = "+resultado);
		}
	}
}