package ClaseSTRING;
import java.util.*;
//Confeccionar una clase que solicite el ingreso de dos String y luego emplee los m�todos m�s comunes de la clase String.
public class metodosString01
{
	static Scanner leer;
	
    public static void main(String[] args)
    {
    	leer = new Scanner(System.in);
        String cad1;
        String cad2;
        
        System.out.print("Cadena 1: ");
        cad1 = leer.nextLine();
        System.out.print("Cadena 2: ");
        cad2 = leer.nextLine();
        
        
        //boolean equals(String s1)
        //Compara las cadenas de caracteres.
        if(cad1.equals(cad2)==true)
        {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        }
        else
        {
            System.out.println(cad1+" no es exactamente igual a "+cad2);        
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Compara las cadenas de caracteres sin tener en cuenta las mayusculas o minusculas
        if(cad1.equalsIgnoreCase(cad2)==true)
        {
            System.out.println(cad1+" es igual a "+cad2+" sin tener en cuenta may�sculas/min�sculas");
        }
        else
        {
            System.out.println(cad1+" no es igual a "+cad2+" sin tener en cuenta may�sculas/min�sculas");        
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        if(cad1.compareTo(cad2)==0)
        {
            System.out.println(cad1+" es exactamente igual a "+cad2);
        }
        else
        {
        	if (cad1.compareTo(cad2)>0)
        	{
                System.out.println(cad1+ " es mayor alfab�ticamente que "+cad2);
            }
        	else
        	{
                System.out.println(cad2+ " es mayor alfab�ticamente que "+cad1);            
            }
        }
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna un caracter del String, llega al m�todo la posici�n del caracter a extraer.
        char carac1 = cad1.charAt(0);
        System.out.println("El primer caracter de "+cad1+" es "+carac1);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna la cantidad de caracteres almacenados en el String.
        int largo = cad1.length();
        System.out.println("El largo del String "+cad1+" es "+largo);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //Retorna un substring a partir de la posici�n indicada en el par�metro pos1 hasta la posici�n pos2 sin incluir dicha posici�n.
        String cad3 = cad1.substring(0,3);
        System.out.println("Los primeros tres caracteres de "+cad1+" son "+cad3);
        
        
        //---------------------------------------------------------------------------------------------------------
        //---------------------------------------------------------------------------------------------------------
        
        
        //int indexOf(String s1)
        //Retorna -1 si el String que le pasamos como par�metro no est� contenida en la cadena del objeto que llama al m�todo. 
        int posi = cad1.indexOf(cad2);
        
        if(posi==-1)
        {
            System.out.println(cad2+" no est� contenido en "+cad1);
        }
        else
        {
            System.out.println(cad2+" est� contenido en "+cad1+" a partir de la posici�n "+posi);
        }
        
        
        
        System.out.println(cad1+ " convertido a may�sculas es "+cad1.toUpperCase());
        System.out.println(cad1+ " convertido a min�sculas es "+cad1.toLowerCase());        
    }
}