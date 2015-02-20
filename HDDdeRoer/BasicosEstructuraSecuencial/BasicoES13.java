package BasicosEstructuraSecuencial;
import java.util.*;
//leer (dia, mes, a�o) y calcule su n�mero de la suerte.Si la fecha de nacimiento es 12/07/1980 
//Calculamos el n�mero de la suerte as�: 12+7+1980 = 1999  1+9+9+9 = 28 N�mero de la suerte: 28
public class BasicoES13
{
	private Scanner leer;
	private int dia, mes, year, suerte, resultado;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoES13 --");
		BasicoES13 bes = new BasicoES13();
		bes.cargarDato();
		bes.calcullarSuerte();
	}

	private void cargarDato()
	{
		leer = new Scanner(System.in);
		
		System.out.print("Dia: ");
		dia = leer.nextInt();
		System.out.print("Mes: ");
		mes = leer.nextInt();
		System.out.print("A�o: ");
		year = leer.nextInt();
	}
	
	public void calcullarSuerte()
	{
		resultado = dia+mes+year;
		suerte = ((resultado/1000)+(resultado/100%10)+(resultado/10%10)+(resultado%10));
		System.out.println("Numero de la suerte: "+suerte);
	}
}