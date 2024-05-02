/*Enunciado do professor:
ADAPTE O CODIGO EM JAVA DO BANCO (SAQUE, DEPOSITO E SALDO) E CRIE UTILIZANDO VETORES, UMA ESTRUTURA QUE ARMAZENARÁ 5 INFOMAÇÕES.
CADASTRO DE 5 CLIENTES,ULTIMOS 5 DEPOSITOS,ULTIMOS 5 SAQUES,CRIAR UM EXTRATO COM DESCRIÇÃO DE TODA MOVIMENTAÇÃO E O SALDO ATUAL
 */
//O código foi elaborado em programação estruturada devido a proposta em sala de aula
import java.util.Scanner;
public class BancoArrays {
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        int tamanho=5;
        int i=0;
        //vetores para login
        String cpf[] = new String[tamanho];
        String senha[] = new String[tamanho];
        String nome [] = new String[tamanho];
        nome[0] = "Otavio"; senha[0]="1004"; cpf[0]="985.412.35.-04";
        //limite de movimentações por dia
        int tamanho1=50;
        //menu para movimentações financeiras
        double saldo[]= new double[tamanho1];
        double deposito[]= new double[tamanho1];
        double saque[]= new double[tamanho1];
        //vetores contadores do deposito e saque
        double dep[] = new double[tamanho1];
        double saq[] = new double[tamanho1];
        //indice para os contadores
        int contDep =0;
        int contSaq=0;
        //variável task para as perguntas de SIM ou NÃO
        char task;
        int op;
        //Valor booleano para o primeiro menu de operações do cliente
        boolean opcao1=true;
        while(opcao1){
            System.out.println("Bem vindo ao Banco Century ");
            System.out.println("\n[1] Cadastrar Cliente");
            System.out.println("[2] Listar Todos os Cadastros");
            System.out.println("[3] Realizar acesso");
            System.out.println("[4] Sair");
            //Só aceita valores entre 1 a 4, e com isso cada função será executada
                op = teclado.nextInt();
                if(op<=4 && op!=0){
                    switch (op){
                        case 1:{
                            if(i<tamanho){
                            boolean escolha1=true;
                                while(escolha1){
                                    if(nome[i]==null){
                                        System.out.println("\n");
                                        System.out.println("[1] Cadastrar");
                                        System.out.println("# Registro "+i);
                                        System.out.print("\nDigite o nome do cliente: ");
                                            nome[i] = teclado.next();
                                        System.out.print("Digite o CPF: ");
                                            cpf[i] = teclado.next();
                                        System.out.print("Senha: ");
                                            senha[i] = teclado.next();
                                        System.out.println("\nCadastrado Realizado com Sucesso!!");
                                        System.out.println("Bem Vindo "+nome[i]+", seu código de acesso é o Nº "+i+".\n");
                                        i++;
                                        System.out.println("Retornando ao menu principal...");
                                        escolha1=false;
                                        //
                                    }else if(nome[i]!=null){
                                        System.out.println("");
                                        i++;
                                    }
                                    System.out.println("********************************\n");
                                }
                            }else{
                                System.out.println("Limite de clientes cadastrados atingido!");
                                System.out.println("Por favor, entre em contato com o SAC para alteração de cadastros!");
                                System.out.println("0800 402 8922\n");
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("[2] Listar\n");
                            //Variável local X para auxilar na contagem dos vetores
                            int x=0;
                            if(nome[x]!=null){
                                for (x=0; x < tamanho; x++) {
                                    if(nome[x]!=null){
                                    System.out.println("Cliente Nº"+x);
                                    System.out.println("Nome: "+nome[x]+" - CPF: "+cpf[x]);
                                    System.out.println("Seu código de acesso é "+x+".");
                                    System.out.println("\n###############################\n");
                                    }
                                }
                            }else{
                                System.out.println("Sem registro");   
                                }
                        break;
                        }
                        case 3:{
                            //variável local ATX para auxiliar na contagem dos vetores
                            int atx=0;
                            if(nome[atx]==null){
                                System.out.println("Verifique se há cadastro!");
                                break;
                            }else if(nome[atx]!=null){
                                System.out.println("[3] Realizar acesso");
                                System.out.println("Digite seu código de acesso:");
                            //O código de acesso informado vai ser a referência para as movimentações do financeiro
                            int k = teclado.nextInt();
                            boolean opcao2=true;
                            boolean acessoLogin=true;
                            do{
                                if(k<tamanho&&nome[k]!=null){
                                    System.out.println("\nConfirme seu login e senha");
                                    System.out.print("Nome:");
                                        String testeNome=teclado.next();
                                            //Se nome correto, vai pedir senha,senão, mensagem de erro
                                            if(nome[k]!=null && nome[k].equals(testeNome)){
                                                System.out.print("Senha:");
                                                String testeSenha = teclado.next();
                                                    //Se senha correa, mensagem de sucesso,senão, mensagem de erro
                                                    if(senha[k]!=null && senha[k].equals(testeSenha)){
                                                        System.out.println("Login realizado com sucesso");
                                                        acessoLogin=false;
                                                    }else{
                                                        System.out.println("\n*** Senha incorreta! ***");
                                                    }
                                            }else{
                                                System.out.println("\n*** Nome incorreto! ***");
                                            }
                                }else{
                                    System.out.println("Codigo não cadastrado!");
                                    k = teclado.nextInt();
                                }
                            }while(acessoLogin);
                            //variável para o menu de operações financeira, de 1 a 5
                            char opcao = '0';
                            //Só aceita valores entre 1 a 4, e enquanto OPCAO for verdadeiro
                            //Se inserir valor 5, vai retornar ao menu anterior
                            //Se inserir outro valor diferente vamos exibir mensagem do DEFAULT
                            while(opcao!='5'||opcao2){
                                System.out.println("Olá "+nome[k]);
                                displayMenu();
                                opcao = teclado.next().charAt(0);
                                switch(opcao){
                                    case '1':{
                                        System.out.println("##Saldo - "+nome[k]);
                                        System.out.println("O Saldo em sua conta é de R$ "+saldo[k]);
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
                                        }
                                    case '2':{
                                        System.out.println("## Saque - "+nome[k]);
                                        System.out.println("### Saque ###\n");
                                        System.out.println("Digite o valor em R$ para saque: ");
                                        System.out.print("R$ ");
                                        saque[k] = teclado.nextDouble();
                                        if(saque[k]>saldo[k]){
                                            System.out.println("Saldo insuficiente! Deseja realizar um depósito?[S/N?]");
                                            task = teclado.next().charAt(0);
                                                if(task=='n'||task=='N'){
                                                    System.out.println("Finalizando Sistema... Até logo!");
                                                    opcao2=false;
                                                }else if(task=='s'||task=='S'){
                                                    opcao='3';
                                                }
                                        }else if(saque[k]<=0){
                                        valorInvalido();
                                        }else{
                                       //Aqui para cada saque no vetor, haverá um registro no vetor saq[] e o contador contSaq avançará
                                            saldo[k] = saldo[k]-saque[k];
                                            System.out.println("Saque de R$ "+saque[k]+" realizado com sucesso. Novo saldo de R$ "+saldo[k]);
                                            saq[contSaq]=saque[k];
                                            contSaq++;
                                        }
                                        break;
                                    }
                                    case '3':{
                                        boolean condDepos = true;
                                        do{
                                            System.out.println("## Depósito - "+nome[k]);
                                            System.out.println("Digite o valor em R$ para deposito: ");
                                            System.out.print("R$ ");
                                            deposito[k] = teclado.nextDouble();
                                            if(deposito[k]<=0){
                                                valorInvalido();
                                            }else{
                                                boolean opcao3=true;
                                                do{
                                                saldo[k] = saldo[k]+deposito[k];
                                                System.out.println("");
                                                System.out.println("Novo saldo de R$ " + saldo[k]);
                                        //Aqui para cada depósito no vetor, haverá um registro no vetor dep[] e o contador contDep avançará
                                                dep[contDep]=deposito[k];
                                                contDep++;
                                                System.out.println("Deseja realizar outra operação?[S/N?]");
                                                    task = teclado.next().charAt(0);
                                                if(task=='s'||task=='S'){
                                                    condDepos=true;
                                                    opcao3=false;
                                                }else if(task=='n'||task=='N'){
                                                    System.out.println("Retornando ao menu.");
                                                    condDepos=false;
                                                    opcao3=false;
                                                }else{
                                                    valorInvalido();
                                                }
                                                }while(opcao3);
                                            }
                                        }while(condDepos);
                                        break;
                                    }
                                    case '4':{
                                        System.out.println("Movimentações Gerais - "+nome[k]);
                                        System.out.println("\n###Depósitos realizados:");
                                        //verificar valores
                                        for(int j=0;j<contDep;j++){
                                            if(dep[j]!=0){
                                            System.out.println((j+1)+"º = R$"+dep[j]);
                                            }
                                        }
                                        System.out.println("\n###Saques realizados:");
                                        for(int j=0;j<contSaq;j++){
                                            if(saq[j]!=0){
                                            System.out.println((j+1)+"º = R$"+saq[j]);
                                            }
                                        }
                                        System.out.println("\n###Saldo R$ "+saldo[k]);
                                        break;
                                    }
                                    case '5':{
                                    System.out.println("Retornando à area de Clientes");
                                    opcao='5';
                                    opcao2=false;
                                    opcao1=true;
                                    break;
                                    }
                                    default:{
                                    valorInvalido();
                                    }
                                }
                            }
                            break;
                        }
                        break;
                        }
                        case 4:{
                            System.out.println("Finalizando Sistema... Até logo!!");
                            opcao1=false;
                            break;
                        }
                        default:{
                            System.out.println("Verifique o valor inserido!\n");
                        }
                    }
                }
        }
    }
    private static void valorInvalido(){
        char task;
        Scanner teclado = new Scanner(System.in);
                do{
                    System.out.println("Valor informado é inválido. Deseja finalizar o atendimento?[S/N]");
                          task = teclado.next().charAt(0);
                    if(task=='s'||task=='S'){
                        System.out.println("Finalizando Sistema... Até logo!");
                         System.exit(0);
                    }else if(task=='n'||task=='N'){
                    }
                }while(task!='n'&&task!='N'&&task!='s'&&task!='S');
    }
    private static void displayMenu(){
        System.out.println("\n### Menu principal ###\n");
        System.out.println("[1] Saldo");
        System.out.println("[2] Saque");
        System.out.println("[3] Depósito");
        System.out.println("[4] Extrato");
        System.out.println("[5] Sair\n");
        System.out.println("");
    }
}
