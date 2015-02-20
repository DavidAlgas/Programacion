package BasicosEstructuraRepetitiva;
//Mostrar del 100 al 1 usando while
public class BasicoER04
{
	static int contador=100;
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoER04 --");
		
		while(contador>=0)
		{
			System.out.println(contador);
			contador--;
		}
	}
}