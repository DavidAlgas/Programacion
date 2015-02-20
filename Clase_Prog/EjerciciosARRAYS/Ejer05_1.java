package EjerciciosARRAYS;
//Crear un m�todo que devuelve si una frase pasada como par�metro es pal�ndromo o no. 
//En el programa principal se pedir� una frase y se mostrar� un mensaje diciendo si es pal�ndromo o no, 
//continuar� pidiendo frases hasta que se pulse enter. Utilizaremos el m�todo pideCadena. 
//Se valorar� positivamente utilizar la ejecuci�n m�s �ptima. (Recorrer la frase el n�mero de veces estrictamente necesario)

public class Ejer05_1
{
	public static void main(String[] args) 
	{
		//String sPalabra = "anilina";
        String palabra = "Anita lava la tina";
        
        // Si queremos saber si es pal�ndromo una frase deberemos de borrar los espacios
        // sPalabra = sPalabra.replace(" ", "");
        
        int inc = 0; 
        int des = palabra.length()-1;
        boolean bError = false;         
        
        while ((inc<des) && (!bError))
        {
        	if (palabra.charAt(inc) == palabra.charAt(des))
        	{
        		inc++;
        		des--;
        	}
        	else
        	{
        		bError = true;
        	}               
        }
        
        if(!bError)
        {
        	System.out.println(palabra + " es un PALINDROMO");
        }     
        else
        {
        	 System.out.println(palabra + " NO es un palindromo");
        }  
   }
}