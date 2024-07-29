package Tienda;

public class Tienda {

	public Tienda() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Color color = new Color();
	color.setNombre("amarillo");
	
	TipoPintura tipoPintura = new TipoPintura();
	tipoPintura.setNombre("Agua");
	
	Pintura pintura = new Pintura ();
	pintura.setCodigo("00001");
	pintura.setColor(color);
	pintura.setTipoPintura(tipoPintura);
	
	Empleado juan = new Empleado();
	juan.setCodigo("001");
	juan.setNombre("Juan Perez");
	juan.despachar(pintura);
	
	
	}

}
