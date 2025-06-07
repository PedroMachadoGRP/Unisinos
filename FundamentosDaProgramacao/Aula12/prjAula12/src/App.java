import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ");
        //criarArquivo();
       //imprimirArquivo();
             
    }

    public static void criarArquivo() throws IOException{
        BufferedWriter buffWriter = new BufferedWriter(new FileWriter("C:\\Users\\PEDROSILVA29\\Desktop\\FundamentosDaProgramacao\\Aula12\\ArquivoTexto.txt"));

        for(int i = 0; i <10 ; i++ ){
            buffWriter.append("Escrevendo a linha " + i + "\n");
        }
        buffWriter.close();

    }

    public static void imprimirArquivo() throws IOException {
        FileReader buffRead = new FileReader("C:\\Users\\PEDROSILVA29\\Desktop\\FundamentosDaProgramacao\\Aula12\\ArquivoTexto.t")
        String linha = buffRead.read();


        while (linha != null) {
            System.out.println(linha);
            linha = buffRead.read();
        }

        buffRead.close();
    }

    public static void imprimirArquivoCSV() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\PEDROSILVA29\\Desktop\\FundamentosDaProgramacao\\Aula12\\ArquivoTexto.csv")));
        String linha = null;
        while((linha = reader.readLine()) != null){
            String[] dadosUsuario = linha.split(",");
            System.out.println("Nome: " + dadosUsuario[0]);
            System.out.println("Sexo: " + dadosUsuario[1]);
            System.out.println("Idade: " + dadosUsuario[2]);
            System.out.println("Altura: " + dadosUsuario[3]);
            System.out.println("Peso: " + dadosUsuario[4]);
        }
        reader.close();

    }
}
