import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4]; // Ordem 4

        System.out.println("Informe os valores da matriz");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehTriangularInf = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i < j) {
                    if (matriz[i][j] != 0) {
                        ehTriangularInf = false;
                        break;
                    }
                }
            }
            if (!ehTriangularInf) break;
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        if (ehTriangularInf) {
            System.out.println("A matriz É TRIANGULAR INFERIOR.");
        } else {
            System.out.println("A matriz NÃO é Triangular Inferior.");
        }

        sc.close();
    }
}