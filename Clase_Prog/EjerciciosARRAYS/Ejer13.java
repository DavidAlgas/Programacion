package EjerciciosARRAYS;
import java.io.*;
//Pedir el a�o de nacimiento de una persona (pedirlo como cadena y no como n�mero) y sumar todos sus d�gitos, 
//si el resultado es mayor que diez, volver a sumar los d�gitos hasta que d� como resultado un s�lo d�gito.

public class Ejer13 
{
	public static void main(String[] args) 
	{
		numSuerte();
	}
	
	static void numSuerte()
	{
		System.out.println("-- Numero de la Suerte --");
		String a�o = "";
		int suma=0;
		
		do
		{
			a�o = pideCadena("A�o de Nacimiento: ");
			for(int a=0; a<a�o.length(); a++)
			{
				int num = Integer.parseInt(String.valueOf(a�o.charAt(a)));
				suma = suma + num;
			}
			
			String a�o2 = Integer.toString(suma);
			int suma2=0;
			
			if(a�o2.length() >= 2)
			{
				for(int a=0; a<a�o2.length(); a++)
				{
					int num = Integer.parseInt(String.valueOf(a�o2.charAt(a)));
					suma2 = suma2 + num;
				}
			}
			
			System.out.println(a�o+" --> "+suma+" --> "+suma2);
			
		}while(a�o=="");
	}
	
	
	static public String pideCadena(String texto)	
    {
        InputStreamReader flujo = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(flujo);
        String cadnum = null;
        System.out.print(texto);
        
        try 
        {
            cadnum = teclado.readLine();
        } 
        catch (IOException ex) 
        {
            System.out.println("\tHay errores: "+ex);
        }
        return cadnum;
    }
}