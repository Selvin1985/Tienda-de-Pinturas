package Tienda;

public class Empleado {

	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	private String codigo;
	private String nombre;
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void despachar(Pintura pintura) {
		System.out.println("Se despachó la pintura " + pintura.getCodigo() + " del color " + pintura.getColor().getNombre() + " de tipo " + pintura.getTipoPintura().getNombre());
    }
}
