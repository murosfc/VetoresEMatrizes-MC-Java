package MCEncontro1;

import java.util.Scanner;
//Aluno: FELIPE CELESTINO MUROS
/*
 Faça um algoritmo para, primeiro, ler pelo teclado todos os 20 números naturais (maiores do que 1) da matriz
M4×5 e, em seguida, imprimir na tela a quantidade de números primos presentes em M. Crie e utilize dois
procedimentos: um para ler a matriz e outro para calcular e imprimir a quantidade de números primos. Crie e
utilize também uma função que retorna 1, se um número natural for primo, ou retorna 0, caso contrário.
 */

public class Exercicio4 {

    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        Exercicio4 exercicio = new Exercicio4();

        exercicio.fillMatrix(matrix);
        exercicio.print(matrix);
    }

    public Exercicio4() {
    }

    public void fillMatrix(int[][] matrix) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Digite os valores da linha " + (i + 1) + " da matriz");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    public void print(int[][] matrix) {
        int primeNumbers = 0;
        for (int i = 0; i < matrix.length; i++) {
            System.out.print("Linha " + (i + 1) + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + ", ");
                if (isPrime(matrix[i][j]) == 1) {
                    primeNumbers++;
                }
            }
            System.out.println();
        }
        System.out.println("A matriz possui " + primeNumbers + " números primos");
    }

    public int isPrime(int number) {
        if (number <= 1) {
            return 0;
        }
        for (int i = 2; i <= number / 2 + 1; i++) {
            if (number % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    
}
