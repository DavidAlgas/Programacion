package Ejerciciosficheros;
import java.io.*;
public class EjerFich01
{

	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("C:\\ejercicio01.txt"); FileReader fr = new FileReader("C:\\ejercicio01.txt"))
		{
			fw.write("Esto es una prueba");
			
			fw.flush();
			
			int valor = fr.read();
			while(valor!=-1)
			{
                //Si el caracter es un espacio no lo escribe
                if(valor!=32)
                {
                    System.out.print((char)valor);
                }
                valor=fr.read();
            }
		}
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
}

//Crea un fichero de texto con el nombre y contenido que tu quieras. 
//Ahora crea una aplicación que lea este fichero de texto carácter a carácter y muestre su contenido por pantalla  
//sin espacios. Por ejemplo, si un fichero tiene el siguiente texto “Esto es una prueba”, deberá mostrar “Estoesunaprueba”.
//Captura las excepciones que veas necesario.
