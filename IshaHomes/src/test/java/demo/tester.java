package demo;

public class tester {

	public static void main(String[] args) {
 double principal =5000000 ;      
		    
	        double rate =9.5 ;
  
	        double time =20 ;
	        
	        rate=rate/(12*100); 

	        time=time*12; 
	            
	        double emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
	        double totalAmount=time*emi;
	        double Totalinterset=totalAmount-principal;
	        System.out.println(" Total AMount="+Math.round(totalAmount)+"\n"+" Total interest="+Math.round(Totalinterset));
	        System.out.println(" EMI is= "+Math.round(emi));
		                 

	}

}
