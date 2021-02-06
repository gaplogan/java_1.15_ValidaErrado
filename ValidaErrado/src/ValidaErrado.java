import java.util.Scanner;

public class ValidaErrado {
    public static void main(String[] args) throws Exception {
        // Para utilizar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declara��o de vari�veis
        double num, raiz;

        //{entrada de dados}
        System.out.print("Digite um n�mero positivo: ");
        num = entrada.nextDouble();

        // Valida��o dos dados (FORMA ERRADA)
        if (num < 0) //ISTO N�O ADIANTA. O FLUXO DO PROGRAMA CONTINUAR�!! 
        {
            System.out.print("Valor Inv�lido");
        }

        System.out.println(); // Pular linha
        System.out.println(); // Pular linha

        //{Processamento: Tenta extrair a raiz quadrada do n�mero lido}
        raiz = Math.sqrt(num); //AQUI SER� GERADO UM ERRO SE "Num" FOR NEGATIVO !!!

        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        entrada.close();
    }
}
