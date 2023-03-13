public class MatrizTranspuesta {
    public static void main(String[] args) {

        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};

        ImprimirMatriz(matriz);
        ImprimirMatriz(trasponerMatriz(matriz,0,0));
    }

    public static int[][] trasponerMatriz(int[][] matriz, int i, int j) {

        int[][] matriztraspuesta = new int[matriz[0].length][matriz.length];

        if( j < matriz[0].length) {
            if( i < matriz.length) {
                matriztraspuesta = trasponerMatriz(matriz, i+1,j);
                matriztraspuesta[j][i] = matriz[i][j];
            }
            else {
                i=0;
                matriztraspuesta = trasponerMatriz(matriz, i, j+1);
            }
        }
        return matriztraspuesta;
    }
    public static void ImprimirMatriz(int[][] matriz) {

        // Recorre cada fila de la matriz
        for (int i = 0; i < matriz.length; i++) {
            // Recorre cada columna de la fila
            for (int j = 0; j < matriz[i].length; j++) {
                // Imprime el elemento en la posición i, j de la matriz
                System.out.print(matriz[i][j] + " ");
            }
            // Salta una línea después de imprimir la fila
            System.out.println();
        }

    }
}
