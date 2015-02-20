package Objetos;

public class Empresa
{
	
	public static void main(String[] args)
	{
		//Creamos 3 objetos distintos
		Empleado empleado01 = new Empleado("David", "Algás", 21, 1500);
		Empleado empleado02 = new Empleado("Kevin", "Gonzalez", 20, 1000);
		Empleado empleado03 = new Empleado("Clara", "Sebastian", 19, 2000);
		Empleado empleado04 = new Empleado();//Mostrara los atributos por defecto(vacios todos salvo salario_def)
		
		//Mostramos la informacion del objeto(Si esta declarado el metodo funciona sin poner .toString())
		System.out.println(empleado01.toString());
		System.out.println(empleado01);
		System.out.println(empleado02.toString());
		System.out.println(empleado03.toString());
		System.out.println(empleado04.toString());
		
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		
		//Creamos objetos de las clases hijas
        Comercial comercial01 = new Comercial("Antonio", "Lopez", 24, 600, 50);
        Repartidor repartidor01 = new Repartidor("Fernando", "Ureña", 43, 400, "Este");
        
        //Mostramos los atributos y el salario actual, usando los metodos get de la clase padre
        System.out.println("El salario actual del comercial es "+comercial01.getSalario());
        System.out.println("El salario actual del repartidor es "+repartidor01.getSalario());
        
        //Invocamos los metodos de la clase padre
        comercial01.plus(300);
        repartidor01.plus(300);
        
        //Mostramos los atributos, usando los metodos get de la clase padre
        System.out.println("El salario ahora del comercial es "+comercial01.getSalario());
        System.out.println("El salario ahora del repartidor es "+repartidor01.getSalario());
	}
}