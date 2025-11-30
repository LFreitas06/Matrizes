import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehNula = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] != 0) {
                    ehNula = false;
                    break;
                }
            }
            if (!ehNula) {
                break;
            }
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        if (ehNula) {
            System.out.println("A matriz É NULA.");
        } else {
            System.out.println("A matriz NÃO É NULA.");
        }

        sc.close();
    }
}