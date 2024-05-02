import java.util.Scanner;
public class CadastroArrays2 {
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        //tamanho do vetor
        System.out.println("Qual tamanho do inventário? ");
           int tamanho = teclado.nextInt();
        //vetores[] que serão utilizados para o cadastro
        String nome[] = new String[tamanho];
        double valor[] = new double[tamanho];
        String validade[] = new String[tamanho];
        String marca[] = new String[tamanho];
        //Criacão do indice dos vetores
        int i=0;
        //Variável "op" de auxilio no menu
        int op =0;
        //variável "escolha" com valor booleano para validar o While
        boolean escolha = true;
        while(escolha){
            menu();
            op = teclado.nextInt();
            if(op<=6 && op!=0){
                boolean escolha1=true;
                switch (op){
                    case 1:{
                        System.out.println("\n");
                        System.out.println("[1] Cadastrar");
                        System.out.println("# Registro "+i);
                        System.out.print("\nDigite o nome do produto: ");
                            nome[i] = teclado.next();
                        System.out.print("Digite o valor: R$ ");
                            valor[i] = teclado.nextDouble();
                        System.out.print("Validade (ex: 04/11/2025) ");
                            validade[i] = teclado.next();
                        System.out.print("Marca: ");
                            marca[i] = teclado.next();
                        if (nome[i] != null && valor[i]!=0.00){
                            do{
                            System.out.println("Cadastrado Realizado com Sucesso!!");
                            System.out.println("#Registro "+i);
                            i++;
                            System.out.println("\nDeseja continuar cadastrando?[S/N]");
                               char task = teclado.next().charAt(0);
                                    if(task=='s'||task=='S'){
                                        System.out.println("");
                                        System.out.println("[1] Cadastrar");
                                        System.out.println("# Registro "+i);
                                        System.out.print("\nDigite o nome do produto: ");
                                            nome[i] = teclado.next();
                                        System.out.print("Digite o valor: R$ ");
                                            valor[i] = teclado.nextInt();
                                        System.out.print("Validade (ex: 04/11/2025) ");
                                            validade[i] = teclado.next();
                                        System.out.print("Marca: ");
                                            marca[i] = teclado.next();
                                    }else if(task=='n'||task=='N'){
                                        escolha1=false;
                                    }
                            }while(escolha1);    
                        }else{
                            System.out.println("Erro a salvar cadastro! Verifique os dados \n\n\n");
                        }
                        System.out.println("*******************************************************");
                    break;
                    }
                    case 2:{
                        System.out.println("[2] Listar\n");
                        int x=0;
                        if(nome[x]!=null){
                            for (x=0; x < tamanho; x++) {
                                if(nome[x]!=null){
                                System.out.println("#Registro "+x);
                                System.out.println("Produto: "+nome[x]);
                                System.out.println("Valor: R$ "+valor[x]);
                                System.out.println("Validade: "+validade[x]);
                                System.out.println("Marca: "+marca[x]);
                                System.out.println("\n####################");
                                }
                            }
                        }else{
                            System.out.println("Sem registro");
                            }
                    break;
                    }
                    case 3:{
                        System.out.println("[3] Atualizar pelo Codigo\n");
                        System.out.print("Digite o numero do registro que deseja atualizar:  ");
                            int att = teclado.nextInt();
                        if ((att <= tamanho) && (nome[att] != null)) {
                            System.out.println("# Registro "+att);
                            System.out.print(">>"+nome[att]+"<<"+" Atualizar Nome para : ");
                                nome[att] = teclado.next();
                            System.out.print(">>R$ "+valor[att]+"<<"+" Atualizar Valor para: R$ ");
                                valor[att] = teclado.nextDouble();
                            System.out.print(">>"+validade[att]+"<<"+" Atualizar Validade para: ");
                                validade[att] = teclado.next();
                            System.out.print(">>"+marca[att]+"<<"+" Atualizar Marca para: ");
                                marca[att] = teclado.next();
                             do{
                            System.out.println("\n Atualização realizada com sucesso!!!\n");
                            System.out.println("\nDeseja continuar atualizando?[S/N]");
                                char task = teclado.next().charAt(0);
                                     if(task=='s'||task=='S'){
                                         System.out.println("");
                                         System.out.print("Digite o numero do registro que deseja atualizar:  ");
                                            att = teclado.nextInt();
                                        if ((att <= tamanho) && (nome[att] != null)) {
                                            System.out.println("# Registro "+att);
                                            System.out.print(">>"+nome[att]+"<<"+" Atualizar Nome para : ");
                                                nome[att] = teclado.next();
                                            System.out.print(">>R$ "+valor[att]+"<<"+" Atualizar Valor para: R$ ");
                                                valor[att] = teclado.nextDouble();
                                            System.out.print(">>"+validade[att]+"<<"+" Atualizar Validade para: ");
                                                validade[att] = teclado.next();
                                            System.out.print(">>"+marca[att]+"<<"+" Atualizar Marca para: ");
                                                marca[att] = teclado.next();
                                        }
                                     }else if(task=='n'||task=='N'){
                                         escolha1=false;
                                        }
                             }while(escolha1);
                        }else{
                            System.out.print("indice não cadastrado!!");
                        }
                    break;
                    }
                    case 4:{
                        System.out.println("[4] Pesquisar pelo Codigo\n");
                        System.out.print("Digite o numero do registro:  ");
                            int atx = teclado.nextInt();
                        if(atx<=tamanho){
                            System.out.println("");
                            System.out.println("#Registro "+atx);
                            System.out.println("Produto: "+nome[atx]);
                            System.out.println("Valor: R$ "+valor[atx]);
                            System.out.println("Validade: "+validade[atx]);
                            System.out.println("Marca: "+marca[atx]);
                        }else if(nome[atx]==null){
                            System.out.println("Sem registro");
                        }
                        else{
                            System.out.println("Valor inválido!!");
                        }
                    break;
                    }
                    case 5:{
                        System.out.println("[5] Deletar");
                        System.out.print("Digite o numero do produto que será deletado:  ");
                            int at1 = teclado.nextInt();
                        if((at1<=tamanho)&&(nome[at1]!=null)){
                            System.out.println("");
                            System.out.println("#Registro "+at1);
                            System.out.println("Produto: "+nome[at1]);
                            System.out.println("Valor: R$ "+valor[at1]);
                            System.out.println("Validade: "+validade[at1]);
                            System.out.println("Marca: "+marca[at1]);
                            System.out.println("\nDeseja confirmar a exclusão?[S/N]");
                            char task = teclado.next().charAt(0);
                                if(task=='s'||task=='S'){
                                    nome[at1]=null;
                                    valor[at1]=0;
                                    validade[at1]=null;
                                    marca[at1]=null;
                                    System.out.println("Exclusão realizada com sucesso!");
                                }else if(task=='n'||task=='N'){
                                    System.out.println("Retornando ao menu...");
                                }
                        }else {
                                System.out.println("Impossivel Excluir");
                            }
                    break;
                    }
                    case 6:{
                        escolha = false;
                        System.out.println("O sistema foi Finalizado!");
                    break;
                    }
                }
            }else{
                System.out.println("Opção Inválida!");
            }
        }
    }
    private static void menu(){
        System.out.println("\n### Menu principal ###\n");
        System.out.println("[1] Cadastrar");
        System.out.println("[2] Listar Todos");
        System.out.println("[3] Atualizar pelo Codigo");
        System.out.println("[4] Pesquisar pelo Codigo");
        System.out.println("[5] Deletar");
        System.out.println("[6] Sair");
        System.out.println("");
    }
}
