package BasicosEstructuraCondicional;
import java.io.*;
//Leer un car�cter por teclado y compruebe si es una letra may�scula.
public class BasicoEC03
{
	private char caracter;
	
	public static void main(String[] args) throws IOException
	{
		System.out.println("  -- BasicoEC03 --");
		BasicoEC03 bec = new BasicoEC03();
		bec.cargarDato();
		bec.mayuscula();
	}
	private void cargarDato() throws IOException
	{
		System.out.print("Caracter: ");
		caracter = (char)System.in.read();
	}
	
	private void mayuscula()
	{
		if(Character.isUpperCase(caracter))
		{
			System.out.println("Es una letra may�scula"); 
		}
		else
		{
			System.out.println("No es una letra may�scula");
		}
	}
}