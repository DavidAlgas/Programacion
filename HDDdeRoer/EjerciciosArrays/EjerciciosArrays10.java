package EjerciciosArrays;
import java.util.*;
//LLenar un array con numeros aleatorios

public class EjerciciosArrays10
{
	private Random rnd;
	private Scanner leer;
	private int[] numeros;
	private boolean esta=false;
	private int tam, max=99, min=0, numero;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays10 --");
		EjerciciosArrays10 eja = new EjerciciosArrays10();
		eja.generarNumero();
		eja.mostrarArray();
	}

	public void generarNumero()
	{
		rnd = new Random();
		leer = new Scanner(System.in);
		
		System.out.print("Tamaño Array: ");
		tam = leer.nextInt();
		numeros = new int[tam];
		
		for (int a=0 ;a<numeros.length; a++)
		{
			do
			{
				numero = rnd.nextInt(max - min + 1) + min;
				comprobarRepetido();
			}while(esta==true);
			numeros[a] = numero;			
		}
	}
	
	public void comprobarRepetido()
	{
		for(int a=0; a<numeros.length; a++)
		{
			if(numeros[a]==numero)
			{
				esta = true;
			}
		}
	}
		
	public void mostrarArray()
	{
		for(int b=0; b<numeros.length; b++)
		{
			System.out.print(numeros[b]+", ");
		}
	}	
}