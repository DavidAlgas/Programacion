package Ficheros;
import java.io.*; //Importamos todas las clases de java.io.

public class Ficheros10
{
	public static void main(String[] args)
	{
		try
        {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\fichero10.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\fichero10.txt"));
            
			//Escribimos en el fichero
            bw.write("Esto es una prueba usando Buffered");
            bw.newLine();
            bw.write("Seguimos usando Buffered");
            bw.close();
            
            //Leemos el fichero y lo mostramos por pantalla
            String linea = br.readLine();
            while(linea != null)
            {
                System.out.println(linea);
                linea=br.readLine();
            }
            br.close();
        }
		catch(IOException e)
		{
            System.out.println("Error E/S: "+e);
        }
    }
}