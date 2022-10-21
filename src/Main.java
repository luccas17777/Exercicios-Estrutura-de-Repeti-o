import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LiberarAcesso();
        CordenadasXY();
        ProdutosPostoGasolina();
        LerNumerosImpares();
        LerIntervalo();
        CasosDeTestes();
    }
    public static void LiberarAcesso(){
        /*  Exercicio while
            1) Liberar acesso atraves de senha    */

        Scanner in = new Scanner(System.in);
        System.out.print("Digite a senha: ");
        int senha = in.nextInt();
        while(senha != 2002){
            System.out.println("Acesso negado");
            System.out.print("Digite a senha novamente: ");
            senha = in.nextInt();
       }
       System.out.println("Acesso liberado");
    }

    public static void CordenadasXY(){
        /* Exercicio while
           2) Cordenadas X e Y
         */
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a cordenada do X: ");
        int x = in.nextInt();
        System.out.print("Digite a cordenada do Y: ");
        int y = in.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("terceiro");
            }
            else {
                System.out.println("quarto");
            }
            System.out.print("Digite a cordenada do X: ");
            x = in.nextInt();
            System.out.print("Digite a cordenada do Y: ");
            y = in.nextInt();
        }
    }

    public static void ProdutosPostoGasolina(){
        /*  Exercicio while
            3) Dizer quantos produtos foram selecionados dos postos de gasolina   */
        Scanner in = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0, entrada;

        System.out.println("Digite o código: \n 1-Álcool \n 2-Gasolina \n 3-Diesel \n 4-Fim");
        entrada = in.nextInt();
        while(entrada != 4){
            switch (entrada){
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
                default:
                    System.out.println("Código inválido!! Digite novamente o código");
            }
            System.out.println("Digite o código: \n 1-Álcool \n 2-Gasolina \n 3-Diesel \n 4-Fim");
            entrada = in.nextInt();
        }
        System.out.println("Muito Obrigado");
        System.out.println("Álcool "+alcool);
        System.out.println("Gasolina "+gasolina);
        System.out.println("Diesel "+diesel);

    }

    public static void LerNumerosImpares(){
        /*  Exercicio for
            4) ler um numero entre 1 e 1000 e mostrar os valores impares dele.   */
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor entre 1 e 1000: ");
        int x = in.nextInt();
        for (int i =0; i <= x; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }

    }

    public  static void LerIntervalo(){
        /*  Exercicio for
            5) Ler um valor para ser a quantidade de numeros digitados e apresentar os valores entre 10 e 20.   */
        Scanner in = new Scanner(System.in);

        int dentro =0, fora=0;
        System.out.print("Digite a quantidade de números que serão digitados: ");
        int n = in.nextInt();
        int diminuir = n;
        for (int i = 0; i < n; i++){
            System.out.print("Digite números: (faltam "+ diminuir-- +") ");
            double numeroDigitado = in.nextDouble();
            if (numeroDigitado >= 10 && numeroDigitado <= 20)
                dentro++;
            else
                fora++;
        }
        System.out.println(dentro+" in \n"+ fora +" out");
    }

    public static void CasosDeTestes(){
        /*  Exercicio for
            6) Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
            de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
            conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
            peso 5   */

        Scanner in = new Scanner(System.in);
        System.out.println("Digite a quantidade de casos");
        int n = in.nextInt();

        for (int i=0; i<n; i++) {
            System.out.print("Digite o primeiro valor");
            double a = in.nextDouble();
            System.out.print("Digite o segundo valor");
            double b = in.nextDouble();
            System.out.print("Digite o terceiro valor");
            double c = in.nextDouble();

            double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("%.1f%n", media);
        }
    }
}