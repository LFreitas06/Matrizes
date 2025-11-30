import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[4][4];

        System.out.println("Informe os valores da matriz");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean ehSimetrica = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
            if (!ehSimetrica) break;
        }

        if (ehSimetrica) {
            System.out.println("A matriz É SIMÉTRICA.");
        } else {
            System.out.println("A matriz NÃO É SIMÉTRICA.");
        }
        System.out.println("Matriz informada: ");
        for (int i = 0; i < 4; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}