package EjerciciosGenerales;
import java.util.Scanner;
//Pasar de decimal a binario.

public class EjerciciosGenerales10
{
	private Scanner leer;
	private int numero, exp=0, digito;
	private double binario=0;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales10 --");
		EjerciciosGenerales10 eg = new EjerciciosGenerales10();
		eg.cargarNumero();
		
	}
	
	private void cargarNumero()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Introducir numero: ");
			numero = leer.nextInt();
			mostrarNumero();
			
		}while(numero!=0);
	}
	
	private void mostrarNumero()
	{
        while(numero!=0)
        {
        	digito = numero % 2;  
        	binario = binario + digito * Math.pow(10, exp);
        	exp++;
        	numero = numero/2;
        }
        
        System.out.printf("Binario: %.0f %n", binario);
	}
}
