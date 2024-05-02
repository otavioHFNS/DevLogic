import java.util.Scanner;
//Finalizar código com ajustes finos
public class Exe1 {
    public static void main (String[]args){
        //Instanciando Scanner
        Scanner teclado = new Scanner(System.in);
        //Criação dos vetore
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];
        //Indice do vetor
        int i=0;
        //Condição lógico do menu
        boolean op =true;
        while(op){
            System.out.println("\n===============================");
            System.out.println("=     ===================     =");
            System.out.println(" =====   Somatório V1.8  =====");
            System.out.println("=     ===================     =");
            System.out.println("===============================\n");
            System.out.println("[1] Calcular valores");
            System.out.println("[2] Listar todos os valores");
            System.out.println("[3] Sair");
            int task = teclado.nextInt();
            switch(task){
                case 1:{
                    boolean task1 =true;
                    while(task1){
                        System.out.print("\nDigite o primeiro valor: ");
                            vetorA[i] = teclado.nextInt();
                        System.out.print("Digite o segundo valor:");
                            vetorB[i]  = teclado.nextInt();
                        vetorC[i] = vetorA[i]+vetorB[i];
                        System.out.print("\nO resultado de "+vetorA[i]+"+"+vetorB[i]+" é "+vetorC[i]+".\n");
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
                    int a=0;
                    if(vetorC[a]!=0){
                        for(a=0;a<=9;a++){
                            System.out.println("Valor na posição "+(a+1)+"="+vetorC[a]);
                        }
                    }else{
                            System.out.println("\nNão há valores para listar!");
                            System.out.println("Deseja calcular novos valores?[S/N]");
                                char resp = teclado.next().charAt(0);
                            switch (resp){
                                case 'S':{
                                    task = 1;
                                }
                                case 'N':{
                                    System.out.println("Finalizando sistema...");
                                    op=false;
                                }
                            }
                    }
                    break;
                }
                case 3:{
                    op=false;
                }
                default:{
                    System.out.println("########################");
                    System.out.println(" >>> Valor inválido!<<<");
                    System.out.println("########################\n");
                    System.out.println("Deseja continuar na aplicação?[S/N]");
                        char resp = teclado.next().charAt(0);
                    switch(resp){
                        case 'S':{
                            op=true;
                            break;
                        }
                        case 'N':{
                            System.out.println("Finalizando sistema...!");
                            op=false;
                        }
                    }
                }
            }
        }
    }
}
