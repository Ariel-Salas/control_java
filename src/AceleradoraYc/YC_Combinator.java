package AceleradoraYc;

public class YC_Combinator {

	private String nombre;
	private String direccion;
	private String precioArriendo;
	private int baseValuation;
	private int netValuation;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPrecioArriendo() {
		return precioArriendo;
	}

	public void setPrecioArriendo(String precioArriendo) {
		this.precioArriendo = precioArriendo;
	}

	public int getBaseValuation() {
		return baseValuation;
	}

	public void setBaseValuation(int baseValuation) {
		this.baseValuation = baseValuation;
	}

	public int getNetValuation() {
		return netValuation;
	}

	public void setNetValuation(int netValuation) {
		this.netValuation = netValuation;
	}

	

	public YC_Combinator(String nombre,String direccion,String precioArriendo, int baseValuation,int netValuation ) {
		this.nombre=nombre;
		this.direccion=direccion;
		this.precioArriendo=precioArriendo;
		this.baseValuation=baseValuation;
		this.netValuation=netValuation;
	//	this.setCapacidad(capacidad);
	//this.capacidad=capacidad;
			
	}
	
	   
}
