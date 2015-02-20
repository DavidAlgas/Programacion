package BasicosEstructuraCondicional;
import java.io.*;
//Leer un car�cter por teclado y compruebe si es una letra may�scula.
public class BasicoEC04
{
	private char caracter1, caracter2;
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("  -- BasicoEC04 --");
		BasicoEC04 bec = new BasicoEC04();
		bec.cargarDato();
		bec.iguales();
	}
	private void cargarDato() throws IOException
	{
		System.out.print("Caracter1: ");
		caracter1 = (char)System.in.read();
		System.in.read();
		System.out.print("Caracter2: ");
		caracter2 = (char)System.in.read();
	}
	
	private void iguales()
	{
		if(caracter1 == caracter2)
		{
			System.out.println("Son iguales"); 
		}
		else
		{
			System.out.println("No son iguales");
		}
	}
}