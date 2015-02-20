package EjerciciosGenerales;
import java.util.*;
//Paras ºC ºK. Repetir proceso? (S/N)
public class EjerciciosGenerales03
{
	private Scanner leer;
	private double gradosC, gradosK;
	private String pregunta;
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales03 --");
		EjerciciosGenerales03 eg = new EjerciciosGenerales03();
		eg.cargaDato();
	}

	private void cargaDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Ingresar ªC: ");
			gradosC = leer.nextDouble();
			conversion();
			
			System.out.print("Repetir proceso? (S/N): ");
			pregunta = leer.next();
		}while(pregunta != "N");
	}
	
	private void conversion()
	{
		gradosK = gradosC + 273.15;
		System.out.println(gradosC+"ªC --> "+gradosK+"ºK");
	}
}