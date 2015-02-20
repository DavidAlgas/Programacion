package Objetos;

public class EmpresaComparar
{
	public static void main(String[] args)
	{
        //Creamos dos objetos distintos
        Empleado empleado1 = new Empleado("David", "Algas", 21, 1500);
        Empleado empleado2 = new Empleado("Kevin", "Gonzalez", 58, 1500);
 
        //Comprobamos si son iguales (no lo son)
        if(empleado1.equals(empleado2))
        {
            System.out.println("Los objetos son iguales");
            System.out.println(empleado1.getNombre()+" comparado con "+empleado2.getNombre());
        }
        else
        {
            System.out.println("Los objetos no son iguales");
            System.out.println(empleado1.getNombre()+" comparado con "+empleado2.getNombre());
        }
 
        //Creamos un objeto nuevo
        Empleado empleado3;
 
        //Asignamos la direccion del empleado1 al empleado3
        empleado3 = empleado1;
 
        //Comprobamos si son iguales (si lo son)
        System.out.println(" ");
        System.out.println("-- Comparacion por Nombre y Apellido");
        if(empleado3.equals(empleado1))
        {
            System.out.println("Los objetos son iguales");
            System.out.println(empleado3.getNombre()+" comparado con "+empleado1.getNombre());
        }
        else
        {
            System.out.println("Los objetos no son iguales");
        }
        
        //Saber cual es mayor que el otro por la edad(Definida en la clase Empleado)
        System.out.println(" ");
        System.out.println("-- Comparacion por Edad");
        if (empleado2.compareTo(empleado3)==1)
        {
            System.out.println("El empleado2 es mayor que el empleado3");
            System.out.println("El empleado2 con "+empleado2.getEdad()+" años es mayor que el empleado3 con "+empleado3.getEdad()+" años.");
        }
        else
        {
            System.out.println("El empleado3 es mayor que el empleado2");
            System.out.println("El empleado3 con "+empleado3.getEdad()+" años es mayor que el empleado2 con "+empleado2.getEdad()+" años.");
        }
    }
}