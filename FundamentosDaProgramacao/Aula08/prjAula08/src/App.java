public class App {
    public static void main(String[] args) throws Exception {


        System.out.println("");
        
        //System.out.println(calcularBhaskara(1, 4, 2));
        //System.out.println(calcularBhaskara(1, 8, 4));
        imprimirDados("Anderson", 20, "abacate");

    }

    public static String calcularBhaskara(int aBask, int bBask, int cBask){

        String resultado = "";

        //Realizar o cálculo de x' e x''
        double delta = (bBask * bBask) - (4 * aBask * cBask);
        double raizQuadrada = Math.sqrt(delta);
        double x1 = (-bBask + raizQuadrada) / (2 * aBask); 
        double x2 = (-bBask - raizQuadrada) / (2 * aBask); 

        //Montar a mensagem de retorno
        resultado = "O valor do seu x1 é: " + x1 + " " +  "e o valor do x2 é: " + x2;

        return resultado;
    }
    public static void imprimirDados(String nome,int idade,String email){

        System.out.println("Nome: " + nome + "\n" + "Idade: " + idade + "\n" + "Email: " + email);
    } 


}
