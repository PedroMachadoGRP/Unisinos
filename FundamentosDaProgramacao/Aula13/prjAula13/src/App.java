import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        //String frase = "João e Maria casaram no final do ano passado";
        
        //System.out.println(retornadorChar(frase));
        //sigla("Pedro Machado da Silva");
        //criarArquivo();
    }

    public static void ImparPar() {
        int[] array = { 10, 25, 30, 45, 50, 65, 70, 85, 90, 105 };
        int impar = 0;
        int par = 0;
        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                somaPar += array[i];
                par++;
            } else {
                somaImpar += array[i];
                impar++;
            }
        }
        System.out.println("A quantidade de número impares é: " + impar);
        System.out.println("A quantidade de número pares é: " + par);
        System.out.println(somaPar);
        System.out.println(somaImpar);

    }

    public static void diagonaMatriz(){
        
        int[][] matriz = {
            { 10, 2, 3, 40 },
            { 1, 20, 30, 4 },
            { 1, 20, 30, 4 },
            { 10, 2, 3, 40 } };

    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
            if (i == j) {
                // System.out.println("A diagonal principal da sua matriz é: " + matriz[i][j]);
            }
        }
    }

    int n = matriz.length;
    for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][n - 1 - i]);
    }

    }

    public static String retornadorChar (String frase){
        String retorno = "";
        String fraseMaiuscula = frase.toUpperCase();
        String fraseMinuscula = frase.toLowerCase();

        String fraseConcat = frase.concat(" e não tiveram filhos ainda");
        retorno = "Total de caracteres é: ";

            return retorno + fraseConcat.length() ;


    } 


    public static void sigla(String nomeCompleto){
        String[] sigla = nomeCompleto.split(" ");

        String iniciais = "";
        for (String string : sigla) {
            iniciais += string.charAt(0);
        }
        System.out.println(iniciais);
    }

    public static void criarArquivo() throws IOException{
        criarArquivoBase();
        BufferedReader buffRead = new BufferedReader(new FileReader("C:\\\\Users\\\\PEDROSILVA29\\\\Desktop\\\\FundamentosDaProgramacao\\\\Aula13\\\\prjAula13\\\\test.txt"));
        String linha = buffRead.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = buffRead.readLine();
        }
        buffRead.close();
    }

    public static void criarArquivoBase() throws IOException{
        BufferedWriter buffwrite = new BufferedWriter(new FileWriter("C:\\Users\\PEDROSILVA29\\Desktop\\FundamentosDaProgramacao\\Aula13\\prjAula13"));
        
        buffwrite.append("Pedro" + "\n");
        buffwrite.append("Alguel" + "\n");
        buffwrite.append("Alguem dois" + "\n");
    }
}
