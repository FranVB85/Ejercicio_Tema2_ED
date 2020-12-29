package es.studium.Ejercicio_T2;

public class Cuenta
{

	/* Creamos los Atributos */
	private int numero;
	private int saldo;
	private Cliente cliente; // Aquí hemos creado un nuevo atributo "cliente" de tipo Cliente

	/* Creamos los Constructores por defecto */
	public Cuenta()
	{
		numero = 0;
		saldo = 0;
		cliente = new Cliente();
	}

	/* Creamos los Constructores pon parámetros */
	public Cuenta(int nc, int s, Cliente c)
	{
		numero = nc;
		saldo = s;
		cliente = c;
	}

	/*
	 * Mediante el menú/Source/Generate Getters and Setters... Creammos tales
	 * métodos
	 */
	public int getNumero()
	{
		return numero;
	}

	public void setNumero(int numero)
	{
		this.numero = numero;
	}

	public int getSaldo()
	{
		return saldo;
	}

	public void setSaldo(int saldo)
	{
		this.saldo = saldo;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		this.cliente = cliente;
	}

}
