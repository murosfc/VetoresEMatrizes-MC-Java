// Aluno: FELIPE CELESTINO MUROS
/*
Considere um vetor com 100 números lidos pelo teclado.
Faça um algoritmo para ler pelo teclado (na função main) um número inteiro n (1 ≤ n ≤ 100) e imprimir todos os números que aparecem no vetor
        exatamente n vezes. Caso nenhum número apareça exatamente n vezes no vetor, esta informação deve ser
        impressa. Crie e utilize dois procedimentos: uma para preencher o vetor e outro para imprimir o que se pede.
        Exemplo com um vetor de 10 números e n = 2:
        Vetor: {3, 1, 9, 8, 3, 10, 1, 5, 9, 1}
        Números que aparecem exatamente 2 vezes: 3, 9
        */

#include <stdio.h>
#include <stdbool.h>

void fillVet(int *vet, int TAM)
{
    for (int i = 0; i < TAM; i++)
    {
        printf("Digite o valor da posicao %d: ", i);
        scanf("%d", &vet[i]);
    }
}

void print(int vet[], int TAM, int n)
{
    bool found = false, isFirst = true;
    int numbersFound[TAM];
    int vectorSize = 0;

    for (int i = 0; i < TAM - 1; i++)
    {
        int count = 1;
        for (int j = 0; j < TAM; j++)
        {
            if (j > i && vet[i] == vet[j])
            {
                count++;
            }
            if (j < i && vet[i] == vet[j])
            {
                j = TAM; // break loop
            }
        }
        if (count == n)
        {
            numbersFound[vectorSize] = vet[i];
            vectorSize++;
            found = true;
        }
    }
    if (found)
    {
        printf("\nNúmeros que aparecem exatamente %d vezes: ", n);
        for (int i = 0; i < vectorSize; i++)
            if (i == vectorSize - 1)
                printf("%d", numbersFound[i]);
            else
                printf("%d, ", numbersFound[i]);
    }
    else
    {
        printf("\nNenhum número aparece exatamente %d vezes.", n);
    }
}

int main()
{
    int TAM = 100;
    int vet[TAM];
    int n;

    printf("Digite o valor de n: ");
    scanf("%d", &n);

    fillVet(vet, TAM);

    print(vet, TAM, n);

    return 0;
}
