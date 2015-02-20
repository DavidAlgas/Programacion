package Ficheros;
import java.io.*; //Importamos todas las clases de java.io.

public class Ficheros11
{
	public static void main(String[] args)
	{
		try
        {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\fichero11.txt"));
            BufferedReader br = new BufferedReader(new FileReader("C:\\fichero11.txt"));
            
            escribeFichero(bw);
            
            //Guardamos los cambios del fichero
            bw.flush();
            
            leeFichero(br);
            
        }
		catch(IOException e)
		{
            System.out.println("Error E/S: "+e);
        }
    }
	
    public static void escribeFichero(BufferedWriter bw) throws IOException
    {
        //Escribimos en el fichero
        bw.write("Esto es una prueba usando Buffered");
        bw.newLine();
        bw.write("Seguimos usando Buffered");
    }
    public static void leeFichero(BufferedReader br) throws IOException
    {
        //Leemos el fichero y lo mostramos por pantalla
        String linea=br.readLine();
        while(linea!=null)
        {
            System.out.println(linea);
            linea=br.readLine();
        }
    }
}