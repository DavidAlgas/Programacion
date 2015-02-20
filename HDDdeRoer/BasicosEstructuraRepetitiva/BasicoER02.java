package BasicosEstructuraRepetitiva;
//Mostrar del 1 al 100 usando do...while
public class BasicoER02
{
	static int contador=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- BasicoER02 --");
		
		do
		{
			System.out.println(contador);
			contador++;
		}while(contador<=100);
	}
}