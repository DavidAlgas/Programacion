package EjerciciosGenerales;
import java.util.*;
//Calcular Nº cifras valor entero
public class EjerciciosGenerales02
{
	private Scanner leer;
	private int valor1, numDig=0;
	private String pregunta="S";
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosGenerales02 --");
		EjerciciosGenerales02 eg = new EjerciciosGenerales02();
		eg.cargaDato();
		
	}

	private void cargaDato()
	{
		leer = new Scanner(System.in);
		
		do
		{
			System.out.print("Valor 1: ");
			valor1 = leer.nextInt();
			
			if(valor1 != 0)
			{
				contarCifras();
			}
		}while(valor1 !=0);
		
		
	}

	private void contarCifras()
	{
		while(valor1 != 0)        //mientras a n le queden dígitos
		{
			valor1 = valor1/10;   //le quitamos el último dígito
			numDig++;             //sumamos 1 al contador de dígitos
        }
		
		System.out.println("El numero tiene "+numDig+" digitos.");
		pregunta();
    }

	
	private void pregunta()
	{
		System.out.print("Continuar(S/N): ");
		pregunta = leer.next();
		
		if(pregunta.equalsIgnoreCase(pregunta))
		{
			cargaDato();
		}
	}
}