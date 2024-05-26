
import java.util.Scanner;
import java.util.Calendar;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class SGV {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanho = 150;//tamanho do vetor e indice
        int i = 0; //Vetor de referência para o cadastro dos clientes
        int j = 0; //Vetor de referência para o cadastro dos colaboradores
        //Instanciando vetores do colaborador
        String nomeColaborador[] = new String[tamanho];
        String cpfColaborador[] = new String[tamanho];
        String cpfFormatadoColaborador[] = new String[tamanho];
        String dtNascColaborador[] = new String[tamanho];
        String senhaColaborador[] = new String[tamanho];
        String matricula[] = new String[tamanho];
        //Preenchendo os 3 primeiros colaboradores
        nomeColaborador[0] = "Arthur";
        cpfColaborador[0] = "88455265412";
        dtNascColaborador[0] = "18/05/2022";
        senhaColaborador[0] = "ete2024";
        matricula[0] = "colab00";
        nomeColaborador[1] = "Junior";
        cpfColaborador[1] = "47465278482";
        dtNascColaborador[1] = "18/05/2000";
        senhaColaborador[1] = "ete2024";
        matricula[1] = "colab01";
        nomeColaborador[2] = "Luiz";
        cpfColaborador[2] = "69437264702";
        dtNascColaborador[2] = "18/05/1997";
        senhaColaborador[2] = "ete2024";
        matricula[2] = "colab02";
        //Instanciando vetores do cliente
        String nomeCliente[] = new String[tamanho];
        String cpfCliente[] = new String[tamanho];
        String cpfFormatadoCliente[] = new String[tamanho];
        String dtNascCliente[] = new String[tamanho];
        String senhaCliente[] = new String[tamanho];
        int pontosCliente[] = new int[tamanho];
        //Preenchendo os 3 primeiros clientes
        nomeCliente[0] = "Miguel";
        cpfCliente[0] = "85485795487";
        dtNascCliente[0] = "04/11/1998";
        senhaCliente[0] = "ete2024";
        pontosCliente[0] = 500;
        nomeCliente[1] = "Isabela";
        cpfCliente[1] = "85485795487";
        dtNascCliente[1] = "04/11/2008";
        senhaCliente[1] = "ete2024";
        pontosCliente[1] = 2500;
        nomeCliente[2] = "Mayara";
        cpfCliente[2] = "85485795487";
        dtNascCliente[2] = "04/11/1998";
        senhaCliente[2] = "ete2024";
        pontosCliente[2] = 500;
        //Instanciando vetores do produto
        String nomeProd[] = new String[tamanho];
        String marcaProd[] = new String[tamanho];
        String validadeProd[] = new String[tamanho];
        double preco[] = new double[tamanho];
        int quantidade[] = new int[tamanho];
        int pontosProduto[] = new int[tamanho];
        //Preenchendo os 10 primeiros produtos
        {
            nomeProd[0] = "Creatina";
            marcaProd[0] = "PowerX";
            validadeProd[0] = "10/2024";
            preco[0] = 100;
            quantidade[0] = 18;
            pontosProduto[0] = 100;
            //Produto 2
            nomeProd[1] = "Barrinha de Morango";
            marcaProd[1] = "Nutrivita";
            validadeProd[1] = "11/2024";
            preco[1] = 7;
            quantidade[1] = 18;
            pontosProduto[1] = 50;
            //Produto 3
            nomeProd[2] = "Barrinha de Chocolate";
            marcaProd[2] = "Nutrivita";
            validadeProd[2] = "11/2024";
            preco[2] = 7;
            quantidade[2] = 18;
            pontosProduto[2] = 50;
            //Produto 4
            nomeProd[3] = "Whey Protein";
            marcaProd[3] = "PowerX";
            validadeProd[3] = "09/2024";
            preco[3] = 55;
            quantidade[3] = 18;
            pontosProduto[3] = 100;
            //Produto 5
            nomeProd[4] = "Cafeína";
            marcaProd[4] = "PowerX";
            validadeProd[4] = "05/2024";
            preco[4] = 35;
            quantidade[4] = 18;
            pontosProduto[4] = 70;
            //Produto 6
            nomeProd[5] = "Termogênico";
            marcaProd[5] = "Nutrivita";
            validadeProd[5] = "08/2024";
            preco[5] = 40;
            quantidade[5] = 18;
            pontosProduto[5] = 60;
            //Produto 7
            nomeProd[6] = "Creatina";
            marcaProd[6] = "LifeNutri";
            validadeProd[6] = "01/2025";
            preco[6] = 60;
            quantidade[6] = 18;
            pontosProduto[6] = 100;
            //Produto 8
            nomeProd[7] = "Maca Peruana";
            marcaProd[7] = "LifeNutri";
            validadeProd[7] = "05/2024";
            preco[7] = 90;
            quantidade[7] = 18;
            pontosProduto[7] = 80;
            //Produto 9
            nomeProd[8] = "Paçoca Light";
            marcaProd[8] = "Xline";
            validadeProd[8] = "12/2024";
            preco[8] = 0.50;
            quantidade[8] = 18;
            pontosProduto[8] = 30;
            //Produto 10
            nomeProd[9] = "Whey Sabor Chocolate";
            marcaProd[9] = "Xline";
            validadeProd[9] = "10/2024";
            preco[9] = 40;
            quantidade[9] = 18;
            pontosProduto[9] = 100;
        }
        int tamanhoAdmin = 2;
        String nomeAdmin[] = new String[tamanhoAdmin];
        String senhaAdmin[] = new String[tamanhoAdmin];
        nomeAdmin[0] = "Admin";
        senhaAdmin[0] = "Admin";
        boolean escolha = true; //Valor lógico para o menu
        int resp; //Variável resposta do menu
        while (escolha) {
            System.out.println("");
            System.out.println("\n======================================================");
            System.out.println("=       ====================================         =");
            System.out.println(" ===== << Sistema de Gerenciamento e Vendas >> =====");
            System.out.println("=       ===================================          =");
            System.out.println("=====================================================");
            System.out.println("Variável i:" + i);
            System.out.println("Variável j:" + j);
            System.out.println("[1] Cliente");
            System.out.println("[2] Colaborador");
            System.out.println("[3] Administrador");
            System.out.println("[4] Sair");
            resp = teclado.nextInt();
            if (resp <= 4 && resp != 0) {
                switch (resp) {
                    case 1: {
                        boolean menuCliente = true;
                        do {
                            System.out.println("[1] Cliente - Área Login");
                            System.out.println("\nDigite seu código de acesso:");
                            int k = teclado.nextInt();//variável local k para auxiliar na contagem dos vetores
                            //O código de acesso informado vai ser a referência para as movimentações
                            if (nomeCliente[k] != null) {
                                boolean acessoLogin = true;
                                do {
                                    if (k < tamanho && nomeCliente[k] != null) {
                                        System.out.println("\nConfirme seu login e senha");
                                        System.out.print("Nome:");
                                        String testeNome = teclado.next();
                                        //Se nome correto, vai pedir senha,senão, mensagem de erro
                                        if (nomeCliente[k] != null && nomeCliente[k].equals(testeNome)) {
                                            System.out.print("Senha:");
                                            String testeSenha = teclado.next();
                                            //Se senha correta, mensagem de sucesso,senão, mensagem de erro
                                            if (senhaCliente[k] != null && senhaCliente[k].equals(testeSenha)) {
                                                System.out.println("\nLogin realizado com sucesso");
                                                acessoLogin = false;
                                            } else {
                                                System.out.println("\n*** Senha incorreta! ***");
                                            }
                                        } else {
                                            System.out.println("\n*** Nome incorreto! ***");
                                        }
                                    }
                                } while (acessoLogin);
                                System.out.println("");
                                System.out.println("Olá " + nomeCliente[k]);
                                System.out.println("Você possui atualmente " + pontosCliente[k] + " pontos!");
                                boolean retornar = true;
                                while (retornar) {
                                    System.out.println("\nTecle 1 para retornar ao menu principal");
                                    int sc = teclado.next().charAt(0);
                                    if (sc == 1) {
                                        System.out.println("Retornando ao menu principal...");
                                        retornar = false;
                                        menuCliente = false;
                                    } else {
                                        System.out.println("Valor inválido!!");
                                    }
                                }
                            } else {
                                System.out.println("*** Opção inválida! Código sem cadastro! ***\n");
                            }
                        } while (menuCliente);
                        break;
                    }
                    case 2: {
                        System.out.println("[2] Colaborador - Área Login");
                        System.out.println("\nDigite seu código de acesso:");
                        int v = teclado.nextInt();//variável local v para auxiliar na contagem dos vetores
                        //O código de acesso informado vai ser a referência para as movimentações
                        if (nomeColaborador[v] != null) {
                            boolean acessoLogin = true;
                            do {
                                if (v < tamanho && nomeColaborador[v] != null) {
                                    System.out.println("\nConfirme seu login e senha");
                                    System.out.print("Nome:");
                                    String testeNome = teclado.next();
                                    //Se nome correto, vai pedir senha,senão, mensagem de erro
                                    if (nomeColaborador[v] != null && nomeColaborador[v].equals(testeNome)) {
                                        System.out.print("Senha:");
                                        String testeSenha = teclado.next();
                                        //Se senha correta, mensagem de sucesso,senão, mensagem de erro
                                        if (senhaColaborador[v] != null && senhaColaborador[v].equals(testeSenha)) {
                                            System.out.println("\nLogin realizado com sucesso");
                                            acessoLogin = false;
                                        } else {
                                            System.out.println("\n*** Senha incorreta! ***");
                                        }
                                    } else {
                                        System.out.println("\n*** Nome incorreto! ***");
                                    }
                                }
                            } while (acessoLogin);
                            boolean MenuColaborador = true;
                            do {
                                System.out.println("=       =============================         =");
                                System.out.println(" =====   Área do Colaborador  =====");
                                System.out.println("===============================================");
                                System.out.println("\nOlá " + nomeColaborador[v]);
                                System.out.println("\n[1] Estoque");
                                System.out.println("[2] Vendas");
                                System.out.println("[3] Cadastro de Cliente");
                                System.out.println("[4] Sair");
                                char task = teclado.next().charAt(0);
                                switch (task) {
                                    case '1': {
                                        //Variável lógica que irá permitir que as opções do menu estoque fiquem sempre exibindo
                                        boolean menuEstoq = true;
                                        do {
                                            System.out.println("**Estoque**\n");
                                            System.out.println("[1] Consultar por Cód Produto");
                                            System.out.println("[2] Listar todos");
                                            int task1 = teclado.nextInt();
                                            if (task1 == 1) {
                                                System.out.print("\nDigite o numero do SKU do item:  ");
                                                int atx = teclado.nextInt();
                                                if (atx <= tamanho && nomeProd[atx] != null) {
                                                    System.out.print("Cód: " + atx);
                                                    System.out.println(" -- Produto: " + nomeProd[atx]);
                                                    System.out.print("Marca: " + marcaProd[atx]);
                                                    System.out.println(" -- Quantidade disponível: " + quantidade[atx]);
                                                    System.out.print("Mês Vali: " + validadeProd[atx]);
                                                    System.out.println(" -- Valor: R$ " + preco[atx]);
                                                    System.out.println("Pontos por venda: " + pontosProduto[atx] + " pts");
                                                    System.out.println("#####################################\n");
                                                } else if (nomeProd[atx] == null) {
                                                    System.out.println("Sem registro");
                                                } else {
                                                    System.out.println("Valor inválido!!");
                                                }
                                            } else if (task1 == 2) {
                                                int x = 0;
                                                if (nomeProd[x] != null) {
                                                    for (x = 0; x < tamanho; x++) {
                                                        if (nomeProd[x] != null) {
                                                            System.out.println("Cód: " + x);
                                                            System.out.println("Produto: " + nomeProd[x]);
                                                            System.out.println("Quantidade: " + quantidade[x]);
                                                            System.out.println("Marca: " + marcaProd[x]);
                                                            System.out.println("Mês Vali: " + validadeProd[x]);
                                                            System.out.println("Valor: R$ " + preco[x]);
                                                            System.out.println("\n");
                                                            System.out.println("____________________________________________");
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("Valor inválido!");
                                                }
                                            } else {
                                                System.out.println("Valor inválido!");
                                            }
                                            System.out.println("\nVoltar ao menu principal?[S/N]");
                                            boolean loopVoltar = true; //Variável lógica para tomada de decisão
                                            while (loopVoltar) {
                                                char taskVoltar = teclado.next().charAt(0);
                                                if (taskVoltar == 'S' || taskVoltar == 's') {
                                                    menuEstoq = false;
                                                    loopVoltar = false;
                                                } else if (taskVoltar == 'N' || taskVoltar == 'n') {
                                                    menuEstoq = true;
                                                    loopVoltar = false;
                                                } else {
                                                    System.out.println("Opção inválida! Verifique o menu!");
                                                }
                                            }
                                        } while (menuEstoq);
                                        break;
                                    }
                                    case '2': {
                                        boolean MenuVenda = true;
                                        do {
                                            System.out.println("**Vendas**\n");
                                            System.out.println("Cliente já cadastrado?[S/N] ");
                                            boolean loop = true; //Variável lógica para tomada de decisão
                                            while (loop) {
                                                char taskVoltar = teclado.next().charAt(0);
                                                if (taskVoltar == 'S' || taskVoltar == 's') {
                                                    MenuVenda = true;
                                                    loop = false;
                                                    boolean areaVenda = true;
                                                    do {
                                                        System.out.print("Digite o cód do cliente: ");
                                                        //Entrada pelo Scanner, valor será referêcia para o vetor
                                                        int c = teclado.nextInt();
                                                        if (nomeCliente[c] == null && c < tamanho) {
                                                            System.out.println("Verifique se cliente inserido corretamente!\n");
                                                        } else if (nomeCliente[c] != null && c < tamanho) {
                                                            boolean loopCliente = true;
                                                            while (loopCliente) {
                                                                if (nomeCliente[c] != null) {
                                                                    System.out.println("Cliente Cód Nº " + c + ": " + nomeCliente[c]);
                                                                    System.out.println("\nConfirmar?[S/N]");
                                                                    char taskLoop = teclado.next().charAt(0);
                                                                    if (taskLoop == 'S' || taskLoop == 's') {
                                                                        areaVenda = true;
                                                                        loopCliente = false;
                                                                    } else if (taskLoop == 'N' || taskLoop == 'n') {
                                                                        System.out.println("Digite o cód do cliente: ");
                                                                        areaVenda = true;
                                                                        loopCliente = true;
                                                                        c = teclado.nextInt();
                                                                    } else {
                                                                        System.out.println("Opção inválida! Verifique o menu!");
                                                                    }
                                                                } else {
                                                                    System.out.println("Cliente não cadastrado!");
                                                                    System.out.println("\nDigite o cód do cliente: ");
                                                                    c = teclado.nextInt();
                                                                }
                                                            }
                                                            System.out.println("\nCliente: " + nomeCliente[c]);
                                                            System.out.println("Vendedor: " + nomeColaborador[v]);
                                                            System.out.println("\nDigite cód do produto:");
                                                            int p = teclado.nextInt();
                                                            boolean loopProduto = true;
                                                            while (loopProduto) {
                                                                if (nomeProd[p] != null && quantidade[p] != 0) {
                                                                    System.out.print("\nCód: " + p);
                                                                    System.out.println(" -- Produto: " + nomeProd[p]);
                                                                    System.out.print("Marca: " + marcaProd[p]);
                                                                    System.out.println(" -- Quantidade disponível: " + quantidade[p]);
                                                                    System.out.print("Mês Vali: " + validadeProd[p]);
                                                                    System.out.println(" -- Valor: R$ " + preco[p]);
                                                                    System.out.println("Pontos por venda: " + pontosProduto[p] + " pts");
                                                                    System.out.println("\nConfirmar?[S/N]");
                                                                    char taskLoop = teclado.next().charAt(0);
                                                                    if (taskLoop == 'S' || taskLoop == 's') {
                                                                        areaVenda = true;
                                                                        loopProduto = false;
                                                                    } else if (taskLoop == 'N' || taskLoop == 'n') {
                                                                        System.out.println("Insira o código do produto: ");
                                                                        areaVenda = true;
                                                                        loopProduto = true;
                                                                        p = teclado.nextInt();
                                                                    } else {
                                                                        System.out.println("Opção inválida! Verifique o menu!");
                                                                    }
                                                                } else if (nomeProd[p] != null && quantidade[p] == 0) {
                                                                    System.out.println("Saldo insuficiente no estoque");
                                                                    System.out.println("\nDigite o cód do produto: ");
                                                                    p = teclado.nextInt();
                                                                } else {
                                                                    System.out.println("Produto não cadastrado!");
                                                                    System.out.println("\nDigite o cód do produto: ");
                                                                    p = teclado.nextInt();
                                                                }
                                                            }
                                                            System.out.println("\nCliente: " + nomeCliente[c]);
                                                            System.out.println("Vendedor: " + nomeColaborador[v]);
                                                            System.out.print("Produto: " + nomeProd[p]);
                                                            System.out.println(" -- Valor: R$ " + preco[p]);
                                                            System.out.println("Digite a quantidade: ");
                                                            int saida = teclado.nextInt();
                                                            boolean loopQtd = true;
                                                            while (loopQtd) {
                                                                System.out.println("Valor inserido: " + saida);  // Depuração
                                                                // Se quantidade para compra igual a zero, mensagem de valor inválido
                                                                if (saida == 0) {
                                                                    System.out.println("Valor inválido!");
                                                                    System.out.print("Produto: " + nomeProd[p] + " -- Valor: R$ " + preco[p] + " x ");
                                                                    saida = teclado.nextInt();
                                                                } // Se compra maior que estoque, msg de erro e vai aguardar nova quantidade
                                                                else if (saida > quantidade[p]) {
                                                                    System.out.println("Valor maior que disponível no estoque!");
                                                                    System.out.print("Produto: " + nomeProd[p] + " -- Valor: R$ " + preco[p] + " x ");
                                                                    saida = teclado.nextInt();
                                                                } // Se quantidade para compra menor que estoque e diferente de zero, a operação seguirá
                                                                else if (saida < quantidade[p]) {
                                                                    double valorTotal = saida * preco[p];
                                                                    System.out.println(saida + " x R$ " + preco[p] + ": R$ " + valorTotal);
                                                                    loopQtd = false;
                                                                }
                                                            }
                                                            boolean confirmar = true;
                                                            //Verificar esse trecho
                                                            while (confirmar) {
                                                                System.out.println("\n[1]- Confirmar");
                                                                System.out.println("[2] - Cancelar");
                                                                char sc = teclado.next().charAt(0);
                                                                if (sc == '1') {
                                                                    System.out.println("Compra realizada com sucesso");
                                                                    quantidade[p] = quantidade[p] - saida;
                                                                    pontosCliente[c] = pontosCliente[c] + (saida * pontosProduto[p]);
                                                                    System.out.println(nomeCliente[c] + " possui atualmente " + pontosCliente[c] + " pontos.");
                                                                    confirmar = false;
                                                                    loopQtd = false;
                                                                    areaVenda = false;
                                                                    MenuVenda = false;
                                                                } else if (sc == '2') {
                                                                    System.out.println("Operação cancelada! Retornando ao menu ...");
                                                                    confirmar = false;
                                                                    loopQtd = false;
                                                                    areaVenda = false;
                                                                    MenuVenda = false;
                                                                } else {
                                                                    System.out.println("Valor inválido!!");
                                                                }
                                                            }
                                                        }
                                                    } while (areaVenda);
                                                } else if (taskVoltar == 'N' || taskVoltar == 'n') {
                                                    System.out.println("Realizar novo cadastro!\n");
                                                    MenuVenda = false;
                                                    loop = false;
                                                } else {
                                                    System.out.println("Opção inválida! Verifique o menu 1!");
                                                }
                                            }

                                        } while (MenuVenda);
                                        break;
                                    }
                                    case '3': {
                                        System.out.println("**Cadastro Cliente**");
                                        if (i < tamanho) {
                                            boolean menuCadastro = true;
                                            while (menuCadastro) {
                                                if (nomeCliente[i] == null) {
                                                    System.out.println("\n");
                                                    System.out.println("[1] Novo Cadastro Cliente");
                                                    System.out.println("# Registro Nº " + i);
                                                    System.out.print("\nDigite o nome do cliente: ");
                                                    nomeCliente[i] = teclado.next();
                                                    System.out.print("Digite o CPF: ");
                                                    cpfCliente[i] = teclado.next();
                                                    boolean loopCPF = true;
                                                    do {
                                                        boolean cpfValido = validarCPF(cpfCliente[i]);
                                                        if (cpfValido) {
                                                            loopCPF = false;
                                                        } else {
                                                            System.out.println("CPF Informado não é válido");
                                                            System.out.println(" Por favor inserir corretamente");
                                                            cpfCliente[i] = teclado.next(); // Exemplo de CPF
                                                        }

                                                    } while (loopCPF);
                                                    System.out.print("Data de nascimento:");
                                                    dtNascCliente[i] = teclado.next();
                                                    System.out.print("Senha: ");
                                                    senhaCliente[i] = teclado.next();
                                                    System.out.println("\nCadastrado Realizado com Sucesso!!");
                                                    //Será exibido os dados cadastrados
                                                    System.out.println("Nome: " + nomeCliente[i]);
                                                    cpfFormatadoCliente[i] = formatarCPF(cpfCliente[i]);
                                                    System.out.println("CPF:" + cpfFormatadoCliente[i]);
                                                    System.out.println("Data Nascimento:" + dtNascCliente[i]);

                                                    System.out.println("Bem Vindo " + nomeCliente[i] + ", seu código de acesso é o Nº " + i + ".\n");
                                                    i++;
                                                    System.out.println("\n********************************\n");
                                                    System.out.println("Retornando ao menu principal...");
                                                    menuCadastro = false;
                                                } else if (nomeCliente[i] != null) {
                                                    System.out.println("");
                                                    i++;
                                                }
                                            }
                                        } else {
                                            System.out.println("Limite de clientes cadastrados atingido!");
                                            System.out.println("Por favor, entre em contato com o SAC para alteração de cadastros!");
                                            System.out.println("0800 402 8922\n");
                                        }
                                        break;
                                    }
                                    case '4': {
                                        System.out.println("Retornando ao menu principal");
                                        MenuColaborador = false;
                                    }
                                }
                            } while (MenuColaborador);
                            break;
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("[3] Administrador - Área Login");
                        System.out.println("\nDigite seu código de acesso:");
                        int v = teclado.nextInt();//variável local v para auxiliar na contagem dos vetores
                        //O código de acesso informado vai ser a referência para as movimentações
                        if (nomeAdmin[v] != null) {
                            boolean acessoLogin = true;
                            do {
                                if (v < tamanhoAdmin && nomeAdmin[v] != null) {
                                    System.out.println("\nConfirme seu login e senha");
                                    System.out.print("Nome:");
                                    String testeNome = teclado.next();
                                    //Se nome correto, vai pedir senha,senão, mensagem de erro
                                    if (nomeAdmin[v] != null && nomeAdmin[v].equals(testeNome)) {
                                        System.out.print("Senha:");
                                        String testeSenha = teclado.next();
                                        //Se senha correta, mensagem de sucesso,senão, mensagem de erro
                                        if (senhaAdmin[v] != null && senhaAdmin[v].equals(testeSenha)) {
                                            System.out.println("\nLogin realizado com sucesso");
                                            acessoLogin = false;
                                        } else {
                                            System.out.println("\n*** Senha incorreta! ***");
                                        }
                                    } else {
                                        System.out.println("\n*** Nome incorreto! ***");
                                    }
                                }
                            } while (acessoLogin);
                            boolean MenuAdmin = true;
                            do {
                                System.out.println("=       =============================         =");
                                System.out.println(" =====   Área do Administrador  =====");
                                System.out.println("===============================================");
                                System.out.println("\nOlá " + nomeAdmin[v]);
                                System.out.println("\n[1] Estoque");
                                System.out.println("[2] Vendas");
                                System.out.println("[3] Cliente");//Novo/Alterar/Excluir
                                System.out.println("[4] Colaborador");//Novo/Alterar/Excluir
                                System.out.println("[5] Produto");//Novo/Alterar/Excluir
                                System.out.println("[6] Sair");
                                int task = teclado.nextInt();
                                switch (task) {
                                    case 1: {
                                        //Variável lógica que irá permitir que as opções do menu estoque fiquem sempre exibindo
                                        boolean menuEstoq = true;
                                        do {
                                            System.out.println("**Estoque**\n");
                                            System.out.println("[1] Consultar por Cód Produto");
                                            System.out.println("[2] Listar todos");
                                            int task1 = teclado.nextInt();
                                            if (task1 == 1) {
                                                System.out.print("\nDigite o numero do SKU do item:  ");
                                                int atx = teclado.nextInt();
                                                if (atx <= tamanho && nomeProd[atx] != null) {
                                                    System.out.print("Cód: " + atx);
                                                    System.out.println(" -- Produto: " + nomeProd[atx]);
                                                    System.out.print("Marca: " + marcaProd[atx]);
                                                    System.out.println(" -- Quantidade disponível: " + quantidade[atx]);
                                                    System.out.print("Mês Vali: " + validadeProd[atx]);
                                                    System.out.println(" -- Valor: R$ " + preco[atx]);
                                                    System.out.println("Pontos por venda: " + pontosProduto[atx] + " pts");
                                                    System.out.println("#####################################\n");
                                                } else if (nomeProd[atx] == null) {
                                                    System.out.println("Sem registro");
                                                } else {
                                                    System.out.println("Valor inválido!!");
                                                }
                                            } else if (task1 == 2) {
                                                int x = 0;
                                                if (nomeProd[x] != null) {
                                                    for (x = 0; x < tamanho; x++) {
                                                        if (nomeProd[x] != null) {
                                                            System.out.println("Cód: " + x);
                                                            System.out.println("Produto: " + nomeProd[x]);
                                                            System.out.println("Quantidade: " + quantidade[x]);
                                                            System.out.println("Marca: " + marcaProd[x]);
                                                            System.out.println("Mês Vali: " + validadeProd[x]);
                                                            System.out.println("Valor: R$ " + preco[x]);
                                                            System.out.println("\n");
                                                            System.out.println("____________________________________________");
                                                        }
                                                    }
                                                } else {
                                                    System.out.println("Valor inválido!");
                                                }
                                            } else {
                                                System.out.println("Valor inválido!");
                                            }
                                            System.out.println("\nVoltar ao menu principal?[S/N]");
                                            boolean loopVoltar = true; //Variável lógica para tomada de decisão
                                            while (loopVoltar) {
                                                char taskVoltar = teclado.next().charAt(0);
                                                if (taskVoltar == 'S' || taskVoltar == 's') {
                                                    menuEstoq = false;
                                                    loopVoltar = false;
                                                } else if (taskVoltar == 'N' || taskVoltar == 'n') {
                                                    menuEstoq = true;
                                                    loopVoltar = false;
                                                } else {
                                                    System.out.println("Opção inválida! Verifique o menu!");
                                                }
                                            }
                                        } while (menuEstoq);
                                        break;
                                    }
                                    case 2: {
                                        System.out.println("**Vendas**\n");
                                        boolean MenuVenda = true;
                                        do {
                                            System.out.println("Cliente já cadastrado?[S/N] ");
                                            boolean loop = true; //Variável lógica para tomada de decisão
                                            while (loop) {
                                                char taskVoltar = teclado.next().charAt(0);
                                                if (taskVoltar == 'S' || taskVoltar == 's') {
                                                    MenuVenda = true;
                                                    loop = false;
                                                    boolean areaVenda = true;
                                                    do {
                                                        System.out.print("Digite o cód do cliente: ");
                                                        //Entrada pelo Scanner, valor será referêcia para o vetor
                                                        int c = teclado.nextInt();
                                                        if (nomeCliente[c] == null && c < tamanho) {
                                                            System.out.println("Verifique se cliente inserido corretamente!\n");
                                                        } else if (nomeCliente[c] != null && c < tamanho) {
                                                            boolean loopCliente = true;
                                                            while (loopCliente) {
                                                                if (nomeCliente[c] != null) {
                                                                    System.out.println("Cliente Cód Nº " + c + ": " + nomeCliente[c]);
                                                                    System.out.println("\nConfirmar?[S/N]");
                                                                    char taskLoop = teclado.next().charAt(0);
                                                                    if (taskLoop == 'S' || taskLoop == 's') {
                                                                        areaVenda = true;
                                                                        loopCliente = false;
                                                                    } else if (taskLoop == 'N' || taskLoop == 'n') {
                                                                        System.out.println("Digite o cód do cliente: ");
                                                                        areaVenda = true;
                                                                        loopCliente = true;
                                                                        c = teclado.nextInt();
                                                                    } else {
                                                                        System.out.println("Opção inválida! Verifique o menu!");
                                                                    }
                                                                } else {
                                                                    System.out.println("Cliente não cadastrado!");
                                                                    System.out.println("\nDigite o cód do cliente: ");
                                                                    c = teclado.nextInt();
                                                                }
                                                            }
                                                            System.out.println("\nCliente: " + nomeCliente[c]);
                                                            System.out.println("Vendedor: " + nomeColaborador[v]);
                                                            System.out.println("\nDigite cód do produto:");
                                                            int p = teclado.nextInt();
                                                            boolean loopProduto = true;
                                                            while (loopProduto) {
                                                                if (nomeProd[p] != null && quantidade[p] != 0) {
                                                                    System.out.print("\nCód: " + p);
                                                                    System.out.println(" -- Produto: " + nomeProd[p]);
                                                                    System.out.print("Marca: " + marcaProd[p]);
                                                                    System.out.println(" -- Quantidade disponível: " + quantidade[p]);
                                                                    System.out.print("Mês Vali: " + validadeProd[p]);
                                                                    System.out.println(" -- Valor: R$ " + preco[p]);
                                                                    System.out.println("Pontos por venda: " + pontosProduto[p] + " pts");
                                                                    System.out.println("\nConfirmar?[S/N]");
                                                                    char taskLoop = teclado.next().charAt(0);
                                                                    if (taskLoop == 'S' || taskLoop == 's') {
                                                                        areaVenda = true;
                                                                        loopProduto = false;
                                                                    } else if (taskLoop == 'N' || taskLoop == 'n') {
                                                                        System.out.println("Insira o código do produto: ");
                                                                        areaVenda = true;
                                                                        loopProduto = true;
                                                                        p = teclado.nextInt();
                                                                    } else {
                                                                        System.out.println("Opção inválida! Verifique o menu!");
                                                                    }
                                                                } else if (nomeProd[p] != null && quantidade[p] == 0) {
                                                                    System.out.println("Saldo insuficiente no estoque");
                                                                    System.out.println("\nDigite o cód do produto: ");
                                                                    p = teclado.nextInt();
                                                                } else {
                                                                    System.out.println("Produto não cadastrado!");
                                                                    System.out.println("\nDigite o cód do produto: ");
                                                                    p = teclado.nextInt();
                                                                }
                                                            }
                                                            System.out.println("\nCliente: " + nomeCliente[c]);
                                                            System.out.println("Vendedor: " + nomeColaborador[v]);
                                                            System.out.print("Produto: " + nomeProd[p]);
                                                            System.out.println(" -- Valor: R$ " + preco[p]);
                                                            System.out.println("Digite a quantidade: ");
                                                            int saida = teclado.nextInt();
                                                            boolean loopQtd = true;
                                                            while (loopQtd) {
                                                                System.out.println("Valor inserido: " + saida);  // Depuração
                                                                // Se quantidade para compra igual a zero, mensagem de valor inválido
                                                                if (saida == 0) {
                                                                    System.out.println("Valor inválido!");
                                                                    System.out.print("Produto: " + nomeProd[p] + " -- Valor: R$ " + preco[p] + " x ");
                                                                    saida = teclado.nextInt();
                                                                } // Se compra maior que estoque, msg de erro e vai aguardar nova quantidade
                                                                else if (saida > quantidade[p]) {
                                                                    System.out.println("Valor maior que disponível no estoque!");
                                                                    System.out.print("Produto: " + nomeProd[p] + " -- Valor: R$ " + preco[p] + " x ");
                                                                    saida = teclado.nextInt();
                                                                } // Se quantidade para compra menor que estoque e diferente de zero, a operação seguirá
                                                                else if (saida < quantidade[p]) {
                                                                    double valorTotal = saida * preco[p];
                                                                    System.out.println(saida + " x R$ " + preco[p] + ": R$ " + valorTotal);
                                                                    loopQtd = false;
                                                                }
                                                            }
                                                            boolean confirmar = true;
                                                            //Verificar esse trecho
                                                            while (confirmar) {
                                                                System.out.println("\n[1]- Confirmar");
                                                                System.out.println("[2] - Cancelar");
                                                                char sc = teclado.next().charAt(0);
                                                                if (sc == '1') {
                                                                    System.out.println("Compra realizada com sucesso");
                                                                    quantidade[p] = quantidade[p] - saida;
                                                                    pontosCliente[c] = pontosCliente[c] + (saida * pontosProduto[p]);
                                                                    System.out.println(nomeCliente[c] + " possui atualmente " + pontosCliente[c] + " pontos.");
                                                                    confirmar = false;
                                                                    loopQtd = false;
                                                                    areaVenda = false;
                                                                    MenuVenda = false;
                                                                } else if (sc == '2') {
                                                                    System.out.println("Operação cancelada! Retornando ao menu ...");
                                                                    confirmar = false;
                                                                    loopQtd = false;
                                                                    areaVenda = false;
                                                                    MenuVenda = false;
                                                                } else {
                                                                    System.out.println("Valor inválido!!");
                                                                }
                                                            }
                                                        }
                                                    } while (areaVenda);
                                                } else if (taskVoltar == 'N' || taskVoltar == 'n') {
                                                    System.out.println("Realizar novo cadastro!\n");
                                                    MenuVenda = false;
                                                    loop = false;
                                                } else {
                                                    System.out.println("Opção inválida! Verifique o menu 1!");
                                                }
                                            }
                                        } while (MenuVenda);
                                        break;
                                    }
                                    case 3: {
                                        System.out.println("**Opções Cliente**\n");
                                        System.out.println("[1] Cadastro");
                                        System.out.println("[2] Atualizar");
                                        System.out.println("[3] Excluir");
                                        System.out.println("[4] Voltar");
                                        int taskAdminCliente = teclado.nextInt();
                                        boolean menuCliente = true;
                                        do {
                                            switch (taskAdminCliente) {
                                                case 1: {
                                                    System.out.println("**Cliente - Cadastro**");
                                                    if (i < tamanho) {
                                                        boolean menuCadastro = true;
                                                        while (menuCadastro) {
                                                            if (nomeCliente[i] == null) {
                                                                System.out.println("\n");
                                                                System.out.println("[1] Novo Cadastro Cliente");
                                                                System.out.println("# Registro Nº " + i);
                                                                System.out.print("\nDigite o nome do cliente: ");
                                                                nomeCliente[i] = teclado.next();
                                                                System.out.print("Digite o CPF: ");
                                                                cpfCliente[i] = teclado.next();
                                                                boolean loopCPF = true;
                                                                //Loop para validar CPF
                                                                do {
                                                                    boolean cpfValido = validarCPF(cpfCliente[i]);
                                                                    if (cpfValido) {
                                                                        loopCPF = false;
                                                                    } else {
                                                                        System.out.println("CPF Informado não é válido");
                                                                        System.out.println(" Por favor inserir corretamente");
                                                                        cpfCliente[i] = teclado.next(); // Exemplo de CPF
                                                                    }
                                                                } while (loopCPF);
                                                                System.out.print("Data de nascimento:");
                                                                dtNascCliente[i] = teclado.next();
                                                                System.out.print("Senha: ");
                                                                senhaCliente[i] = teclado.next();
                                                                System.out.println("\nCadastrado Realizado com Sucesso!!");
                                                                //Será exibido os dados cadastrados
                                                                System.out.println("Nome: " + nomeCliente[i]);
                                                                cpfFormatadoCliente[i] = formatarCPF(cpfCliente[i]);
                                                                System.out.println("CPF:" + cpfFormatadoCliente[i]);
                                                                System.out.println("Data Nascimento:" + dtNascCliente[i]);
                                                                System.out.println("Bem Vindo " + nomeCliente[i] + ", seu código de acesso é o Nº " + i + ".\n");
                                                                i++;
                                                                System.out.println("\n********************************");
                                                                //Pequena condicional para não voltar direto ao menu
                                                                boolean retornar = true;
                                                                while (retornar) {
                                                                    System.out.println("\nTecle 1 para retornar ao menu principal");
                                                                    int sc = teclado.nextInt();
                                                                    if (sc == 1) {
                                                                        System.out.println("Retornando ao menu principal...");
                                                                        retornar = false;
                                                                        menuCadastro = false;
                                                                        menuCliente=false;
                                                                    } else {
                                                                        System.out.println("Valor inválido!!");
                                                                    }
                                                                }
                                                                menuCadastro = false;
                                                            } else if (nomeCliente[i] != null) {
                                                                System.out.println("");
                                                                i++;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("Limite de clientes cadastrados atingido!");
                                                        System.out.println("Por favor, entre em contato com o SAC para alteração de cadastros!");
                                                        System.out.println("0800 402 8922\n");
                                                    }
                                                    break;
                                                }
                                                case 2: {
                                                    System.out.println("**Atualizar pelo Codigo**\n");
                                                    System.out.print("Digite o Cód do Cliente:  ");
                                                    boolean menuAtualizar = true;
                                                    do {
                                                        //Variável att criada para procurar a posição do vetor do cliente desejado
                                                        int att = teclado.nextInt();
                                                        System.out.println("Nome: " + nomeCliente[att]);
                                                        cpfFormatadoCliente[att] = formatarCPF(cpfCliente[att]);
                                                        System.out.println("CPF:" + cpfFormatadoCliente[att]);
                                                        System.out.println("Deseja confirmar?[S/N]");
                                                        boolean loop = true; //Variável lógica para tomada de decisão
                                                        while (loop) {
                                                            char taskVoltar = teclado.next().charAt(0);
                                                            if (taskVoltar == 'S' || taskVoltar == 's') {
                                                                if ((att <= tamanho) && (nomeCliente[att] != null)) {
                                                                    System.out.println("# Registro " + att);
                                                                    System.out.print(">>" + nomeCliente[att] + "<<" + " Atualizar Nome para : ");
                                                                    nomeCliente[att] = teclado.next();
                                                                    System.out.print(">>" + cpfCliente[att] + "<<" + " Atualizar CPF para: ");
                                                                    cpfCliente[att] = teclado.next();
                                                                    boolean loopCPF = true;
                                                                    //Loop para validar CPF
                                                                    do {
                                                                        boolean cpfValido = validarCPF(cpfCliente[att]);
                                                                        if (cpfValido) {
                                                                            loopCPF = false;
                                                                        } else {
                                                                            System.out.println("CPF Informado não é válido");
                                                                            System.out.println(" Por favor inserir corretamente");
                                                                            cpfCliente[att] = teclado.next(); // Exemplo de CPF
                                                                        }
                                                                    } while (loopCPF);
                                                                    System.out.print(">>" + dtNascCliente[att] + "<<" + "Atualizar Data: ");
                                                                    dtNascCliente[att] = teclado.next();
                                                                    System.out.println("\n Atualização realizada com sucesso!!!\n");
                                                                    //Será exibido os dados atualizados
                                                                    System.out.println("Nome: " + nomeCliente[att]);
                                                                    cpfFormatadoCliente[att] = formatarCPF(cpfCliente[att]);
                                                                    System.out.println("CPF:" + cpfFormatadoCliente[att]);
                                                                    System.out.println("Data Nascimento:" + dtNascCliente[att]);
                                                                    loop = false;
                                                                } else {
                                                                    System.out.print("indice não cadastrado!!");
                                                                }
                                                            } else if (taskVoltar == 'N' || taskVoltar == 'n') {
                                                                System.out.println("Retornando ao menu...");
                                                                loop = false;
                                                                menuAtualizar = false;
                                                                menuCliente = false;
                                                            } else {
                                                                System.out.println("Opção inválida! Verifique o menu !");
                                                            }
                                                        }
                                                    } while (menuAtualizar);
                                                    break;
                                                }
                                                case 3: {
                                                    break;
                                                }
                                                case 4: {
                                                    break;
                                                }
                                            }
                                        } while (menuCliente);
                                        break;
                                    }
                                    case 4: {
                                        System.out.println("**Opções Colaborador**\n");
                                        System.out.println("[1] Cadastro");
                                        System.out.println("[2] Alterar");
                                        System.out.println("[3] Excluir");
                                        System.out.println("[4] Voltar");
                                        int taskAdminColab = teclado.nextInt();
                                        boolean menuColab = true;
                                        do {
                                            switch (taskAdminColab) {
                                                case 1: {
                                                    System.out.println("**Colaborador - Cadastro**");
                                                    if (j < tamanho) {
                                                        boolean menuCadastro = true;
                                                        while (menuCadastro) {
                                                            if (nomeColaborador[j] == null) {
                                                                System.out.println("\n");
                                                                System.out.println("[1] Novo Cadastro Colaborador");
                                                                System.out.println("# Registro Nº " + j);
                                                                System.out.print("\nDigite o nome do cliente: ");
                                                                nomeColaborador[j] = teclado.next();
                                                                System.out.print("Digite o CPF: ");
                                                                cpfColaborador[j] = teclado.next();
                                                                boolean loopCPF = true;
                                                                do {
                                                                    boolean cpfValido = validarCPF(cpfColaborador[j]);
                                                                    if (cpfValido) {
                                                                        loopCPF = false;
                                                                    } else {
                                                                        System.out.println("CPF Informado não é válido");
                                                                        System.out.println(" Por favor inserir corretamente");
                                                                        cpfColaborador[j] = teclado.next(); // Exemplo de CPF
                                                                    }
                                                                } while (loopCPF);
                                                                System.out.print("Data de nascimento:");
                                                                dtNascColaborador[j] = teclado.next();
                                                                System.out.print("Senha: ");
                                                                senhaColaborador[j] = teclado.next();
                                                                matricula[j] = "colab" + j;
                                                                System.out.println("\nCadastrado Realizado com Sucesso!!");
                                                                //Será exibido os dados cadastrados
                                                                System.out.println("Nome: " + nomeColaborador[j]);
                                                                cpfFormatadoColaborador[j] = formatarCPF(cpfColaborador[j]);
                                                                System.out.println("CPF:" + cpfFormatadoColaborador[j]);
                                                                System.out.println("Data Nascimento:" + dtNascColaborador[j]);

                                                                System.out.println("Bem Vindo " + nomeColaborador[j] + ", seu código de acesso é o Nº " + j + ".\n");
                                                                j++;
                                                                System.out.println("\n********************************\n");
                                                                System.out.println("Retornando ao menu principal...");
                                                                menuCadastro = false;
                                                            } else if (nomeCliente[i] != null) {
                                                                System.out.println("");
                                                                i++;
                                                            }
                                                        }
                                                    } else {
                                                        System.out.println("Limite de clientes cadastrados atingido!");
                                                        System.out.println("Por favor, entre em contato com o SAC para alteração de cadastros!");
                                                        System.out.println("0800 402 8922\n");
                                                    }
                                                    break;

                                                }
                                                case 2: {
                                                }
                                                case 3: {
                                                }
                                                case 4: {
                                                }
                                            }
                                        } while (menuColab);
                                        break;
                                    }
                                    case 5: {
                                        System.out.println("**Produto**\n");
                                        System.out.println("[1] Cadastro");
                                        System.out.println("[2] Alterar");
                                        System.out.println("[3] Voltar");
                                        int taskAdminProd = teclado.nextInt();
                                        boolean menuProd = true;
                                        do {
                                            switch (taskAdminProd) {
                                                case 1: {
                                                }
                                                case 2: {
                                                }
                                                case 3: {
                                                }
                                                case 4: {
                                                }
                                            }
                                        } while (menuProd);
                                        break;
                                    }
                                    case 6: {
                                        System.out.println("Retornando ao menu principal");
                                        MenuAdmin = false;
                                    }
                                }
                            } while (MenuAdmin);
                            break;
                        }
                        break;
                    }
                    case 4: {
                        System.exit(0);
                        System.out.println("Finalizando Sistema");
                        break;
                    }
                    default: {
                        System.out.println("Verifique o valor inserido!\n");
                        break;
                    }
                }
            }
        }
    }
// Método para formatar CPF

    public static String formatarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }

    public static boolean validarCPF(String cpf) {
        cpf = cpf.replaceAll("[^0-9]", ""); // Remover caracteres não numéricos

        if (cpf.length() != 11 || cpf.matches("(\\d)\\1{10}")) {
            return false; // CPF deve ter 11 dígitos e não pode ser formado por dígitos repetidos
        }
        // Cálculo do dígito verificador
        int[] digits = new int[11];
        for (int i = 0; i < 11; i++) {
            digits[i] = cpf.charAt(i) - '0';
        }
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += digits[i] * (10 - i);
        }
        int remainder = sum % 11;
        int digit1 = (remainder < 2) ? 0 : (11 - remainder);

        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += digits[i] * (11 - i);
        }
        remainder = sum % 11;
        int digit2 = (remainder < 2) ? 0 : (11 - remainder);

        return (digit1 == digits[9] && digit2 == digits[10]);
    }

    public static void ConversaoData(String[] args) throws ParseException {
        Calendar c = Calendar.getInstance();
        Date data = c.getTime();
        DateFormat f = DateFormat.getDateInstance();
    }
}
