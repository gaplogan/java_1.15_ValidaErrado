import java.util.Scanner;

public class ValidaErrado {
    public static void main(String[] args) throws Exception {
        // Para utilizar entrada de dados
        Scanner entrada = new Scanner(System.in);

        //Declaração de variáveis
        double num, raiz;

        //{entrada de dados}
        System.out.print("Digite um número positivo: ");
        num = entrada.nextDouble();

        // Validação dos dados (FORMA ERRADA)
        if (num < 0) //ISTO NÃO ADIANTA. O FLUXO DO PROGRAMA CONTINUARÁ!! 
        {
            System.out.print("Valor Inválido");
        }

        System.out.println(); // Pular linha
        System.out.println(); // Pular linha

        //{Processamento: Tenta extrair a raiz quadrada do número lido}
        raiz = Math.sqrt(num); //AQUI SERÁ GERADO UM ERRO SE "Num" FOR NEGATIVO !!!

        System.out.println("Raiz quadrada de " + num + ": " + raiz);

        entrada.close();
    }
}
