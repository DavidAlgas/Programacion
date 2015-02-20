package Ejerciciosficheros;
import java.io.*;

public class Coche implements Serializable
{
	private static final long serialVersionUID = 7695874286508524707L;
	
	//ATRIBUTOS
	private String matricula;
	private String marca;
	private String modelo;
	
	//METODOS PUBLICOS
	public String getMatricula()
	{
		return matricula;
	}
	public void setMatricula(String matricula)
	{
		this.matricula=matricula;
	}
	public String getMarca()
	{
		return marca;
	}
	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	public String getModelo()
	{
		return modelo;
	}
	public void setModelo(String modelo)
	{
		this.modelo=modelo;
	}
	
	//CONSTRUCTORES	
	public Coche(String matricula, String marca, double tamañoDeposito, String modelo)
	{
		this.matricula=matricula;
		this.marca=marca;
		this.modelo=modelo;
	}
}