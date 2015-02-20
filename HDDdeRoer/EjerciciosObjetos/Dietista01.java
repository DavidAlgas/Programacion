package EjerciciosObjetos;
import java.util.*;
public class Dietista01
{
	static Scanner leer;
	
    public static void main(String[] args)
    {
    	leer = new Scanner(System.in);
    	
    	//Introducimos los datos
    	System.out.print("Introduce el nombre: ");
    	String nombre = leer.next();
    	System.out.print("Introduce la edad: ");
    	int edad = leer.nextInt();
    	System.out.print("Introduce el sexo: ");
        String sexo = leer.next();
        System.out.print("Introduce el peso: ");
        double peso = leer.nextDouble();
        System.out.print("Introduce la altura: ");
        double altura = leer.nextDouble();
 
        //Creamos objetos con cada constructor
        Persona01 persona1 = new Persona01();
        Persona01 persona2 = new Persona01(nombre, edad, sexo);
        Persona01 persona3 = new Persona01(nombre, edad, sexo, peso, altura);
 
        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo("M");
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);
 
        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        MuestraInformacion(persona1);
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        MuestraInformacion(persona2);
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        MuestraInformacion(persona3);
    }
 
    public static void MuestraMensajePeso(Persona01 p)
    {
        int IMC = p.calcularIMC();
        
        if(IMC==p.PESO_IDEAL)
        {
            System.out.println("La persona esta en su peso ideal");
        }
        else if(IMC==p.INFRAPESO)
        {
            System.out.println("La persona esta por debajo de su peso ideal");
        }
        else
        {
            System.out.println("La persona esta por encima de su peso ideal");
        }
    }
 
    public static void MuestraMayorDeEdad(Persona01 p)
    {
        boolean mayor = p.esMayorDeEdad();
        
        if(mayor)
        {
            System.out.println("La persona es mayor de edad");
        }
        else
        {
            System.out.println("La persona no es mayor de edad");
        }
    }
 
    public static void MuestraInformacion(Persona01 p)
    {
    	//Invoca el metodo toString
        System.out.println(p);
    }
}