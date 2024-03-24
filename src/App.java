/*
CRIE UM ALGORITMO QUE CALCULE O VOLUME DE UMA CAIXA D'AGUA
VOLUME = ALTURA * LARGURA * COMPRIMENTO
*/
import java.util.Scanner;
public class App{
    public static void main(String []args){
        
    Scanner teclado = new Scanner(System.in);
    System.out.println("Para o cálculo de novas medidas, digite em metros os valores de:");
        System.out.println("Altura:");
            double alt=teclado.nextDouble();
        System.out.println("Largura:");
            double larg=teclado.nextDouble();
        System.out.println("Comprimento:");
            double compr=teclado.nextDouble();
            double vol= alt*larg*compr;
    System.out.println("O volume dessa caixa d'água com Alt="+alt+", Lar="+larg+", Comp="+compr+" é igual a "+vol+" m3");
    teclado.close();
    }
}