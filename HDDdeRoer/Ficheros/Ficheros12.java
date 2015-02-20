package Ficheros;
import java.io.*;

public class Ficheros12
{
	public static void main(String[] args)
	{
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\fichero12.txt"));
			BufferedReader br = new BufferedReader(new FileReader("C:\\fichero12.txt"));)
		{
			escribirFichero(bw);
			bw.flush();
			leerFichero(br);
			
		}
		catch (IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
	
	public static void escribirFichero(BufferedWriter bw)throws IOException
	{
		bw.write("Prueba 12");
		bw.newLine();
		bw.write("Probando con los objetos en el try");
		
	}
	
	public static void leerFichero(BufferedReader br)throws IOException
	{
		String linea = br.readLine();
		while(linea != null)
		{
			System.out.println(linea);
			linea = br.readLine();
		}
	}
}