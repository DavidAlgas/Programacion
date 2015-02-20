package Ficheros;
import java.io.*;
//FileOutputStream (escribir) y FileInputStream (para leer) se usan de la misma manera que FileWriter y FileReader

public class Ficheros20
{
	public static void main(String[] args)
	{
		try
		{
			FileOutputStream fos = new FileOutputStream("C:\\fichero20.ddr");
			FileInputStream fis = new FileInputStream("C:\\fichero20.ddr");
			
			String texto="Esto es una prueba para ficheros binariosssss";
			
			//Copiamos el texto en un array de bytes
            byte codigos[] = texto.getBytes();
            fos.write(codigos);
            
            fos.close();
            
            //Leemos el archivo
            int valor = fis.read();
            
            while(valor != -1)
            {
                System.out.print((char)valor);
                valor = fis.read();
            }
            
            fis.close();
        }
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
        }
    }
}