import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a nota do aluno da primeira AT: ");
          double nota1 = teclado.nextDouble();
        System.out.println("Qual a nota do aluno da segunda AT: ");
          double nota2 = teclado.nextDouble();
        System.out.println("Qual a nota do aluno do Trabalho: ");
          double nota3 = teclado.nextDouble();
          double media = (nota1+nota2+nota3)/3;
        System.out.println((media >= 7 && media<=10) ? "Parabéns,aluno aprovado, média igual a "+media:"Aluno reprovado, média igual a "+media);
        teclado.close();
    }
}
