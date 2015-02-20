package EjerciciosArrays;
//Guardar en un array los 20 primeros numeros pares

public class EjerciciosArrays04
{
	private int[] numerosPares;
	private int contador=2;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays04 --");
		EjerciciosArrays04 eja = new EjerciciosArrays04();
		eja.cargarValores();
		eja.mostrarNumerosPares();
	}
	private void cargarValores()
	{
		numerosPares = new int[20];
		
		for(int a=0; a<numerosPares.length; a++)
		{
			numerosPares[a] = contador;
			contador = contador + 2;
		}
	}
	
	private void mostrarNumerosPares()
	{
		System.out.println("20 Numeros Pares");
		for(int a=0; a<numerosPares.length; a++)
		{
			System.out.print(numerosPares[a]+", ");
		}
	}
}