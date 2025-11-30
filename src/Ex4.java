import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Informe os valores da matriz");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Qual elemento X voce deseja procurar?");
        int x = sc.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (matriz[i][j] == x) {
                    System.out.println("Encontrado na Linha " + (i + 1) + ", Coluna " + (j + 1));
                    encontrou = true;
                }

            }
        }

        if (!encontrou) {
            System.out.println("Mensagem: não encontrado");
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