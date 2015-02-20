package Ejerciciosficheros;
import java.io.*;

public class EjerFich02
{

	public static void main(String[] args)
	{
		try(FileWriter fw = new FileWriter("C:\\ejercicio02.txt");FileReader fr = new FileReader("C:\\ejercicio02.txt");)
		{
			escribirFichero(fw);
			fw.flush();
			mostrarFichero(fr);
		}
		catch(IOException e)
		{
			System.out.println("Error E/S "+e);
		}
	}
	
	public static void escribirFichero(FileWriter fw)throws IOException
	{
		fw.write("Bienvenido Amigo");
	}
	
	public static void mostrarFichero(FileReader fr)throws IOException
	{
		int valor = fr.read();
		
		while(valor != -1)
		{
			//Solo cambiara el caracter si es una minuscula o una mayuscula
			char caracter = (char)valor;
			if(caracter>=97 && caracter<=122)
			{
				caracter-=32;
			}
			else if(caracter>=65 && caracter<=90)
			{
				caracter+=32;
			}
			System.out.print(caracter);
			valor=fr.read();
		}
	}
}

//Crea una aplicaci�n donde pidamos la ruta de un fichero por teclado y un texto que queramos a escribir en el fichero.
//Deber�s mostrar por pantalla el mismo texto pero variando entre may�sculas y min�sculas, es decir,
//si escribo �Bienvenido� deber� devolver �bIENVENIDO�.
//Si se escribe cualquier otro car�cter, se quedara tal y como se escribi�.
//Deber�s crear un m�todo para escribir en el fichero el texto introducido y otro para mostrar el contenido en may�sculas.