package AceleradoraYc;

public class NonProfit extends YC_Combinator{

	private int CrowdFounding;
	
	

	public int getCrowdFounding() {
		return CrowdFounding;
	}



	public void setCrowdFounding(int crowdFounding) {
		CrowdFounding = crowdFounding;
	}




	public NonProfit(String nombre, String direccion, String precioArriendo, int baseValuation, int netValuation, int CrowdFounding) {
		super(nombre,direccion,precioArriendo,baseValuation,netValuation);
			this.CrowdFounding=CrowdFounding;     
	
	}

	

	}
