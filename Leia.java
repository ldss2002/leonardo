package pacote1;
import java.io.*;
public class Leia {

	public static void main(String[] args) throws IOException
		{String C = "";
		System.out.println("Digite um n�");
		InputStreamReader LerS = new InputStreamReader (System.in);
		BufferedReader GuardaS = new BufferedReader (LerS);
		C = GuardaS.readLine();
		System.out.printf("Digitou: %d", Integer.valueOf(C));}}