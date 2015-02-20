package BasicosEstructuraCondicional;
import java.util.*;
//Introducir Int mes y comprobar que el valor corresponde a un mes de 30, 31 o 28 d�as.
//Mostrar nombre del mes. Ccomprobar que el valor introducido est� comprendido entre 1 y 12.

public class BasicoEC08
{
	private Scanner leer;
	private int mes;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC08 --");
		BasicoEC08 bec = new BasicoEC08();
		bec.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		System.out.println("Introducir Mes(N�)");
		do
		{
			System.out.print("Mes: ");
			mes = leer.nextInt();
			
			if(mes<12 || mes>0)
			{
				nombreMes();
				confirmarMes();
			}
		}while(mes !=0);
	}
	
	private void confirmarMes()
	{
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11)
		{
			System.out.println(" es un mes de 30 d�as");
		}
		else
		{
			if(mes == 2)
			{
				System.out.println(" es un mes de 28 d�as");
			}
			else
			{
				System.out.println(" es un mes de 31 d�as");
			}
                 
		}
	}
	
	private void nombreMes()
	{
		if(mes == 1)
		{
			System.out.print("Enero");
		}
		if(mes == 2)
		{
			System.out.print("Febrero");
		}
		if(mes == 3)
		{
			System.out.print("Marzo");
		}
		if(mes == 4)
		{
			System.out.print("Abril");
		}
		if(mes == 5)
		{
			System.out.print("Mayo");
		}
		if(mes == 6)
		{
			System.out.print("Junio");
		}
		if(mes == 7)
		{
			System.out.print("Julio");
		}
		if(mes == 8)
		{
			System.out.print("Agosto");
		}
		if(mes == 9)
		{
			System.out.print("Septiembre");
		}
		if(mes == 10)
		{
			System.out.print("Octubre");
		}
		if(mes == 11)
		{
			System.out.print("Noviembre");
		}
		if(mes == 12)
		{
			System.out.print("Diciembre");
		}
	}
}