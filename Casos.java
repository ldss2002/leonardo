package Casos;
import java.util.Scanner;
public class Casos {

	public static void main(String[] args) {

    double operando1, operando2;
	String operador;
	double monthString = 0;
	Scanner dados = new Scanner (System.in);
	System.out.println("Qual o operando 1?");
	operando1 = dados.nextDouble();
	System.out.println("Qual o operando2?");
	operando2 = dados.nextDouble();
	System.out.println("Qual o operador? ");
	operador = dados.next();
	switch (operador)
	{
	case "*" : monthString = (operando1*operando2);
	case "+" : monthString = (operando1+operando2);
	case "-" : monthString= (operando1-operando2);
	case "/" : monthString = (operando1/operando2);
	}
	System.out.println(+monthString);
		
		
		
		
		
		
		
		
		
		
		
		

}

	private static void Switch(String operador) {
		// TODO Auto-generated method stub
		
	}}