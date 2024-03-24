import java.util.Scanner;

public class DiaSemana {
    public static void main (String [] args){
    
    Scanner teclado = new Scanner(System.in);        
     System.out.println("Digite o dia da semana: ");
     System.out.println("[1]");
     System.out.println("[2]");
     System.out.println("[3]");
     System.out.println("[4]");
     System.out.println("[5]");
     System.out.println("[6]");
     System.out.println("[7]");
       int num = teclado.nextInt();
       if(num >=1 && num<=5){
           System.out.println("Dia "+num+" é um dia útil!");
       }else if(num==6){
           System.out.println("Dia "+num+" é Sábado");
       }else if(num==7) {
       System.out.println("Dia "+num+" é Domingo");
       }else {
       System.out.println("Dia escolhido é inválido!");
       }
       teclado.close();
  }
}