import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor da soma "+calcularValor(12, 24, "+"));
        System.out.println("Valor da subtração "+calcularValor(12, 24, "-"));
        System.out.println("Valor da multiplicação "+calcularValor(34, 69, "*"));
        System.out.println("Valor da divisão "+calcularValor(123123, 11, "/"));


        imprimirDados("Pedro", "pedro@gmail", 18);

/* 
        System.out.println("Insira um número para as operações");
        int num1 = scanner.nextInt();

        System.out.println("Insira um segundo número para as operações");
        int num2 = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Insira o sinal da operação");
        String op = scanner.nextLine();

        if(op == "+"){
            System.out.println(soma(num1, num2));
        }else if(op == "-"){
            System.out.println(subtracao(num1, num2));
        }else if(op == "*"){
            System.out.println(multiplicacao(num1, num2));
        }else if(op == "/"){
            System.out.println(divisao(num1, num2));
        }
        */
    }

/*  
   public static int soma(int num1, int num2){
        return num1 + num2;
    }
    public static int subtracao(int num1, int num2){
        return num1 - num2;
    }
    public static int multiplicacao(int num1, int num2){
        return num1 * num2;
    }
    public static int divisao(int num1, int num2){
        return num1 / num2;
    }
        */
        public static double calcularValor(double param1,double param2, String operador){

            double resultado = 0;

            if(operador == "+"){
                resultado = param1 + param2;

            }else if(operador == "-"){
                resultado = param1 - param2;

            }else if(operador == "*"){
                resultado = param1 * param2;

            }else if(operador == "/"){
                resultado = param1 / param2;

            }
            return resultado;
        }

        public static void imprimirDados(String nome,String email, double idade){
            String compl = "";

            if(idade > 18){
                compl = "(Maioridade)";
            }
            String mensagem = "Nome: " + nome + "\n" + "Idade: " + idade + compl +  "\n" + "Email: " + email + "\n" + "Aqui é são leopoldo 04/04/2025";                     
            System.out.println(mensagem);
        }

}
