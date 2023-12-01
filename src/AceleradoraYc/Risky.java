package AceleradoraYc;



public class Risky extends YC_Combinator {

	//private String carga;
	
	private int BurnRate;
	
	
	
	
	
	
	
	public int getBurnRate() {
		return BurnRate;
	}







	public void setBurnRate(int burnRate) {
		BurnRate = burnRate;
	}



	public Risky(String nombre, String direccion, String precioArriendo, int baseValuation, int netValuation, int BurnRate) {
		super(nombre,direccion,precioArriendo,baseValuation,netValuation);
			this.BurnRate=BurnRate;     //si los atributos son solo de esta clase, deben colocarse como sigue...this.carga=carga
	
	}



	
		

	}

