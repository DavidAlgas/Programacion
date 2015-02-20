package BasicosEstructuraRepetitiva;
//Mostrar del 1 al 100 usando while
public class BasicoER01
{
	static int contador=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoER01 --");
		
		while(contador<=100)
		{
			System.out.println(contador);
			contador++;
		}
	}
}