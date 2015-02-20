package Ficheros;
import java.io.*;
//Probando DataOutputSteam y DataInputStream con metodos
public class Ficheros31
{

	public static void main(String[] args)
	{
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\fichero31.ddr"));
			DataInputStream dis = new DataInputStream(new FileInputStream("C:\\fichero31.ddr"));)
		{
			escribirFichero(dos);
			leerFichero(dis);
		}
		catch(EOFException e)
		{
			System.out.println("Fin de Fichero");
		}
		catch(IOException e)
		{
			System.out.println("Error E/S "+e);
		}
	}
	
	public static void escribirFichero(DataOutputStream dos)throws IOException
	{
		dos.writeUTF("David");
		dos.writeInt(21);
		
		
	}
	
	public static void leerFichero(DataInputStream dis)throws IOException
	{
		System.out.println(dis.readUTF());
		System.out.println(dis.readInt());
	}
}