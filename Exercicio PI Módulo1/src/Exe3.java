import java.util.Scanner;
public class Exe3 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        //variável com o tamanho do vetor
        int tamanho = 10;
        //instanciando vetor n que irá alocar os números
        int n[] = new int [tamanho];
        //indice dos vetores 
        int i=0;
        //variavel utilizada após escolha válida do menu
        int op=0;
        //varívael booleana para manter o menu ativo enquanto verdadeiro
        boolean menu = true;
        n[0]=7;
        n[2]=18;
        n[4]=7;
        n[6]=3;
        n[8]=1;
        while(menu){
            System.out.println("\n==================================");
            System.out.println("=      ===================       =");
            System.out.println(" ======  Teste Number V1  =====");
            System.out.println("=      ===================       =");
            System.out.println("==================================\n");
            System.out.println("[1] Registrar valores");
            System.out.println("[2] Listar todos os valores");
            System.out.println("[3] Sair");
            System.out.println("");
            op=teclado.nextInt();
            switch(op){
                case 1:{
                        for(i=0;i<tamanho;i++){
                            boolean perg=true;
                            while(perg){
                                if(n[i]==0){
                                    System.out.println("\nCadastre um valor: ");
                                    System.out.println("Registro Nº"+i);
                                    n[i]=teclado.nextInt();
                                    break;
                                    //estudar e aplicar o HasNext
                                }else if(n[i]!=0){
                                System.out.println("*Há valores cadastrados no Registro Nº"+i);
                                System.out.println("Valor atual >>"+n[i]+"<<");
                                System.out.println("Deseja substituir?[S/N]");
                                char resp = teclado.next().charAt(0);
                                    switch(resp){
                                        case 'S':{
                                            System.out.println("Substituir por: ");
                                            n[i]=teclado.nextInt();
                                            perg=false;
                                            break;
                                        }
                                        case 'N':{
                                            System.out.println("Certo. Próximo registro!");
                                            i=i;
                                            perg=false;
                                            break;
                                        }
                                        default:{
                                            System.out.println("Valor inválido!");
                                            System.out.println("Preencha corretamente\n");
                                            break;
                                        }
                                    }
                                }
                            }
                            System.out.println("_____________________");
                        }      
                break;
                }
                case 2:{
                    for(int a=0;a<tamanho;a++){
                        if(n[a]!=0){
                            System.out.println("\nRegistro Nº"+a);
                            System.out.println("Valor: "+n[a]);
                        }
                    }
                    break;
                }
                case 3:{
                    System.out.println("Finalizando sistema...");
                    menu=false;
                    break;
                }
                default:{
                    System.out.println("########################");
                    System.out.println(" >>> Valor inválido!<<<");
                    System.out.println("########################\n");
                    System.out.println("Deseja continuar na aplicação?[S/N]");
                        char resp = teclado.next().charAt(0);
                    switch(resp){
                        case 'S':{
                            menu=true;
                            break;
                        }
                        case 'N':{
                            System.out.println("Finalizando sistema...!");
                            menu=false;
                        }
                    }
                }
            }
        }
    }
}
