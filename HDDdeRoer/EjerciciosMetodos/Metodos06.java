package EjerciciosMetodos;
import java.util.*;
//Calcule el cambio de moneda. (Cambios Abajo)
public class Metodos06
{
	private Scanner leer;
	private int eleccion;
	private double euros, libras, dolares, yenes;
	
	public static void main(String[] args)
	{
		Metodos06 mt = new Metodos06();
		mt.pedirMoneda();
	}

	private void pedirMoneda()
	{
		leer = new Scanner(System.in);
		do
		{
			System.out.println("De Euros a ");
			System.out.println("1. Libras");
			System.out.println("2. Dolares");
			System.out.println("3. Yenes");
			System.out.println("4. Salir");
			System.out.print("Eleccion: ");
			eleccion = leer.nextInt();
			
			switch (eleccion)
			{
				case 1:
					System.out.print("Introducir Euros: ");
					euros = leer.nextDouble();
					aLibras(euros);
					System.out.println(euros+"€ --> "+libras+" Libras");
					break;
					
				case 2:
					System.out.print("Introducir lado: ");
					euros = leer.nextDouble();
					aDolares(euros);
					System.out.println(euros+"€ --> "+dolares+"$");
					break;
					
				case 3:
					System.out.print("Introducir base: ");
					euros = leer.nextDouble();
					aYenes(euros);
					System.out.println(euros+"€ --> "+yenes+" Yenes");
					break;
					
				case 4:
					System.exit(0);
					break;	
					
				default:
					System.out.println("Mala eleccion");
					break;
			}
		}while(eleccion != 4);
	}
	
	public double aLibras(double eur)
	{
		libras = eur*0.86;;
		return libras;
	}
	public double aDolares(double eur)
	{
		dolares = eur*1.28611;
		return dolares;
	}
	public double aYenes(double eur)
	{
		yenes = eur*129.852;
		return yenes;
	}
}
/*
0.86 libras es un 1 €
1.28611 $ es un 1 €
129.852 yenes es un 1 €
*/