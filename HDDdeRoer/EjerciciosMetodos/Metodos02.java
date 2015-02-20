package EjerciciosMetodos;
import java.util.*;
//Crea una aplicación que nos genere una cantidad de números enteros aleatorios que nosotros le pasaremos por teclado. 
//Este método devolverá un número entero aleatorio. Muestra estos números por pantalla.
public class Metodos02
{
	private Scanner leer;
	private int limite, numero1, numero2;
	
    public static void main(String[] args) 
    {
		Metodos02 mt = new Metodos02();
		mt.pedirNumero();
    }
    
    public void pedirNumero()
    {
    	leer = new Scanner(System.in);
    	
    	//Introducimos los datos necesarios
        System.out.print("Introduce el limite: ");
        limite = leer.nextInt();
        System.out.print("Introduce un numero: ");
        numero1 = leer.nextInt();
        System.out.print("Introduce un numero: ");
        numero2 = leer.nextInt();
        
        //generamos los numeros
        for(int i=0;i<limite;i++)
        {
            System.out.println(generaNumero(numero1, numero2));
        }
    }
    
    public static int generaNumero(int num1, int num2)
    {
        //return ((int)Math.floor(Math.random()*(num2-num1)+num1));
        return ((int)(Math.random()*(num2-num1)+num1));
        
    }
}