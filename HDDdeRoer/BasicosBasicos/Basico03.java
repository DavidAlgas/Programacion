package BasicosBasicos;
import java.util.*;
//Declarar variable entera N y asígnale un valor. 
//Incrementar N en 77, Decrementarla en 3, Duplicar su valor. 
public class Basico03
{
	private Scanner leer;
	private int N;
	
	public static void main(String[] args)
	{
		System.out.println("  -- Basico03 --");
		Basico03 bs3 = new Basico03();
		bs3.cargarValor();
		bs3.realizarOps();
	}
	
	private void cargarValor()
	{
		leer = new Scanner(System.in);
		System.out.print("Valor 1: ");
		N = leer.nextInt();
	}

	private void realizarOps()
	{
        N = N + 77;
		System.out.println(N+" + 77 = "+N);
		N = N - 3;
		System.out.println(N+" - 3 = "+N);
		N = N * 2;
		System.out.println(N+" x 2 = "+N);
	}

		
}