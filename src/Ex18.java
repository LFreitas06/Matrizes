import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];

        System.out.println("Informe os valores da matriz ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                transposta[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[j][i] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}