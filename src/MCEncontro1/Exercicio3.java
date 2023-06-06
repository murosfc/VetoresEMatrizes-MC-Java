package MCEncontro1;

//Aluno: FELIPE CELESTINO MUROS
/*
 *Faça um algoritmo para verificar se uma dada matriz M10×10, gerada aleatoriamente com números de 0 até
49, é uma matriz identidade. Crie e utilize um procedimento para a geração da matriz e uma função para a
verificação. De acordo com o retorno da função deve-se imprimir na função main: MATRIZ IDENTIDADE ou
MATRIZ NAO E IDENTIDADE.
 */

public class Exercicio3 {

    public static void main(String[] args) {
        int MATRIX_SIZE = 10;
        int[][] matrix = new int[MATRIX_SIZE][MATRIX_SIZE];
        Exercicio3 exercicio = new Exercicio3();

        exercicio.fillMatrix(matrix);
        
        if (exercicio.isIdentity(matrix)) {
            System.out.println("MATRIZ IDENTIDADE");
        } else {
            System.out.println("MATRIZ NAO E IDENTIDADE");
        }
    }

    public Exercicio3() {
    }

    public void fillMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {            
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 50);
            }
        }
    }

    public boolean isIdentity(int[][] matrix) {
        boolean isIdentity = true;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] != 1) {
                isIdentity = false;
            }
        }
        return isIdentity;
    }
    
}
