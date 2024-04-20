import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       byte  opcao =1;
       int num1, num2, calculo;
       while((opcao !=0)&&(opcao<=8)){
   System.out.println("*******************************************");
           System.out.println("(0) Sair");
           System.out.println("(1) Somar");
           System.out.println("(2) Subtrair");
           System.out.println("(3) Multiplicar");
           System.out.println("(4) Dividir");
           System.out.println("(5) Porcentagem");
           System.out.println("(6) Potência base 2");
           System.out.println("(7) Potência base 3");
           System.out.println("(8) Raiz Quadrada");
           System.out.print("Escolha uma opção: ");
           System.out.println("##############################");
           opcao = sc.nextByte();
           
           if(opcao==1){
               System.out.println("### Somar ###");
               System.out.println("");
               System.out.print("Primeiro Num: ");
                   num1 = sc.nextInt();
               System.out.print("Segundo Num: ");
                   num2=sc.nextInt();
                   calculo = num1+num2;
               System.out.println("A soma dos numeros "+num1+" "
                       + " + "+num2+ " = "+calculo);
           }
           else if(opcao==2){
               System.out.println("### Subtrair ###");
               System.out.println("");
               System.out.print("Primeiro Num: ");
                   num1 = sc.nextInt();
               System.out.print("Segundo Num: ");
                   num2=sc.nextInt();
                   if(num1>=num2){
                   calculo = num1-num2;
               System.out.println("A subtração dos numeros "+num1+" "
                       + " - "+num2+ " = "+calculo);
                   }else{
                       System.out.println("O Primeiro Num deve ser maior que o segundo.");
                   }
           }
           else if(opcao==3){
               System.out.println("### Multiplicar ###");
               System.out.println("");
               System.out.print("Primeiro Num: ");
                   num1 = sc.nextInt();
               System.out.print("Segundo Num: ");
                   num2=sc.nextInt();
                   calculo = num1*num2;
               System.out.println("A multiplicação dos numeros "+num1+" "
                       + " x "+num2+ " = "+calculo);
           }
           else if(opcao==4){
               System.out.println("### Dividir ###");
               System.out.println("");
               System.out.print("Primeiro Num: ");
                   num1 = sc.nextInt();
               System.out.print("Segundo Num: ");
                   num2=sc.nextInt();
                   if(num1>=num2){
                   calculo = num1/num2;
               System.out.println("A divisão dos numeros "+num1+" "
                       + " / "+num2+ " = "+calculo);
                   }else{
                       System.out.println("O Primeiro Num deve ser maior que o segundo.");
                   }
           }
           else if(opcao==5){
               System.out.println("### Porcentagem ###");
               System.out.println("");
               System.out.println("Qual numero voce deseja calcular? ");
                   double num3 = sc.nextDouble();
               System.out.println("E quantos % ? ");
                   double porc = sc.nextDouble();
                   if(num3<0){
                       System.out.println("Numero informado inválido!");
                   }else if(porc<0){
                       System.out.println("Valor informado de porcentagem inválido!");
                   }else{
                       double valorPorc = (porc/100)*num3;
                       System.out.println(porc+"% de "+num3+" é "+valorPorc);
                   }
           }
           else if(opcao==6){
               System.out.println("### Potencia base 2 ###");
               System.out.println("");
               System.out.println("Qual numero voce deseja calcular? ");
                   int num3 = sc.nextInt();
                   if(num3<0){
                       System.out.println("Numero informado inválido!");
                   }else{
                       int valorPot = num3*num3;
                       System.out.println("A potencia de base 2 do numero "+num3
                               +" é "+valorPot);
                   }
           }
           else if(opcao==7){
               System.out.println("### Potencia base 3 ###");
               System.out.println("");
               System.out.println("Qual numero voce deseja calcular? ");
                   int num3 = sc.nextInt();
                   if(num3<0){
                       System.out.println("Numero informado inválido!");
                   }else{
                       int valorPot = num3*num3*num3;
                       System.out.println("A potencia de base 3 do numero "+num3
                               +" é "+valorPot);
                   }
           }
           else if(opcao==8){
               System.out.println("### Raiz Quadrada ###");
               System.out.println("Digite o numero que você desejar obter a raiz"
                       + " quadrada!");
               double num3 = sc.nextDouble();
               System.out.println("A raiz quadrada de "+num3+" é "+Math.sqrt(num3));
           }
         }
       System.out.println("Programa Finalizado!");
       sc.close();
   }
}
