import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite seu nome: ");
      String nome = teclado.next();
      if (nome != null && !nome.isEmpty() && !nome.matches("\\d+")) {
         System.out.println("Digite seu ano de nascimento: ");
         int ano = teclado.nextInt();
         int refAno = 2024;
         int idade = refAno - ano;
         if (idade > 115) {
            System.out.println("Idade inválida, insira valor corretamente!");
         } else if(idade<18){
             System.out.println("Lamentamos informar porém não podemos segui com"
                     + " o cadastro. Usuário com idade inferior a 18 anos.");
         }else {
                System.out.println("Digite o sexo [F/M]");
                    char sexo = teclado.next().charAt(0);
                System.out.println("Digite seu número de telefone XXXXX-XXXX: ");
                    String telef = teclado.next();
                System.out.println("Digite o código da área DD: ");
                    String ddd = teclado.next();
                if(sexo=='M' || sexo=='m'){
                String sexoNome = "Masculino";
                System.out.println("Olá "+nome + ", seja bem vindo a nossa "
                        + "plataforma. Por favor, confira se seus dados estão "
                        + "informados corretamente: ");
                System.out.println("Nome: "+ nome);
                System.out.println("Sexo: "+sexo+"-"+sexoNome);
                System.out.println("Idade: "+idade);
                System.out.println("Telefone: "+"("+ddd+") "+telef);   
                }else{
                String sexoNome = "Feminino";
                    System.out.println("Olá "+nome + ", seja bem vinda a nossa "
                        + "plataforma. Por favor, confira se seus dados estão "
                        + "informados corretamente: ");
                System.out.println("Nome: "+ nome);
                System.out.println("Sexo: "+ sexo+"-"+sexoNome);
                System.out.println("Idade: "+idade);
                System.out.println("Telefone: "+"("+ddd+") "+telef);    
                }
               }
           } else {
                System.out.println("Valor inválido, insira valor corretamente!");
      }
      teclado.close();
   }
}
