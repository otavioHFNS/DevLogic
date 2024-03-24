import java.util.Scanner;

public class PosiNeg {
    public static void main (String[]args){
    
     Scanner teclado = new Scanner(System.in);        
     System.out.print("Digite um número: ");
       int num = teclado.nextInt();
       if(num>0){
           System.out.println("O número inserido é positivo.");
       }else if(num==0){
           System.out.println("O número inserido é nulo!");
       }else {
       System.out.print("O número inserido é negativo!");
       }  
       teclado.close();  
    }
}
