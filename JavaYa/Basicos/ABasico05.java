package Basicos;
//Pedir N� de Articulos y precio unitario. Mostrar el total a pagar.
import java.util.*;
public class ABasico05
{
	static Scanner leer;
	
	
	public static void main(String[] args)
	{
    	int cantidad;
    	float precio, importe;
    	leer = new Scanner(System.in);
    	
    	System.out.print("N� de Articulos: ");
    	cantidad = leer.nextInt();
    	System.out.print("Precio Articulo: ");
    	precio = leer.nextFloat();
    	
    	importe = precio * cantidad;
    	
    	System.out.print("Total a Pagar: "+importe);
	}
}