package fatorial;
import java.util.Scanner;
public class fatorial1 {
    public static void main(String[] args)throws Exception 
    {int n,fat=1;
    Scanner LerS= new Scanner(System.in);
    System.out.print("Digite um inteiro positivo inferior a 32:");
    n=LerS.nextInt();
    for(int M=n;M>=1;M--)
        fat*=M;
    System.out.printf("%d!=%d",n, fat);
        
   
    }
    
}
