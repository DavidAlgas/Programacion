package Ficheros;
import java.io.*;

public class Ficheros03
{
	public static void main(String[] args)
	{
		//De esta forma el fichero se cierra automaticamente
		try
		{
			FileWriter fw = new FileWriter("src/Ficheros/fichero03.txt");
			FileReader fr = new FileReader("src/Ficheros/fichero03.txt");
			
			escribeFichero(fw);
			
			//Orden para guardar el archivo .flush()
			fw.flush();
			
			leeFichero(fr);
		}
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
	
	static void escribeFichero(FileWriter fw) throws IOException
	{
      //Escribimos en el fichero
      fw.write("Esto es una prueba03\n");
      //fw.close();
    }
	
	static void leeFichero(FileReader fr) throws IOException
	{
		//Leemos el fichero y lo mostramos por pantalla
		int valor=fr.read();
		while(valor!=-1)
		{
			System.out.print((char)valor);
			valor=fr.read();
		}
		//fr.close();
	}
}