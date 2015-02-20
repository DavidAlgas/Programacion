package Ficheros;
import java.io.*;
//ejemplo de como NO hay que hacerlo. Hay que hacerlo por bloques Primero escribir y despues leer
public class Ficheros02
{
	public static void main(String[] args)
	{
		try
		{
			//Creo el fichero en la ruta que queramos
			File fichero02 = new File("src/Ficheros/fichero02.txt");
			
			//Creo los objetos, abro la escrtura y la lectura del fichero
			FileWriter fw = new FileWriter(fichero02);
			FileReader fr = new FileReader(fichero02);
          
			//Escribimos en el fichero un String y un caracter 97 (a)
			fw.write("Esto es una prueba02 \n");
			fw.write(97);
			
			//Leemos el fichero y lo mostramos por pantalla
			int valor=fr.read();
          
			while(valor != -1)
			{
				System.out.print((char)valor);
				valor=fr.read();
			}
          
			//Cerramos los stream
			fw.close();
			fr.close();
          
		}
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}