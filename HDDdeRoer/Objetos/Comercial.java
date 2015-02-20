package Objetos;

public class Comercial extends Empleado
{
	//Atributos, aunque no indiquemos nada es como si tuviera los atributos del padre
    //Comision por venta del comercial
    private double comision;
    
    public double getComision()
    {
    	return comision;
    }
    
    public void setComision(double comision)
    {
    	this.comision = comision;
    }
 
    //Suma un plus al salario del empleado si el empleado tiene una comision menor que 50
    public boolean plus (double sueldoPlus)
    {
        boolean aumento = false;
        if (comision<50)
        {
            salario= salario + sueldoPlus;
            aumento = true;
        }
        return aumento;
    }
    
    //Constructor por defecto
    public Comercial()
    {
        this.comision=0;
    }
    
    //Constructor con 5 para metros
    public Comercial(String nombre, String apellido, int edad, double salario, double comision)
    {
    	super(nombre, apellido, edad, salario);
    	this.comision=comision;
    }
}