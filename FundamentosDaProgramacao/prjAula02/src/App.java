import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner dados = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 

        /*Declaração de variáveis
        String SNome = "Pedro";
        int iIdade = 18;
        double dSalario = 2050;
        double dValorDesconto;
        char cStatus = 'I';

        int iQuantidade = 10;
        int iDivisor = 0;

        //int iTotal = iQuantidade / iDivisor;
        
        int iTotal = iQuantidade * 10;
      */  

        /* Operações basicas
        try {

            int iValor1;
            int iValor2;
            
            
            System.out.println("Insira o valor que deseja ser calculado");
            iValor1 = dados.nextInt();

            System.out.println("Insira o  segundo valor que deseja ser calculado");
            iValor2 = dados.nextInt();

            int soma = iValor1 + iValor2;
            System.out.println("O valor da soma é " + soma);

            int sub = iValor1 - iValor2;
            System.out.println("O valor da subtração é " + sub);

            int mult = iValor1 * iValor2;
            System.out.println("O valor da multiplicação é " + mult);

            int div = iValor1 / iValor2;
            System.out.println("O valor da divisão é " + div);




        } catch (Exception e)     
        { e.printStackTrace();
        }*/
        
        /* Usuário 
        try {
        /* 
            System.out.println("Qual o seu nome");
            String nome = reader.readLine();

            System.out.println("Em que ano você nasceu");
            int anoNascimento = Integer.parseInt(reader.readLine());

            System.out.println("Em você está");
            int anoAtual = Integer.parseInt(reader.readLine());


            System.out.println("Digite sua altura");
            double altura = Double.parseDouble(reader.readLine());

            System.out.println("Seu nome é " + nome + ", sua idade é " + (anoAtual - anoNascimento ) + " anos e você tem " + altura + "m de altura");

        } catch (IOException e) 
        {
        
        e.printStackTrace();
        }*/

        /* Exercicio 1-
        String nome = "Pedro";

        System.out.println("Seu nome sem variavel é Pedro e com uma variável é: ("+ nome + ")");
         */

        /* Exercicio 2-

        int idade = 18;

        System.out.println("Sua idade é de " + idade);
        */

        /* Exercicio 3-

        double altura = 1.67;
        System.out.println("Sua altura é de " + altura + "m");
        */

        /* Exercicio 4-
        System.out.println("Qual o dia do seu nascimento");
        int diaNascimento = dados.nextInt();

        System.out.println("Qual o mês do seu nascimento");
        int mesNascimento = dados.nextInt();

        System.out.println("O dia do seu nascimento foi " + diaNascimento + " do mês " + mesNascimento);
        */

        /* Exercicio 5-

        System.out.println("Qual o dia do seu aniversário");
        int iDiaNascimeto = dados.nextInt();
        dados.nextLine();
        System.out.println("Qual o mês do seu aniversário");
        String SMesNascimento = dados.nextLine();

        System.out.println("Você nasceu " + iDiaNascimeto + " de " + SMesNascimento);
        */

        /* Exercicio 6-
        System.out.println("Qual o dia do seu aniversário");
        int iDiaNascimeto = dados.nextInt();

        System.out.println("Qual o mês do seu aniversário");
        int iMesNascimento = dados.nextInt();

        System.out.println("Qual o ano que você nasceu");
        int iAnoNascimento = dados.nextInt();

        System.out.println("Sua data de nascimento foi " + iDiaNascimeto  +"/" + iMesNascimento + "/" + iAnoNascimento);
        */
        
    }
}
