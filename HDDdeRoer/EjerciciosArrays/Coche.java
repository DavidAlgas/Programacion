package EjerciciosArrays;

public class Coche
{
	private String matricula;
    private String marca;
    private String modelo;
    private int Km;
    
	public String getMatricula()
	{
		return matricula;
	}
	
	public void setMatricula(String matricula)
	{
		this.matricula = matricula;
	}
	
	public String getMarca()
	{
		return marca;
	}
	
	public void setMarca(String marca)
	{
		this.marca = marca;
	}
	
	public String getModelo()
	{
		return modelo;
	}
	
	public void setModelo(String modelo)
	{
		this.modelo = modelo;
	}
	
	public int getKm() 
	{
		return Km;
	}
	
	public void setKm(int km) 
	{
		Km = km;
	}
	
	public void mostraDatos()
	{
		System.out.println(marca);
	}
	
	
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMatrícula: ");
        sb.append(matricula);
        sb.append("\nMarca: ");
        sb.append(marca);
        sb.append("\nModelo: ");
        sb.append(modelo);
        sb.append("\nKm: ");
        sb.append(Km);    
        return sb.toString();
    } 
}
