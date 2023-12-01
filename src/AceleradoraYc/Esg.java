package AceleradoraYc;



public class Esg extends YC_Combinator {

	
private int Impact;
	

	public int getImpact() {
	return Impact;
}



public void setImpact(int impact) {
	Impact = impact;
}



	public Esg(String nombre, String direccion, String precioArriendo, int baseValuation, int netValuation, int Impact) {
		super(nombre,direccion,precioArriendo,baseValuation,netValuation);
			this.Impact=Impact;     //si los atributos son solo de esta clase, deben colocarse como sigue...this.carga=carga
	
	}

	

	}