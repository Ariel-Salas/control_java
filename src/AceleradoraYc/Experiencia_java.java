package AceleradoraYc;


import java.util.ArrayList;

import java.util.Scanner;



public class Experiencia_java {
	
	
	
	public static Scanner teclado = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarar las variables, incluyendo la opcion
		
	
		String nombre="";
		String direccion="";
		String precioArriendo="";
		
		int baseValuation=0;
		int netValuation=0;
		int BurnRate=0;
		int Impact=0;
		int CrowdFounding=0;
		int opcion=0;
		int inversion=0;
			
		ArrayList<Risky> listaRisky = new ArrayList<Risky>();
		ArrayList<Esg> listaEsg = new ArrayList<Esg>();
		ArrayList<NonProfit> listaNonProfit = new ArrayList<NonProfit>();
	 		
		System.out.println("**Bienvenido a la aceleradora de starup YC** \n ");
		
		do {
		
		System.out.println("ingrese el numero de su opcion \n 1. Startups tipo risk \n 2. Startups tipo Esg \n 3. Startups tipo NonProfit \n 4. Simulacion mix paquete \n 5. Listar todas las Startups  \n 6. Salir ");
		opcion=Integer.parseInt(teclado.nextLine());
		switch(opcion) {
		
		case 1: System.out.println("*Startups tipo risk*");
		
		  System.out.println("Ingresar el nombre de la Startups tipo risk");
		  nombre=teclado.nextLine();
		  System.out.println("Ingrese la direccion  ");
		  direccion=teclado.nextLine();
		 
		  System.out.println("Ingrese el valor baseValuation");
		  baseValuation= Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Ingrese el valor netValuation");
		  netValuation= Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Ingrese el valor BurnRate");
		  BurnRate= Integer.parseInt(teclado.nextLine());
		  
		//Se crea el objeto 
		Risky Risky = new Risky (nombre,direccion,precioArriendo,baseValuation,netValuation,BurnRate);        
		listaRisky.add(Risky);                                                                   
		
		
		break;
		
		
		case 2: System.out.println("*Startups tipo Esg*");
		
		  System.out.println("Ingresar el nombre de la Startups tipo Esg");
		  nombre=teclado.nextLine();
		  System.out.println("Ingrese la direccion  ");
		  direccion=teclado.nextLine();;
		 
		  System.out.println("Ingrese el valor baseValuation");
		  baseValuation= Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Ingrese el valor netValuation");
		  netValuation= Integer.parseInt(teclado.nextLine());
		  
		  do {
		  	  System.out.println("Ingrese el valor Impact debe estar entre 1 y 10 ");
		  	  Impact= Integer.parseInt(teclado.nextLine());
		       }while (Impact < 1  || Impact > 10);
				
				
				
		    //Se crea el objeto 
		    Esg Esg = new Esg (nombre,direccion,precioArriendo,baseValuation,netValuation,Impact);        
			listaEsg.add(Esg);	
		
		
	    	  break;
		

		case 3: System.out.println("*Startups tipo NonProfit*");
		
		  System.out.println("Ingresar el nombre de la Startups tipo Startups tipo NonProfit");
		  nombre=teclado.nextLine();
		  System.out.println("Ingrese la direccion  ");
		  direccion=teclado.nextLine();;
		 
		  System.out.println("Ingrese el valor baseValuation");
		  baseValuation= Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Ingrese el valor netValuation");
		  netValuation= Integer.parseInt(teclado.nextLine());
		  
		  System.out.println("Ingrese el valor CrowdFoundingt");
		  BurnRate= Integer.parseInt(teclado.nextLine());
				
		    //Se crea el objeto 
		    NonProfit NonProfit= new NonProfit (nombre,direccion,precioArriendo,baseValuation,netValuation,CrowdFounding);        
			listaNonProfit.add(NonProfit);	
			
	              
	    	     break;
	    	     
		case 4: System.out.println("*Simulacion mix paquete por cada starup*");
		        System.out.println("*Ingrese el nombre del inversionista*");
		        nombre=teclado.nextLine();
		        System.out.println("*Ingrese el monto total de la inversion ");
		        inversion= Integer.parseInt(teclado.nextLine());
		        System.out.println("*Su monto es " +inversion );
		        System.out.println("*Las starup disponibles son:*");
			
		for(Risky aux1: listaRisky) {
	    	 
   	       
		   int suma=  aux1.getBaseValuation()  +   aux1.getNetValuation()+ aux1.getBurnRate();
		   System.out.println("El total del paquete de risky es  " + suma  );
	    
	     
	     }
	    
	     for(Esg aux2: listaEsg) {
	    	 
	   	       
			   int suma=  aux2.getBaseValuation()  +   aux2.getNetValuation()+ aux2.getImpact();
			   System.out.println("El total del paquete de Esg es  " + suma  );
	     
		     }
	     
	     for(NonProfit aux3: listaNonProfit) {
	    	 
	   	       
			   int suma=  aux3.getBaseValuation()  +   aux3.getNetValuation()+ aux3.getCrowdFounding();
			   System.out.println("El total del paquete de NonProfit es  " + suma  );
	     
		     }    
	     
	     break;
     
	     
		
		
		
		
		
		
		case 5: System.out.println("*LISTAR TODAS LAS STARUP*");
 	              for(Risky aux1: listaRisky) {
 	    	 
	    	  System.out.println("El nombre de la starup risky es " + aux1.getNombre() + ", su baseValuation es " + "  " + aux1.getBaseValuation() + ", su  netValuation es  " + aux1.getNetValuation() + " , su BurnRate " + aux1.getBurnRate() + " ");
 	              }       
 	             for(Esg aux2: listaEsg) {
 	  	    	  System.out.println("El nombre de la starup Esg es " + aux2.getNombre() + ", su baseValuation es " + "  " + aux2.getBaseValuation() + ", su  netValuation es  " + aux2.getNetValuation() + " , su Impact " + aux2.getImpact() + " ");
 	             }
 	  	    	  
 	  	    	for(NonProfit aux3: listaNonProfit) {
 	   	    	 
 	 	    	  System.out.println("El nombre de la starup NonProfit es " + aux3.getNombre() + ", su baseValuation es " + "  " + aux3.getBaseValuation() + ", su  netValuation es  " + aux3.getNetValuation() + " , su CrowdFounding " + aux3.getCrowdFounding() + " active users");
	  
 	             }    
           break;
		
		case 6: System.out.println("SALIENDO...");
	      break; 
	     default: System.out.println("Opcion no valida");
		   
		  }
	
	   }while(opcion != 6); 
		
  }				
}
