import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		
		double p, n, r,compoundinterest;
		double sum=0;
        Scanner scanner=new Scanner (System. in);
        System.out.println("Enter the principal:");
        p=scanner.nextDouble( );
        
        System. out. println("Enter the no of years:");
        n=scanner.nextDouble( );
        
        System. out. println("Enter the Rate of  interest");
        r=scanner.nextDouble( );
        
        //compoundinterest=p*Math.pow(1+r/100,n)-p;
        //compoundinterest = p* Math.pow(1+r,n);
        for(int i=1;i<=n;i++){
        	compoundinterest=p*Math.pow((1+r/n),n*r);
        	sum+=compoundinterest;
        	System.out.println(i+"year"+sum);

        }
        scanner.close();
       
        /*
        System.out. println(" Amount="+p );
        System. out. println("N o. of years="+n);
        System. out. println("Rate of interest="+r);
   	    System.out. println("Compound Interest="+compoundinterest);*/
	
	}

}
