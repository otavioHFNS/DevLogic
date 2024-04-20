import java.util.Scanner;
public class BancoSwitch {
    public static void main (String []args){
        double saldo=0, saque;
        char task;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Bem vindo ao Banco Century");
    char opcao = '0';
        while(opcao!='4'){
            displayMenu();
            opcao = teclado.next().charAt(0);
            switch(opcao){
                case '1':
                System.out.println("O Saldo em sua conta é de R$ "+saldo);
                System.out.println("");
                System.out.println("Deseja realizar outra operação?[S/N?]");
                task = teclado.next().charAt(0);
                    if(task=='s'||task=='S'){
                            opcao = '0';
                        }else if(task=='n'||task=='N'){
                        System.out.println("Finalizando Sistema... Até logo!");
                        System.exit(0);
                    }else{
                        valorInvalido();
                        }
                    break;
                case '2':
                System.out.println("Digite o valor em R$ para saque: ");
                System.out.print("R$ ");
                    saque = teclado.nextDouble();
                    if(saque>saldo){
                        System.out.println("Saldo insuficiente! Deseja realizar"
                                    + " um depósito?[S/N?]");
                        task = teclado.next().charAt(0);
                            if(task=='n'||task=='N'){
                                System.out.println("Finalizando Sistema... Até logo!");
                                opcao = '4';
                            }else if(task=='s'||task=='S'){
                                opcao='1';
                            }
                    }else if(saque<=0){
                    valorInvalido();
                    }else{
                        double NewSaldo = saldo-saque;
                        System.out.println("Saque de R$ "+saque+" realizado com "
                                + " sucesso. Novo saldo de R$ "+NewSaldo);
                    }
                    break;
                case '3':
                System.out.println("Digite o valor em R$ para deposito: ");
                System.out.print("R$ ");
                    double deposito = teclado.nextDouble();
                    if(deposito<=0){
                    valorInvalido();
                    }else{
                        saldo = saldo+deposito;
                        System.out.println("");
                        System.out.println("Novo saldo de R$ " + saldo);
                        System.out.println("Deseja realizar outra operação?[S/N?]");
                            task = teclado.next().charAt(0);
                        if(task=='s'||task=='S'){
                            opcao = '0';
                        }else if(task=='n'||task=='N'){
                            System.out.println("Finalizando Sistema... Até logo!");
                                System.exit(0);
                        }else{
                            valorInvalido();
                        }
                    }
                    break;
                case '4':
                System.out.println("Finalizando Sistema... Até logo!");
                opcao='4';
                break;
                default:
                valorInvalido();
                teclado.close();
            }
        }
    }
    private static void valorInvalido(){
        char task,opcao;
        Scanner teclado = new Scanner(System.in);
                do{
                    System.out.println("Valor informado é inválido. Deseja finalizar"
                            + " o atendimento?[S/N?]");
                          task = teclado.next().charAt(0);
                    if(task=='s'||task=='S'){
                        System.out.println("Finalizando Sistema... Até logo!");
                         System.exit(0);
                    }else if(task=='n'||task=='N'){
                        System.exit(0);
                    }
                }while(task!='n'&&task!='N'&&task!='s'&&task!='S');
    }
    private static void displayMenu(){
        System.out.println("");
        System.out.println("### Menu principal ###");
        System.out.println("");
        System.out.println("[1] Extrato");
        System.out.println("[2] Saque");
        System.out.println("[3] Depósito");
        System.out.println("[4] Sair");
        System.out.println("");
    }        
  }
