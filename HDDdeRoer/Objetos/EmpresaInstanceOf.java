package Objetos;

public class EmpresaInstanceOf
{
	public static void main(String[] args)
	{
		
        Empleado empleados[] = new Empleado[4];
        empleados[0] = new Comercial("Fernando", "Ureña", 23, 700, 50);
        empleados[1] = new Repartidor("Antonio", "Lopez", 30, 800, "Este");
        empleados[2] = new Comercial("Laura", "Perez", 24, 1000, 30);
        empleados[3] = new Repartidor("Rosa", "Serrano", 43, 1200, "Oeste");
 
        for(int i=0; i<empleados.length; i++)
        {
            //El array es de objetos Empleados
            if(empleados[i] instanceof Comercial)
            {
                //Si la posición del array es un comercial, hacemos un casting de objetos
                Comercial ref = (Comercial)empleados[i];
                //Ahora podemos invocar métodos del objeto
                System.out.println("La comision es de "+ref.getComision());
            }
            if(empleados[i] instanceof Repartidor)
            {
                //Si la posición del array es un repartidor, hacemos un casting de objetos
                Repartidor ref = (Repartidor)empleados[i];
                //Ahora podemos invocar métodos del objeto
                System.out.println("La zona es "+ref.getZona());
            }
 
        }
    }
}