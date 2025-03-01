public class App {
    public static void main(String[] args) throws Exception {
        
        //Declaração das variáveis        
        
        int iValor = 1; 
        int iValor2 = 1;
        double dvalor3 = 10.2;
        double dvalor4 = 15.8;

        int resultado= iValor + iValor2;
        double dtotal = dvalor3 + dvalor4;


        //Impressão dos valores

        System.out.println("O resultado da soma é de : " + dtotal);
        
        System.out.println("O resultado da soma é de : " + resultado);

        resultado = iValor - iValor2;
        System.out.println("O resultado da subtrão é de : " + resultado);

        resultado = iValor * iValor2;
        System.out.println("O resultado da multiplicação é de : " + resultado);

        resultado = iValor / iValor2;
        System.out.println("O resultado da divisão é de : " + resultado);



        //Looping para contar a soma de 2 a 10
        boolean ativador = true;
        while (ativador) {
            if(resultado != 11){
                System.out.println("O resultado atual é de : " + resultado);
                resultado++;
            }else{
                ativador = false;
            }
        }
    }
}
