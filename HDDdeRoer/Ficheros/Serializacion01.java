package Ficheros;
import java.io.*;

public class Serializacion01
{
    public static void main(String[] args)
    {
        //Creamos el objeto
        Empleado empleado1 = new Empleado("Fernando", "Ureña", 23, 800);
        Empleado empleado2 = new Empleado("Antonio", "Lopez", 35, 1000);
        
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\empleados.ddr"));
        	ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\empleados.ddr")))
        {
            //Escribimos en un fichero
            oos.writeObject(empleado1);
            oos.writeObject(empleado2);
            
            //Cuando no haya mas objetos saltara la excepcion EOFException
            while(true)
            {
                Empleado aux = (Empleado)ois.readObject();
                System.out.println(aux.getNombre());
                System.out.println(aux.getApellido());
                System.out.println(aux.getEdad());
                System.out.println(aux.getSalario());
                System.out.println("");
                }
        }
        catch(ClassNotFoundException e){}
        catch(EOFException e){}
        catch(IOException e)
        {
        	System.out.println("Error E/S: "+e);
        }
    }
}