import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao contador de números da sequência de Fibonacci");
        System.out.println("Digite um número:");
            int num = teclado.nextInt();
        int A = 0;
        int B = 1;
            System.out.println(A);   
            System.out.println(B);
            for(int cont=0; cont<num-2; cont++){
            int soma = A + B;
                System.out.println(soma);
            A=B; 
            B=soma; 
           }
            teclado.close();   
    }
}
