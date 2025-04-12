public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        //System.out.println("O resultado da soma é: " +calcular(2, 5, "+"));
        //System.out.println("O resultado da subtração é: " +calcular(2, 5, "-"));
        //System.out.println("O resultado da multiplicação é: " +calcular(2, 5, "*"));
        //System.out.println("O resultado da divisão é: " +calcular(2, 5, "/"));
        //ImprimirDados("Junior", "Juniorfj@gmail", 64);
        //ImprimirDados("pit", "partytime@gmail", 37);
        //ImprimirDados("goat", "spygoat@gmail", 64);

        //System.out.println(ReajusteSalarial(2000));

        //System.out.println(SalarioFamilia(10000, 5));

        //System.out.println(ParImpar(1));
        
    }

    public static double calcular(double num, double num2, String simb) {

        double resultado = 0;
        if (simb == "+") {
            resultado = num + num2;
            return resultado;
        } else if (simb == "-") {
            resultado = num - num2;
            return resultado;
        } else if (simb == "*") {
            resultado = num * num2;
            return resultado;
        } else if (simb == "/") {
            resultado = num / num2;
            return resultado;
        }
        return resultado;
    }

    public static void ImprimirDados(String nome, String email, int idade){
        System.out.println("Nome: " + nome + " \n" + "Email: " + email + "\n" + "Idade: " + idade + "\n");
    }

    public static double ReajusteSalarial(double salario){
        double reajuste = salario *(1+(12.00/100));

        return reajuste;

    }

    public static double SalarioFamilia(double salario, int filhos){
            double desconto = salario * 0.05;
            double somaTotal = salario + (desconto * filhos);
            return somaTotal ;
    }

    public static String ParImpar(int num){
        if(num % 2 == 0){
            String resposta = "O número " + num + " é par";
            return resposta;

        }else{
            String resposta = "O número " + num + " é impar";
            return resposta;
        }
    }

    public static void Calculadora(){
        int i = 0;
        int j = 10;

        while (i <= 10 && j >= 0) {
            System.out.println("O resultado da conta " + i + " * " + j + " = " + (i * j));
            i++;
            j--;
        }
    }
}

