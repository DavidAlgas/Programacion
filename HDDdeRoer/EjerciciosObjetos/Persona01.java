package EjerciciosObjetos;

public class Persona01
{
	//Constantes
	private final static String SEXO_DEF = "H";//Sexo por defecto
    public final int INFRAPESO = -1;//El peso de la persona esta por debajo del peso ideal
    public final int PESO_IDEAL = 0;//El peso de la persona esta en su peso ideal
    private final int SOBREPESO = 1;//El peso de la persona esta por encima del peso ideal
	
	//Atributos
	private String nombre;
	private int edad;
	private String DNI;
	private String sexo;
	private double peso;
	private double altura;
	
	//Getters y  Setters
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public String getDNI()
	{
		return DNI;
	}
	public void setDNI(String DNI)
	{
		this.DNI = DNI;
	}
	public String getSexo()
	{
		return sexo;
	}
	public void setSexo(String sexo)
	{
		this.sexo = sexo;
	}
	public double getPeso()
	{
		return peso;
	}
	public void setPeso(double peso)
	{
		this.peso = peso;
	}
	public double getAltura()
	{
		return altura;
	}
	public void setAltura(double altura)
	{
		this.altura = altura;
	}
    
	//Métodos privados
    private void comprobarSexo(String sexo)
    {
    	//Si el sexo no es una H o una M, por defecto es H
        if(sexo!="H" && sexo!="H")
        {
            this.sexo="H";
        }
        else
        {
            this.sexo=sexo;
        }
    }
 
    private void generarDni()
    {
        final int divisor=23;
 
        //Generamos un número de 8 digitos
        int numDNI = ((int)Math.floor(Math.random()*(100000000-10000000)+10000000));
        int res = numDNI-(numDNI/divisor*divisor);
 
        //Calculamos la letra del DNI
        char letraDNI = generaLetraDNI(res);
 
        //Pasamos el DNI a String
        DNI=Integer.toString(numDNI)+letraDNI;
    }
 
    private char generaLetraDNI(int res)
    {
        char letras[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                  'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                  'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        return letras[res];
    }
    
	//Metodos publicos
    public int calcularIMC()//Calcula el indice de masa corporal
    {
        //Calculamos el peso de la persona
        double pesoActual = peso/(Math.pow(altura, 2));
        
        //Segun el peso, devuelve un codigo
        if(pesoActual>=20 && pesoActual<=25)
        {
            return PESO_IDEAL;
        }
        else if(pesoActual<20)
        {
            return INFRAPESO;
        }
        else
        {
            return SOBREPESO;
        }
    }
	
	public boolean esMayorDeEdad()//Indica si la persona es mayor de edad
	{
       boolean mayor = false;
       if(edad>=18)
       {
           mayor=true;
       }
       return mayor;
   }
	
	public String toString()//Muestra la infomacion de los Objetos
	{
		String sexo="";
		
        if(this.sexo=="H")
        {
            sexo="hombre";
        }
        else
        {
            sexo="mujer";
        }
        return "Informacion de la persona:\n" +
                "Nombre: "+nombre+"\n" +
                "Sexo: "+sexo+"\n" +
                "Edad: "+edad+" años\n" +
                "DNI: "+DNI+"\n" +
                "Peso: "+peso+" kg\n" +
                "Altura: "+altura+" metros\n";
	}
	
	//Construcor por defecto
	public Persona01()
	{
		this("", 0, SEXO_DEF, 0, 0);
	}
	
	//Constructor con 3 parametros(nombre, edad y sexo) el resto por defecto
	public Persona01(String nombre, int edad, String sexo)
	{
        this(nombre, edad, sexo, 0, 0);
    }
	
    //Constructor con 5 parametros
    public Persona01(String nombre, int edad, String sexo, double peso, double altura){
        this.nombre=nombre;
        this.edad=edad;
        this.peso=peso;
        this.altura=altura;
        generarDni();
        comprobarSexo(sexo);
    }
}
