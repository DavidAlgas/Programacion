package Ejerciciosficheros;
import java.io.*;
import java.util.*;

public class EjerFic03
{
	static Scanner leer;
	static Coche coches[];
	
	public static void main(String[] args)
	{
		leer = new Scanner(System.in);
		
		System.out.print("Cantidad de coches: ");
		int tamaño = leer.nextInt();
		coches = new Coche[tamaño];
		
		for(int a=0; a<coches.length; a++)
		{
			System.out.println("Coche "+(a+1));
			System.out.print("Matricula: ");
			String matricula = leer.next();
			System.out.print("Marca: ");
			String marca = leer.next();
			System.out.print("tamañoDeposito: ");
			double tamañoDeposito = leer.nextDouble();
			System.out.print("Modelo: ");
			String modelo = leer.next();
			coches[a]= new Coche(matricula, marca,tamañoDeposito, modelo);
			
			System.out.println(" ");
			
		}
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\EjercicioSerializacion.ddr"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\EjercicioSerializacion.ddr"));)
		{
			escribirFichero(oos);
			leerfichero(ois);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Falla aqui: "+e);
		}
		catch(EOFException e){}
		catch(IOException e)
		{
			System.out.println("Error E/S: "+e);
		}
	}
	
	public static void escribirFichero(ObjectOutputStream oos)throws IOException
	{
		for(int a=0; a<coches.length; a++)
		{
			oos.writeObject(coches[a]);
		}
	}
	
	public static void leerfichero(ObjectInputStream ois)throws IOException, ClassNotFoundException
	{
		int contador=1;
		while(true)
		{
			Coche aux = (Coche)ois.readObject();
			System.out.println("Coche "+contador);
			System.out.println("Matricula: "+aux.getMatricula());
			System.out.println("Marca:  "+aux.getMarca());
			System.out.println("Modelo "+aux.getModelo());
		}
	}

}
