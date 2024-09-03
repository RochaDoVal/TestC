package test1;
import java.util.Scanner;

public class Fibon {
	public static boolean isFibo(int n){
			int a = 0, b = 1;
			while(a < n) {
				int test = a;
				a = b;
				b = test + a;
			}
			return a == n;
	}
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 String stop;
		 do {
			 System.out.println("Digite C para escolher um numero e S para parar");
			 stop = sc.next();
			 if(stop.equalsIgnoreCase("C")) {
				 System.out.println("Qual numero você deseja verificar se esta na sequencia de Fibonacci? ");
				 int n = sc.nextInt();
				 if(isFibo(n)) {
					 System.out.println("O numero " + n + " faz parte da sequencia." );
				 }
				 else {
					 System.out.println("O numero " + n + " não faz parte da sequencia." );
				 }
			 }
		 }
		 while(!stop.equalsIgnoreCase("S"));
			
		 
		 sc.close();
		 }

}


