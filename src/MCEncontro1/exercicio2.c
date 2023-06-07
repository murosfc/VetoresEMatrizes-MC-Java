
//Aluno: FELIPE CELESTINO MUROS
/*
Considere um vetor com 50 números inteiros lidos pelo teclado. Faça um algoritmo que imprima o segundo
maior número presente no vetor. Crie e utilize dois procedimentos: uma para preencher o vetor e outro
para imprimir o segundo maior número.
Obs. 1: Não é permitido utilizar qualquer estrutura de dados auxiliar.
Obs. 2: Não é permitido ordenar o vetor.
 */

#include <stdio.h>

void fillVet(int *vet, int TAM)
{
    for (int i = 0; i < TAM; i++)
    {
        printf("Digite o valor da posicao %d: ", i);
        scanf("%d", &vet[i]);
    }
}

void printSecondBigger(int vet[], int TAM)
{
    int bigger = vet[0], secondBigger = vet[0];
    for (int i = 0; i < TAM; i++)
    {
        if (vet[i] > bigger)
        {
            secondBigger = bigger;
            bigger = vet[i];
        }
        else if (vet[i] > secondBigger && vet[i] != bigger)
        {
            secondBigger = vet[i];
        }
    }
    printf("\nO segundo maior numero eh: %d", secondBigger);
}

int main()
{
    int TAM = 50;
    int vet[TAM];
    fillVet(vet, TAM);
    printSecondBigger(vet, TAM);
    return 0;
}