package Tienda;

public class Pintura {

	public Pintura() {
		// TODO Auto-generated constructor stub
	}
	
	private String codigo;
	private Color color;
    private TipoPintura tipoPintura;
    
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public TipoPintura getTipoPintura() {
		return tipoPintura;
	}

	public void setTipoPintura(TipoPintura tipoPintura) {
		this.tipoPintura = tipoPintura;
	}


	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

}
