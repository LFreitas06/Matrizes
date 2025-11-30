import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehTriangularSup = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i > j) {
                    if (matriz[i][j] != 0) {
                        ehTriangularSup = false;
                        break;
                    }
                }
            }
            if (!ehTriangularSup) break;
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (ehTriangularSup) {
            System.out.println("SIM, é Triangular Superior!");
        } else {
            System.out.println("NÃO é Triangular Superior.");
        }
        sc.close();
    }
}