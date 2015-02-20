package BasicosEstructuraRepetitiva;
//Mostrar del 100 al 1 usando do...while
public class BasicoER05
{
	static int contador=100;
	
	public static void main(String[] args) 
	{
		System.out.println("  -- BasicoER05 --");
		
		do
		{
			System.out.println(contador);
			contador--;
		}while(contador>=0);
	}
}