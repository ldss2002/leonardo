package multiplica��orussa;
import java.util.Scanner;
public class multiplica�aorussa {

	private static Scanner lerS;

	public static void main(String[] args)throws Exception
		{int X, X1, Y, Y1, T;
		lerS = new Scanner(System.in);
		System.out.print("O multiplicando �:");
		X=lerS.nextInt();
		System.out.print(" O multiplicador �:");
		Y=lerS.nextInt();
		X1=X; Y1=Y; T=0;
		while (X1>=1)
		{if (X1%2!=0)
			T=T+Y1;
		X1=(X1/2);
		Y1=Y1*2;}
		System.out.printf("%d x %d= %d", X,Y,T);}
		
		
	

	}


