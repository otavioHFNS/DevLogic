
import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("[ M ] / [ F ] ? ");
          char sexo = teclado.next().charAt(0);
        System.out.print("Escreva aqui o seu nome: ");
          String nome = teclado.next();
        System.out.print("Obrigado "+nome+", agora digite sua altura e utilize o ponto para decimais, por exemplo 1.58: ");
          double altura = teclado.nextDouble();
        double pesoM= (72.7 * altura) - 58;
        double pesoF=(62.1 * altura) - 44.7;
        System.out.println((sexo == 'm' || sexo == 'M') ? nome+ " seu peso ideal é de "+pesoM+" Kg." : nome+"seu peso ideal é de "+pesoF);
        teclado.close();
    }
}
