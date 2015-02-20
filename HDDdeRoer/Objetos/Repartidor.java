package Objetos;

public class Repartidor extends Empleado
{
	//Atributos, aunque no indiquemos nada es como si tuviera los atributos del padre
    //Zona del repartidor
	private String zona;
	
	//Constructor por defecto
	public Repartidor()
	{
		this.zona="";
	}
	
	public String getZona()
	{
		return zona;
	}
	
	public void setZona(String zona)
	{
		this.zona=zona;
	}
	
	//Constuctor con 5 parametro
	public Repartidor(String nombre, String apellido, int edad, double salario, String zona)
	{
		super(nombre, apellido, edad, salario);
		this.zona=zona;
	}
}