import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matriz = new int[2][4];

        System.out.println("Insira os valores da matriz");
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 4; j ++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matriz informada: ");
        for (int i = 0; i < 2; i ++){
            for (int j = 0; j < 4; j ++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
