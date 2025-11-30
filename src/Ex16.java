import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println(" Informe os valores da matriz");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz transformada em triangular inferior");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}