package cl.inacap.pokemonsModel.dto;

public class Tipo {

	private int codigo;   // 1, 2, 3
	private String nombre; //Agua,Tierra,Fuego, etc
	private String icono;
	private String color;
	
	
	
	public Tipo(int codigo, String nombre, String icono, String color) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.icono = icono;
		this.color = color;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
