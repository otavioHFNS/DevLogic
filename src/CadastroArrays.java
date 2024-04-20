import java.util.Scanner;
import java.util.regex.Pattern;
//Verificar e Otimizar com om a formatação de CPF e Celular
public class CadastroArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean escolha = true;
        int tamanho = 10;
        int i = 0;
        int op = 0;
        //Criação e alocação de memória para os vetores
        String nome[] = new String[tamanho];
        String telefone[] = new String[tamanho];
        String cpf [] = new String[tamanho];
        String profission [] = new String[tamanho];
        String salario [] = new String[tamanho];
        while (escolha) {
            System.out.println("Escolha uma opcao: ");
            System.out.println("1- Cadastrar");
            System.out.println("2- Listar Todos");
            System.out.println("3- Atualizar por Codigo");
            System.out.println("4- Pesquisar pelo Codigo ");
            System.out.println("5- Deletar / Excluir ");
            System.out.println("6- Pesquisar por nome");
            System.out.println("7- Sair");
            System.out.println(" ");
            op = sc.nextInt();
            if (op <= 7) {
                if (op != 0) {
                    switch (op) {
                        case 1: {
                            System.out.println("\n\n\n");
                            System.out.println("*****CADASTRO*****");
                            System.out.print("Digite o nome: ");
                                nome[i] = sc.next();
                            System.out.print("Digite o telefone: ");
                                telefone[i] = sc.next();
                            System.out.print("CPF: ");
                                cpf[i] = sc.next();
                            System.out.print("Profissao: ");
                                profission[i] = sc.next();
                            System.out.print("Salario: R$ ");
                                salario[i] = sc.next();                                
                            if ((nome[i] != null) && (cpf[i] != null)) {
                                System.out.println("Cadastrado Realizado com Sucesso!!! \n\n\n");
                                i++;
                            } else {
                                System.out.println("Erro a salvar cadastro! Verifique os dados \n\n\n");
                            }
                            System.out.println("*******************************************************");
                            break;
                        }
                        case 2: {
                            System.out.println("LISTAR CADASTRO");
                            for (int x = 0; x < tamanho; x++) {
                                if (nome[x] != null) {//verifica se o vetor na posição x não possui valor nulo
                                    System.out.println("Posição do Indice "+x);
                                    System.out.println("Nome: " + nome[x]);
                                    System.out.println("Telefone: " + telefone[x]);
                                    System.out.println("CPF: "+cpf[x]);
                                    System.out.println("Profissao: " + profission[x]);
                                    System.out.println("Salario R$ : " + salario[x]);
                                    System.out.println("\n");
                                }
                            }
                            break;
                        }
                        case 3: {
                            System.out.println("Atualizar por Indice! ");
                            System.out.print("Digite o numero do indice que deseja atualizar:  ");
                            int att = sc.nextInt();
                            if ((att <= tamanho) && (nome[att] != null)) {
                                System.out.print("Digite o novo Nome para o indice: " + att);
                                    nome[att] = sc.next();
                                System.out.println("Digite o novo Telefone para o indice: " + att);
                                    telefone[att] = sc.next();
                                System.out.println("Digite o novo CPF para o indice: " + att);
                                    cpf[att] = sc.next();
                                System.out.println("Digite o novo Profissao para o indice: " + att);
                                    profission[att] = sc.next();
                                System.out.println("Digite o novo Salario para o indice: R$ " + att);
                                    salario[att] = sc.next();
                                System.out.println("\n\n Cadastro Realizado Com Sucesso!!! \n\n");
                            }
                            break;
                        }
                        case 4:{
                            System.out.println("Pesquisar por codigo");
                            System.out.print("Digite o codigo");
                            int pes = sc.nextInt();
                            if(pes<=tamanho){
                                if(nome[pes]!=null){
                                    System.out.println(nome[pes]);
                                    System.out.println(telefone[pes]);
                                    System.out.println(cpf[pes]);
                                    System.out.println(profission[pes]);
                                    System.out.println(salario[pes]);
                                }else{
                                    System.out.println("Posição de Indice vazia! ");
                                }
                            }
                            break;
                        }
                        case 5: {
                            System.out.println("Excluir Cadastro!");
                            System.out.println("************************* ");
                            System.out.print("Digite o numero do indice que deseja Excluir:  ");
                            int att = sc.nextInt();
                            if ((att <= tamanho) && (nome[att] != null)) {
                                nome[att] = null;
                                telefone[att] = null;
                                cpf[att] = null;
                                profission[att] = null;
                                salario[att] = null;
                            } else {
                                System.out.println("Impossivel Excluir");
                            }
                            break;
                        }
                        case 6:{
                            System.out.print("Digite o nome para pesquisa: ");
                            String nomePesq = sc.next();
                             //for(int s=0; s<i;s++){ 
                            for(int s=0; s<tamanho;s++){                  
                            //for(int s=0; s<nome.length;s++){
                                if(nome[s]!=null){
                               if(nome[s].equals(nomePesq)) {
                                   System.out.println("Posição do Índice: "+s);
                                   System.out.println("Nome Pesquisado:" +nome[s]);
                                   System.out.println("Telefone: "+telefone[s]);
                                   System.out.println("CPF: "+cpf[s]);
                                   System.out.println("Profissao: "+profission[s]);
                                   System.out.println("Salario R$ : "+salario[s]);
                               }
                                } 
                            }
                            break;
                        }
                        case 7: {
                            escolha = false;
                            System.out.println("O sistema foi Finalizado!!!");
                           // System.exit(0);
                            break;
                        }                      
                    }
                } else {
                    System.out.println("Opção Inválida!!!\n");
                }
            } else {
                System.out.println("Opção Inválida!!!\n");
            }
        }
        sc.close();
    }
    public static String formatarCPF(String cpf){
        cpf = cpf.replaceAll("[^0-9]","");
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{2})","$1.$2.$3-$4");
    }
}
