package Instanciar;
import java.util.*;
//Cargar los lados de un tri�ngulo e implemente los siguientes m�todos:
//inicializar los atributos, imprimir el valor del lado mayor y otro m�todo que muestre si es equil�tero o no.
public class Instanciar02
{
    static Scanner leer;
    static int lado1,lado2,lado3;
    
    public static void main(String []args)
    {
        Instanciar02 triangulo = new Instanciar02();
        triangulo.cargarDatos();
        triangulo.ladoMayor();
        triangulo.esEquilatero();
    }
    
    public void cargarDatos()
    {
        leer = new Scanner(System.in);
        
        System.out.print("Medida lado 1: ");
        lado1 = leer.nextInt();
        System.out.print("Medida lado 2: ");
        lado2 = leer.nextInt();
        System.out.print("Medida lado 3: ");
        lado3 = leer.nextInt();       
    }
    
    public void ladoMayor()
    {
    	System.out.print("Lado mayor: ");
    	
        if(lado1>lado2 && lado1>lado3)
        {
            System.out.println(lado1);
        }
        else
        {
        	if(lado2>lado3)
        	{
                System.out.println(lado2);
            } 
        	else
        	{
                System.out.println(lado3);
            }
        }
    }
    
    public void esEquilatero()
    {
        if (lado1==lado2 && lado1==lado3) 
        {
            System.out.print("Es un tri�ngulo equil�tero");
        }
        else
        {
            System.out.print("No es un tri�ngulo equil�tero");            
        }
    }
}