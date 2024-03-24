import java.util.Scanner;

public class Patinho {
    public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número de patinhos: ");
            int n = teclado.nextInt();      
        for(int cont = n; cont>0; cont--){
            if(cont==1){
                System.out.println(cont+" Patinho foi passear");
            }else{
                System.out.println(cont+" Patinhos foram passear");
            }
            System.out.println("Além das montanhas");
            System.out.println("Para brincar");
            System.out.println("A mamãe gritou: Quá, quá, quá, quá, quá");
            if(cont==1){
                System.out.println("Mas nenhum patinho, voltou de lá\n");
            } else if(cont-1==1){
              System.out.println("Mas só "+(cont-1)+" patinho voltou de lá\n");
            }
            else{
                System.out.println("Mas só "+(cont-1)+" patinhos voltaram de lá\n");
            }
        }
    teclado.close();
    }
}
