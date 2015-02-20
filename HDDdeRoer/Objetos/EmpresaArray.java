package Objetos;
import java.util.*;

public class EmpresaArray
{
	static Scanner leer;
	
	public static void main(String[] args)
	{
        //Creamos un array de objetos de la clase empleados
        Empleado empleados[];
        leer = new Scanner(System.in);
        String nombre, apellido;
        int edad, size;
        double salario;
        
        System.out.print("N� de Empleados: ");
        size = leer.nextInt();
        empleados = new Empleado[size];
        
        //Creamos 10 empleados 
        for (int a=0; a<empleados.length; a++)
        {
        	System.out.println("Empleado "+(a+1));
        	System.out.print("Nombre: ");
        	nombre = leer.next();
        	System.out.print("Apellido: ");
        	apellido = leer.next();
        	System.out.print("edad: ");
        	edad = leer.nextInt();
        	System.out.print("Salario: ");
        	salario = leer.nextDouble();
            empleados[a] = new Empleado(nombre, apellido, edad, salario);
        }
 
        //Lo recorremos y sumamos de nuevo los salarios
        int suma=0;
        for (int a=0; a<empleados.length; a++)
        {
            suma = suma + (int)empleados[a].getSalario();
        }
        System.out.println("La suma de salarios es "+suma);
    }
}