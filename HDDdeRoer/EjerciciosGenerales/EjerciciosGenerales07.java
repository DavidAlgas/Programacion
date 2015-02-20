package EjerciciosGenerales;
//Comprobar los numeros perfectos del 1 al 1000 
public class EjerciciosGenerales07
{
	private int numeros, suma, divisores;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales07 --");
		EjerciciosGenerales07 eg = new EjerciciosGenerales07();
		eg.comprobar();
	}
	
	private void comprobar()
	{
		System.out.println("Números perfectos entre 1 y 1000: ");
		
        for(numeros=1; numeros<=1000; numeros++)//Numeros que vamos a comprobar
        {
        	suma=0;
            for(divisores=1; divisores<numeros; divisores++)//Se divide desde 1 hasta i-1 
            {  
                 if(numeros%divisores==0)
                 {
                    suma=suma+divisores;     // si es divisor se suma
                 }
            }
            
          if(numeros==suma) // si el numero es igual a la suma de sus divisores es perfecto
          {
        	  System.out.println(numeros);
          }
        }
	}
}