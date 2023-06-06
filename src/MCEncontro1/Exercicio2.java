package MCEncontro1;

import java.util.Scanner;

//Aluno: FELIPE CELESTINO MUROS
/*
Considere um vetor com 50 números inteiros lidos pelo teclado. Faça um algoritmo que imprima o segundo
maior número presente no vetor. Crie e utilize dois procedimentos: uma para preencher o vetor e outro
para imprimir o segundo maior número.
Obs. 1: Não é permitido utilizar qualquer estrutura de dados auxiliar.
Obs. 2: Não é permitido ordenar o vetor.
 */

public class Exercicio2 {

    public static void main(String[] args) {
        int VECTOR_SIZE = 10;        
        int[] vector = new int[VECTOR_SIZE];
        Exercicio2 exercicio = new Exercicio2();

        exercicio.fillVet(vector);
        exercicio.print(vector);
    }

    public Exercicio2() {
    }

    public void fillVet(int[] vector) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Digite um valor para o vetor na posição " + (i + 1));
            vector[i] = scanner.nextInt();
        }
        scanner.close();
    }

    public void print(int[] vector) {
        int secondBiggest = 0;
        int biggest = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] > biggest) {
                secondBiggest = biggest;
                biggest = vector[i];
            } else if (vector[i] > secondBiggest) {
                secondBiggest = vector[i];
            }
        }
        System.out.println("O segundo maior número do vetor é " + secondBiggest);    
    }

}
