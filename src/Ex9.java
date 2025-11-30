import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrizA = new int[3][3];
        int[][] matrizOposta = new int[3][3];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();

                matrizOposta[i][j] = matrizA[i][j] * -1;
            }
        }

        System.out.println("\n Matriz oposta");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizOposta[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}