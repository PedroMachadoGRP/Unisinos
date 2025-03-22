import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        Scanner dados = new Scanner(System.in);

        /* 
        int idade = 18;
        double saldoCC = 75000;

        //Se jose for maior de 18 anos e o saldo conta corrente for maior que 80000 compra o carro
    if(idade >= 18 && saldoCC >= 80000){
        System.out.println("Joãozinho pode comprar um carro e tirar carteira"); 
        System.out.println("Ou podera casar com maria e comprar um fogão");
    }else if(idade >= 18 && saldoCC < 80000){
        System.out.println("Joaozinho só pode tirar a carteira");
    }

    */
        /* 
    try {
        System.out.println("Digite a sua idade");
        int idade = dados.nextInt();

        if(idade == 0){
            System.out.println("Idade invalida");

        }else if(idade > 0 && idade <= 18){
          System.out.println("Idade válida mas menor de 18 anos");
            System.out.println("Não é responsavel pelos próprios atos");

        }else{
            System.out.println("Idade válida e maior de idade");
            System.out.println("É responsavel pelos proprios atos");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    */


        
        System.out.println("Digite um número");
        int iValor = dados.nextInt();

        System.out.println("Digite um segundo número");
        int iValor2 = dados.nextInt();

        int soma = iValor + iValor2;
        int subtracao = iValor - iValor2;
        int divisao = iValor * iValor2;
        int multiplicacao = iValor / iValor2;

        if(soma == 2){
            System.out.println("Sua soma é igual  a 2 ");

        }else if(subtracao < 0  ){
            System.out.println("Sua subtração é  menor que 0 ");

        }else if (divisao == 0 ) {
            System.out.println("Sua divisão é igual  que 0 ");

        }else if(multiplicacao <= 100 ){
            System.out.println("Sua multiplicação é maior que 100");

        }else{
            System.out.println("A combinação não foi encontrada");
            
        }
        


        

         /*Atividade Dias-semana
        System.out.println("Digite o dia atual da semana");
        int pergunta = dados.nextInt();


        if(pergunta >= 8){
            System.out.println("Esse número não é permitido,pois não é nenhum dia da semana");
        }
        switch (pergunta) {
            case 1:
            System.out.println("Hoje é segunda-feira");

            break;

            case 2:
            System.out.println("Hoje é terça-feira");
            
            break;
                        
            case 3:
            System.out.println("Hoje é quarta-feira");
            
            break;
                        
            case 4:
            System.out.println("Hoje é quinta-feira");
            
            break;
                        
            case 5:
            System.out.println("Hoje é sexta-feira");
            
            break;
                        
            case 6:
            System.out.println("Hoje é sabado");
            
            break;
                        
            case 7:
            System.out.println("Hoje é domingo");
            
            break;
            
            default:
            System.out.println("Esse dia da semana é invalido");
                break;
        }*/


    }
}
