import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehDiagonal = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != j) {
                    if (matriz[i][j] != 0) {
                        ehDiagonal = false;
                        break;
                    }
                }
            }
            if (!ehDiagonal) break;
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        if (ehDiagonal) {
            System.out.println("é uma Matriz Diagonal.");
        } else {
            System.out.println("NÃO é uma Matriz Diagonal.");
        }
        sc.close();
    }
}