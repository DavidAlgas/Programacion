package Ficheros;
import java.io.*; 
//Trabajamos con FileReader y FileWriter(ficheros 01 al 03)
//Para no borrar el contenido del fichero ya que cada vez que lo creamos empieza vacio habria que 
//poner true dentro del objeto FileWriter --> FileWriter fw = new FileWriter("C:\\fichero01.txt", true);
public class ficheros01
{
	public static void main(String[] args)
	{
		try
		{
			//Creo el fichero en la ruta que queramos
			File fichero01 = new File("src/Ficheros/fichero01.txt");
			//Abro stream e¡con el fichero que queramos , en este caso el creado anteriormente
			FileWriter fw = new FileWriter(fichero01);
			
	        //Escribimos en el fichero un String y un caracter 97 (a)
			fw.write("  -- FileWriter & FileReader -- \r\n");
			fw.write("Esto es una prueba01 \r\n");
			fw.write(97); //¡Ojo! al escribir charts los numeros enteros los deberemos meter como String
			fw.write("10\r\n");
			fw.write("20\r\n");
			fw.write("30");
			
			//Cierro el stream
			fw.close();
			
			//Abro el stream, el fichero debe existir
			FileReader fr = new FileReader(fichero01);
			
			//Leemos el fichero y lo mostramos por pantalla
			int valor = fr.read();
			
			while(valor != -1)
			{
				System.out.print((char)valor);
				valor = fr.read();
			}
			
			//Cerramos el stream
			fr.close();
		}
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}