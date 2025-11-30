import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[3][3];

        System.out.println("Insira os valores da matriz");
        for (int i = 0; i < 3; i ++){
            for (int j = 0; j < 3; j ++){
                matriz[i][j] = sc.nextInt();
            }
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
