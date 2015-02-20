package BasicosEstructuraCondicional;
import java.util.*;
//Leer 3 enteros H, M, S que contienen hora, minutos y segundos respectivamente. Comprobar si la hora es valida.
public class BasicoEC07
{
	private Scanner leer;
	private int horas, minutos, segundos;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoEC07 --");
		BasicoEC07 bec = new BasicoEC07();
		bec.cargarDato();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		System.out.println("Introducir Hora(Formato 24H)");
		do
		{
			System.out.print("Hora: ");
			horas = leer.nextInt();
			System.out.print("Minuto: ");
			minutos = leer.nextInt();
			System.out.print("Segundo: ");
			segundos = leer.nextInt();
			
			if(horas != 0 && minutos !=0 && segundos != 0)
			{
				confirmarHora();
			}
		}while(horas != 0 && minutos !=0 && segundos != 0);
	}
	
	private void confirmarHora()
	{
		if(horas>=00 && horas<=23)
		{
			if(minutos>=00 && minutos<=60)
			{
				if(segundos>=0 && segundos<=60)
				{
					System.out.println("La hora "+horas+":"+minutos+":"+segundos+" es correcta.");
				}
			}
		}
	}	
}
