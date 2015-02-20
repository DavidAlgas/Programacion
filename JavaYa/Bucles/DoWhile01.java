package Bucles;
import java.util.*;
//Carga de un n�mero entre 0 y 999, y nos muestre un mensaje de cu�ntos d�gitos tiene el mismo. 
//Finalizar el programa cuando se cargue el valor 0.
public class DoWhile01
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
        int numero;
        
        System.out.println("  -- Do While01 --");
        
        do
        {
            System.out.print("Ingrese un valor entre 0 y 999 (0 finaliza): ");
            numero = leer.nextInt();
            
            if (numero>=100)
            {
            	System.out.println("Tiene 3 d�gitos.");
            }
            else 
            {
            	if (numero>=10)
            	{
            		System.out.println("Tiene 2 d�gitos.");
                }
            	else
            	{
                    System.out.println("Tiene 1 d�gito.");
                }
            }
        }
        while (numero!=0);
    }
}