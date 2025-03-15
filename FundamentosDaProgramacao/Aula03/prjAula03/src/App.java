import java.util.Scanner;
import java.lang.Math;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");


        /*Exemplo funções matematicas 
        double _abs = Math.sqrt(100);
        System.out.println(_abs);

        double _pow = Math.pow(100, 100);
        System.out.println(_pow);

        double pi = Math.round(3.141592653589793238462643383279);
        System.out.println(pi);


        System.out.println("Insira o número da funcção que você quer");
        System.out.println("1 para absoluto");
        System.out.println("2 para maximo");
        System.out.println("3 para minimo");
        System.out.println("4 para potencia");
        System.out.println("5 para arendondamento");
        String p1 = scanner.nextLine();

        System.out.println("Insira o primeiro número que você deseja inserir nos calculos matematicos");
        Double p2 = scanner.nextDouble();

        System.out.println("Insira o primeiro número que você deseja inserir nos calculos matematicos");
        Double p3 = scanner.nextDouble();


        
        switch (p1) {

            case "1":

            System.out.println("O resultado do absoluto 1 é " + Math.abs(p2));
            System.out.println("O resultado do absoluto 2 é " + Math.abs(p3));
            break;

            case "2":

            System.out.println("O resultado do maximo  é " + Math.max(p2,p3));
            break;

            case "3":

            System.out.println("O resultado do minimo  é " + Math.min(p2,p3));
            break;

            case "4":

            System.out.println("O resultado da potenciação dos dois número é " + Math.pow(p2,p3));
            break;

            case "5":

            System.out.println("O resultado do arendodamento do primeiro número é " + Math.round(p2));
            System.out.println("O resultado do arendodamento do segundo número é " + Math.round(p3));
            break;
        
            default:
                break;
        }
*/

        /*baskara
        int _a = 2;
        int _b = 24;
        int _c = 20;

        //Calculo do delta
        double delta = Math.pow(_b, 2) - (4*_a*_c);

        //calculo x1
        double _x1 = (-_b + Math.sqrt(delta));
        double _1xf = _x1 / (2*_a);

        //calculo x2
        double _x2 = (-_b - Math.sqrt(delta));
        double _2xf = _x2 / (2*_a);

        System.out.println("O resultado da formula de baskara x1 é " + _1xf);
        System.out.println("O resultado da formula de baskara x2 é " + _2xf);
        */
        
        /*Exemplo 
        int ivalor = 9;
        double dvalor = ivalor;

        System.out.println(ivalor);
        System.out.println(dvalor);

        double dvalor2 = 9.78;
        int ivalor2 = (int)  dvalor2;

        System.out.println(dvalor2);
        System.out.println(ivalor2);

        //Valor máximo
        int maxScore = 500;

        // Score atual do usuário
        int userScore = 423;

        float percentual = (float) userScore / maxScore * 100.0f;
        System.out.println("Percentual Final é: " + percentual);
        */

        
        /*Pergunta 1
        System.out.println("Insira o primeiro número para os calculos matematicos");
        int pergunta1 = scanner.nextInt();

        
        System.out.println("Insira o segundo número para os calculos matematicos");
        int pergunta2 = scanner.nextInt();

        //A
        System.out.println("O resultado da soma é " + (pergunta1 + pergunta2) );

        //B
        System.out.println("O resultado da subtração é " + (pergunta1 - pergunta2) );

        //C
        System.out.println("O resultado da multiplicação é " + (pergunta1 * pergunta2) );

        //D
        System.out.println("O resultado da divisão é " + (pergunta1 / pergunta2) );

        //E
        System.out.println("O resultado do resto da  divisão é " + (pergunta1 % pergunta2) );

        //F
        System.out.println("O resultado da exponencial 1  é " + (Math.exp(pergunta1)) );

        //G
        System.out.println("O resultado da exponencial 2  é " + (Math.exp(pergunta2)) );

        //H
        System.out.println("O resultado do minimo  é " + (Math.min(pergunta1, pergunta2)) );

        //I
        System.out.println("O resultado do maximo  é " + (Math.max(pergunta1, pergunta2)) );
        */

        /*Pergunta 2
        System.out.println("Insira a temperatura atual para uma conversão");
        double temp = scanner.nextDouble();

        double conversor = (temp * 1.8 + 32);

        System.out.println("A temperatura atual em celsius é " + temp + " e a temperatura em fahrenheit é " + conversor);
        */
        
        /*Pergunta 3


        System.out.println("Digite a temperatura atual em Fahrenheit");
        double pFah =  scanner.nextDouble();

        double conversor = (pFah - 32) / 1.8;
        System.out.println("A temperatura atual em Fahrenheit é de: " + pFah + " e em celsius é: " +conversor);
         */

        /*Pergunta 4
        
        System.out.println("Digite a velocidade que seu veiculo corre em KM/H");
        double kmH =  scanner.nextDouble();

        double conversorKM = kmH / 3.6;

        System.out.println("A velocidade do seu veiculo em km/h é: " +kmH + "KM/h" + " e em metro é: " + conversorKM + "M/s");
        */

        /*Pergunta 5

        System.out.println("Digite o preco do calçado desejado");
        double precoOr =  scanner.nextDouble();

        System.out.println("Digite o valor do desconto");
        double desconto =  scanner.nextDouble() / 100;

        double valorFinal = precoOr - (desconto * precoOr);
        System.out.println("O valor original do calçado era: " + precoOr + " agora com desconto ficou: " + valorFinal);

        */

        /*Pergunta 6

        System.out.println("Digite a altura de triangulo");
        double altura =  scanner.nextDouble();

        System.out.println("Digite a alargura de um retâgulo");
        double largura =  scanner.nextDouble();

        double perimetro = 2 * (altura + largura);
        double area = (altura * largura);

        System.out.println("A area do seu retangulo é: " + area + " e o perimetro é: " + perimetro);



        */

        /*Pergunta 7 

        System.out.println("Digite a base de triangulo");
        double base =  scanner.nextDouble();

        System.out.println("Digite a altura de um triangulo");
        double altura =  scanner.nextDouble();

        double areaTri = (base * altura) / 2;

        System.out.println("A area do seu triangulo é de: " + areaTri);

        */

        /*Pergunta 8 
        System.out.println("Digite um número para ser potenciado");
        double num1 = scanner.nextDouble();
        
        System.out.println("Digite o número que sera o potenciador");
        double num2 = scanner.nextDouble();

        double resultado = Math.pow(num1, num2);

        System.out.println("O resultado da potencia é de: " + resultado);
        */

        //Pergunta 9

        System.out.println("Digite um número para representar um cateto de um triangulo retangulo");
        double cateto = scanner.nextDouble();

        System.out.println("Digite um número para representar um cateto oposto de um triangulo retangulo");
        double catetoOposto = scanner.nextDouble();

        double cat1 = Math.pow(cateto, 2);
        double cat2 = Math.pow(catetoOposto, 2);

        double hip = Math.sqrt((cat1 + cat2));
        double area = (cateto * catetoOposto) / 2;
        double perimetro = cateto + catetoOposto + hip;

        System.out.println("A hipotenusa do seu triangulo retangulo é: " + hip);
        System.out.println("O perimetro do seu triangulo retangulo é de: " + perimetro);
        System.out.println("A area do seu triangulo retangulo é de: " + area);




    }
}

