package Ficheros;
import java.io.*;
//Usando DataOutputStream y DataInputStream
//Escribe archivos binarios
public class Ficheros30
{
	public static void main(String[] args)
    {
		try
		{
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\fichero30.ddr"));
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\fichero30.ddr"));
 
            //Al escribir indicamos lo que escribimos ej. escribimos un numero .writeInt
            dos.writeInt(23);//Escribimos un numero writeInt
            dos.writeUTF("Fernando");//Escribimos una cadena writeUTF
            dos.writeInt(1990);//Escribimos un numero writeInt
            dos.close();
            
            
            //Al leer especificaremos lo que leemos ej. leemos numero .readInt
            System.out.println(dis.readInt()); //Leemos un numero y lo mostramos
            System.out.println(dis.readUTF());//Leemos una cadena y lo mostramos
            System.out.println(dis.readInt());//Leemos un numero y lo mostramos
            dis.close();
        }
		catch(EOFException e)
		{
            //... Nos saltara este mensaje
            System.out.println("Fin del fichero");
        }
		catch(IOException e)
		{
            System.out.println("Error E/S"+e);
        }
		
    }
}