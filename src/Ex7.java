import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int somaTotal = 0;

        System.out.println("Informe os valores da matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                somaTotal += matriz[i][j];
            }
        }

        System.out.println("Soma das Linhas");
        for (int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da Linha " + (i + 1) + ": " + somaLinha);
        }
        System.out.println();

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Soma de TODOS os elementos: " + somaTotal);

        sc.close();
    }
}