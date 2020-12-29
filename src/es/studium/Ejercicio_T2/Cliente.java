package es.studium.Ejercicio_T2;

public class Cliente
{

	/* Creamos los Atributos */
	private String dni;
	private String nombre;
	private String direccion;

	/* Creamos los Constructores por defecto */
	public Cliente()
	{
		dni = "";
		nombre = "";
		direccion = "";
	}

	/* Creamos los Constructores pon parámetros */
	public Cliente(String i, String n, String d)
	{
		dni = i;
		nombre = n;
		direccion = d;
	}

	/*
	 * Mediante el menú/Source/Generate Getters and Setters... Creammos tales
	 * métodos
	 */
	public String getDni()
	{
		return dni;
	}

	public void setDni(String dni)
	{
		this.dni = dni;
	}

	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String getDireccion()
	{
		return direccion;
	}

	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}

}