import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matriz = new int[3][3];
        int qtdZero = 0;

        System.out.println("Informe os valores da matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] == 0) {
                    qtdZero++;
                }
            }
        }

        System.out.println("Total de elementos iguais a zero: " + qtdZero);
        System.out.println("Matriz com os valores informados");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        sc.close();
    }
}