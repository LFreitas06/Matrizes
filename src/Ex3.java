import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int maiorValor = 0;
        int linhaMaior = 0;
        int colunaMaior = 0;

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();

                if ( (i == 0 && j == 0) || (matriz[i][j] > maiorValor) ) {
                    maiorValor = matriz[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("O maior valor é: " + maiorValor);
        System.out.println("Ele está na Linha: " + (linhaMaior + 1) );
        System.out.println("Ele está na Coluna: " + (colunaMaior + 1) );

        sc.close();
    }
}