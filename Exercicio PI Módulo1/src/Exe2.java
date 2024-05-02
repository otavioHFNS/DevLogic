import java.util.Scanner;
public class Exe2 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int tamanho=15;
        double vetorA[] = new double[tamanho];
        double vetorB[] = new double[tamanho];
        int i=0;
        boolean op=true;
        while(op){
            System.out.println("\n==================================");
            System.out.println("=      ===================       =");
            System.out.println(" ======  Raiz Quadrada V1.  =====");
            System.out.println("=      ===================       =");
            System.out.println("==================================\n");
            System.out.println("[1] Calcular raízes");
            System.out.println("[2] Listar todos os valores");
            System.out.println("[3] Sair");
                int task = teclado.nextInt();
            switch(task){
                case 1:{
                    boolean task1=true;
                    while(task1){
                        System.out.println("Qual valor você deseja calcular sua raiz? ");
                            vetorA[i]=teclado.nextDouble();
                            vetorB[i]=Math.sqrt(vetorA[i]);
                        System.out.println("Registro Nº"+i);
                        System.out.println("A raiz de "+vetorA[i]+" é "+vetorB[i]);
                        i++;
                        boolean task2=true;
                        while(task2){
                            System.out.println("\nDeseja continuar calculando?[S/N]");
                                char res=teclado.next().charAt(0);
                                    switch(res){
                                        case 'S':{
                                            task1=true;
                                            task2=false;
                                            break;
                                        }
                                        case 'N':{
                                            task1=false;
                                            task2=false;
                                            break;
                                        }
                                        default:{
                                            System.out.print("Valor informado é inválido");
                                        break;
                                        }
                                    }
                        }
                    }
                    break;
                }
                case 2:{
                    int x = 0;
                    if (vetorA[x]!=0){
                        System.out.println("Listando todas as raízes calculadas!");
                        for(x=0;x<tamanho;x++){
                            if(vetorA[x]!=0){
                                System.out.println("\nRegistro Nº"+x);
                                System.out.println("A raiz de "+vetorA[x]+" é "+vetorB[x]);
                                System.out.println("____________________________________");
                            }
                        }
                        System.out.println("Estas foram os valores obtidos!");
                        System.out.println("Retornando ao menu princiapal...\n");
                    }
                    else if(vetorA[x]==0){
                        System.out.println("\nNão há valores para listar!");
                    }
                    break;
                }
                case 3:{
                    op=false;
                break;
                }
            }
        }
    }
}