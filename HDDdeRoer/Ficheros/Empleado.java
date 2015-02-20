package Ficheros;
import java.io.*;

public class Empleado implements Serializable
{
	private static final long serialVersionUID = -2873344211410398459L;
	
	//ATRIBUTOS
	protected String nombre; 							//Nombre del empleado 
	protected String apellido;						    //Apellido del empleado
	protected int edad; 								//Edad del empleado
	protected double salario;							//Salario del empleado
	protected final static double SALARIO_DEF=600;  //Salario por defecto
    
    public String getNombre()
    {
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getApellido()
	{
		return apellido;
	}
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}

    //Suma un plus al salario del empleado si el empleado tiene mas de 40 años
    //@param sueldoPlus
    public boolean plus (double sueldoPlus)
    {
       boolean aumento = false;
       if(edad>40)
       {
           salario = salario + sueldoPlus;
           aumento = true;
       }
       return aumento;
    }
    
    
    //METODOS PRIVADOS
    //Metodo toString para mostrar la informacion contenida en el objeto
    public String toString()
    {
    	String mensaje= "El empleado "+nombre+" "+apellido+" de "+edad+" años, cobra "+salario+"€";
    	return mensaje;
    }
    
    //Metodo equals para definir en que se tiene que parecer dos objetos para ser iguales
    public boolean equals (Empleado a)
    {
    	//en este caso si su nombre y apellido coinciden son iguales
        if(a.getNombre().equals(nombre) && a.getApellido().equals(apellido))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //Metodo para determinar por que valores un objeto sera mayor que otro objetos(se requiere implementar el comparable)
    public int compareTo(Empleado a)
    {
    	int estado=-1;
    	
        if(this.edad==a.getEdad())
        {
            //Los objetos son iguales
            estado=0;
        }
        else if(this.edad>a.getEdad())
        {
            //El objeto 1 es mayor que la pasada por parametro
            estado=1;
        }
        return estado;
    }
    
    
    
    //CONSTRUCTORES
    //Constructor por defecto
    public Empleado()
    {
    	this.nombre="";
    	this.apellido="";
    	this.edad=0;
    	this.salario=SALARIO_DEF;
    }
    
    //Constructor con 2 parametros
    public Empleado(String nombre, String apellido)
    {
       this (nombre, apellido, 0, SALARIO_DEF);
    }
    
    //Constructor con 3 parametros
    public Empleado (String nombre, String apellido, int edad)
    {
        this (nombre, apellido, edad, SALARIO_DEF);
    }
    
    //Constructor con 4 parametros
    public Empleado(String nombre, String apellido, int edad, double salario)
    {
    	this.nombre=nombre;
    	this.apellido=apellido;
    	this.edad=edad;
    	this.salario=salario;
    }   
}