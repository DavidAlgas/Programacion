package Ficheros;
import java.io.*;
//Intentamos leer una imagen
public class Ficheros21
{
	public static void main(String[] args)
	{
		try(FileInputStream fis = new FileInputStream("C:\\Imagen.png"))
		{
			int valor=fis.read();
			
            while(valor!=-1)
            {
                System.out.print((char)valor);
                valor=fis.read();
            }
        }
		catch(IOException e)
		{
        	System.out.println("Error E/S: "+e);
        }
    }
 
}