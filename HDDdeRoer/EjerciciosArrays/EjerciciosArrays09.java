package EjerciciosArrays;
import java.util.*;
//Expicacion Abajo
public class EjerciciosArrays09
{
	private Scanner leer;
	private ArrayList<Coche> coches = new ArrayList<Coche>();
	
	public static void main(String[] args)
	{
		System.out.println("  -- EjerciciosArrays09 --");
		EjerciciosArrays09 eja = new EjerciciosArrays09();
		eja.CargarCoches();
		eja.mostrarTodosCoches();
	}

	private void CargarCoches()
	{
		leer = new Scanner(System.in);
		//Declaración de variables para leer los datos de los coches
        String matricula, marca, modelo;
        int Km, numeroCoches;
        //Variable auxiliar que contendrá la referencia a cada coche nuevo.
        Coche aux;
        //se pide por teclado el número de coches a leer
        do
        {
            System.out.print("Número de coches?: ");
            numeroCoches = leer.nextInt();
        }while(numeroCoches<0);
        
        
        for (int i = 1; i<=numeroCoches; i++)//lectura de N coches
        {
            //leer datos de cada coche
            System.out.println("Coche "+i);
            System.out.print("Matrícula: ");
            matricula = leer.next();          
            System.out.print("Marca: ");
            marca = leer.next();
            System.out.print("Modelo: ");
            modelo = leer.next();
            System.out.print("Nº Km: ");
            Km = leer.nextInt();
            
            aux = new Coche();      //Se crea un objeto Coche y se asigna su referencia a aux
                                    
            aux.setMatricula(matricula);  //se asignan valores a los atributos del nuevo objeto
            aux.setMarca(marca);
            aux.setModelo(modelo);
            aux.setKm(Km);
                      
           //se añade el objeto al final del array
            coches.add(aux);
        }
	}
	
	public void mostrarTodosCoches()
	{
		for(int a=0; a<coches.size(); a++)
		{
			System.out.println(coches.get(a));
		}
	}
}
/*Crear un ArrayList de Objetos de tipo Coche. Pedir por teclado los datos de los coches y los guarda en el array.
A continuación utilizará el ArrayList para mostrar por pantalla lo siguiente:
	- Todos los coches introducidos.
	
	Primero creamos la clase Coche
*/