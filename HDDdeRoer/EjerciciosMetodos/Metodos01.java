package EjerciciosMetodos;
import java.util.*;
//Calcule el área de un circulo, cuadrado o triangulo. (Formulas Abajo)
//Pedir la figura a calcular según lo introducido pedirá los valores necesarios para calcular el área. 
//Crea un método por cada figura para calcular cada área, este devolverá un número real.
public class Metodos01
{
	private Scanner leer;
	private int eleccion;
	private double radio, base, altura, lado, areaCirc, areaCua, areaTri;
	
	public static void main(String[] args)
	{
		Metodos01 mt = new Metodos01();
		mt.pedirFigura();
	}

	private void pedirFigura()
	{
		leer = new Scanner(System.in);
		do
		{
			System.out.println("Seleccione Figura(Circulo, Cuadrado, Triangulo)");
			System.out.println("1. Circulo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Triangulo");
			System.out.println("4. Salir");
			System.out.print("Eleccion: ");
			eleccion = leer.nextInt();
			
			switch (eleccion)
			{
				case 1:
					System.out.print("Introducir radio: ");
					radio = leer.nextDouble();
					areaCirculo(radio);
					System.out.println("Area Circulo "+areaCirc);
					break;
					
				case 2:
					System.out.print("Introducir lado: ");
					lado = leer.nextInt();
					areaCuadrado(lado);
					System.out.println("Area Cuadrado: "+areaCua);
					break;
					
				case 3:
					System.out.print("Introducir base: ");
					base = leer.nextInt();
					System.out.print("Introducir altura: ");
					altura = leer.nextInt();
					areaTriangulo(base, altura);
					System.out.println("Area Triangulo: "+areaTri);
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
	
	public double areaCirculo(double radio)
	{
		areaCirc = (Math.pow(radio, 2)*Math.PI);
		return areaCirc;
	}
	public double areaCuadrado(double lado)
	{
		areaCua = lado*lado;
		return areaCua;
	}
	public double areaTriangulo(double base, double altura)
	{
		areaTri = (base*altura)/2;
		return areaTri;
	}
}
/*
Circulo: (radio^2)*PI
Cuadrado: lado * lado
Triangulo: (base * altura) / 2
*/