//Aluno: FELIPE CELESTINO MUROS
/*
 Faça um algoritmo para, primeiro, ler pelo teclado todos os 20 números naturais (maiores do que 1) da matriz
M4×5 e, em seguida, imprimir na tela a quantidade de números primos presentes em M. Crie e utilize dois
procedimentos: um para ler a matriz e outro para calcular e imprimir a quantidade de números primos. Crie e
utilize também uma função que retorna 1, se um número natural for primo, ou retorna 0, caso contrário.
 */

#include <stdio.h>

#define rows 4
#define columns 5

void fillMatrix(int matrix[][columns])
{
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
        {
            printf("Digite o valor da posicao [%d][%d]: ", i, j);
            scanf("%d", &matrix[i][j]);
        }
}

int isPrime(int number)
{
    if (number == 1)
        return 0;
    for (int i = 2; i < number; i++)
        if (number % i == 0)
            return 0;
    return 1;
}

void printPrimes(int matrix[][columns])
{
    int count = 0;
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            if (isPrime(matrix[i][j]))
                count++;
    printf("\nA quantidade de numeros primos eh: %d", count);
}

int main()
{
    int matrix[rows][columns];
    fillMatrix(matrix);
    printPrimes(matrix);
    return 0;
}