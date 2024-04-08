import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        System.out.println("Bem-vinda a tabuada automatica:");
        Scanner teclado = new Scanner(System.in);
        int cont = 1;
        
        while (cont != 0) {
            System.out.println("Digite qual tabuada de 1 a 10 voce deseja obter:");
            int num = teclado.nextInt();
            System.out.println("Ok! Tabuada do " + num);
            
            for (int cont1 = 0; cont1 <= 10; cont1++) {
                System.out.println(num + " x " + cont1 + " = " + (num * cont1));
            }
            
            System.out.println("Deseja calcular outra tabuada? [s/n]");
            String op = teclado.next();
            
            if (op.equalsIgnoreCase("s")) {
                cont = 1;
            } else {
                cont = 0;
                System.out.println("Tabuada finalizada!");
            }
        }
        teclado.close();
    }
}
