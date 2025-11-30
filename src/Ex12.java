import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehIdentidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (i == j) {
                    if (matriz[i][j] != 1) {
                        ehIdentidade = false;
                        break;
                    }
                }
                else {
                    if (matriz[i][j] != 0) {
                        ehIdentidade = false;
                        break;
                    }
                }
            }
            if (!ehIdentidade) break;
        }

        if (ehIdentidade) {
            System.out.println("É uma Matriz IDENTIDADE!");
        } else {
            System.out.println("NÃO é uma Matriz Identidade.");
        }

        System.out.println("Matriz informada: ");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}