package MCEncontro1;

//Aluno: FELIPE CELESTINO MUROS
/*
Considere um vetor com 100 números lidos pelo teclado.
Faça um algoritmo para ler pelo teclado (na função main) um número inteiro n (1 ≤ n ≤ 100) e imprimir todos os números que aparecem no vetor
        exatamente n vezes. Caso nenhum número apareça exatamente n vezes no vetor, esta informação deve ser
        impressa. Crie e utilize dois procedimentos: uma para preencher o vetor e outro para imprimir o que se pede.
        Exemplo com um vetor de 10 números e n = 2:
        Vetor: {3, 1, 9, 8, 3, 10, 1, 5, 9, 1}
        Números que aparecem exatamente 2 vezes: 3, 9
        */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        int VECTOR_SIZE = 100;
        int nVezes = 0;
        int[] vector = new int[VECTOR_SIZE];
        Exercicio1 exercicio = new Exercicio1();
        Scanner scanner = new Scanner(System.in);

        while (nVezes < 1 || nVezes > 100) {
            System.out.println("Digite um número inteiro n tal que 1 ≤ n ≤ 100");
            nVezes = scanner.nextInt();
        }

        exercicio.fillVet(vector);
        exercicio.print(vector, nVezes);
        scanner.close();

    }

    public Exercicio1() {
    }

    public void fillVet(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite um valor para o vetor na posição " + (i + 1));
            vector[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void print(int[] vector, int nTimes) {
        String numbersFound = "";
        boolean found = false;

        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }

        for (int i = 0; i < vector.length - 1; i++) {
            int count = 1;
            for (int j = 0; j < vector.length; j++) {
                if (j < i && vector[i] == vector[j]) {
                    break;
                }
                if (j > i && vector[i] == vector[j]) {
                    count++;
                }
            }
            if (count == nTimes) {
                if (!numbersFound.isEmpty()) {
                    numbersFound += ", " + vector[i];
                } else {
                    numbersFound += vector[i];
                }
                found = true;
            }
        }

        if (found) {
            System.out.println("\nNúmeros que aparecem exatamente " + nTimes + " vezes: " + numbersFound);
        } else {
            System.out.println("\nNenhum número aparece exatamente " + nTimes + " vezes.");
        }
    }

}
