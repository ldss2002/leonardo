package multiplicaçãorussa;
import java.util.Scanner;
public class multiplicaçaorussa {

	public static void main(String[] args) {
		 int M, m, M1, m1, i = 0;
		 Scanner dados = new Scanner (System.in);
		 System.out.print("Qual é o multiplicador?");
		 m = dados.nextInt();
		 System.out.print("Qual o multiplicando?");
		 M = dados.nextInt();
		 while (m>1) {
			 m=m/2;
			M=M*2;
			 System.out.println("Multiplicando: "+M);	
			 if (M%2!=0)
				 i=i+M;
		 }	
		 System.out.print(i);
	}

}
