//Aluno: FELIPE CELESTINO MUROS
/*
 *Faça um algoritmo para verificar se uma dada matriz M10×10, gerada aleatoriamente com números de 0 até
49, é uma matriz identidade. Crie e utilize um procedimento para a geração da matriz e uma função para a
verificação. De acordo com o retorno da função deve-se imprimir na função main: MATRIZ IDENTIDADE ou
MATRIZ NAO E IDENTIDADE.
 */

#include <stdio.h>

#define rows 10
#define columns 10

void fillMatrix(int matrix[][columns])
{
    for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
            matrix[i][j] = rand() % 50;
}

void printMatrix(int matrix[][columns])
{
    printf("\n");
    for (int i = 0; i < rows; i++)
    {
        printf("|\t");
        for (int j = 0; j < columns; j++)
        {
            printf("%d\t", matrix[i][j]);
        }
        printf("|\n");
    }
}

int isIdentityMatrix(int matrix[][columns])
{
    int isIdentity = 1;
    for (int i = 0; i < rows; i++)
    {
        if (matrix[i][i] != 1)
        {
            isIdentity = 0;
            break;
        }
        for (int j = 0; j < columns; j++)
        {
            if (i != j && matrix[i][j] != 0)
            {
                isIdentity = 0;
                break;
            }
        }
    }
    return isIdentity;
}

int main(){
   
    int matrix[rows][columns];
    fillMatrix(matrix);
    printMatrix(matrix);
    if (isIdentityMatrix(matrix))
        printf("\nMATRIZ IDENTIDADE");
    else
        printf("\nMATRIZ NAO E IDENTIDADE");
    return 0;
}