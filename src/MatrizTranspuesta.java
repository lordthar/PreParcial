public class MatrizTranspuesta {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};

        ImprimirMatriz(matriz,0,0);
        ImprimirMatriz(trasponerMatriz(matriz,0,0),0,0);
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
    public static int ImprimirMatriz(int[][] matriz, int i , int j) {
        int c=0;
        //recorre las filas
       if(i< matriz.length) {
           //recorre las columnas
            if(j< matriz.length) {
                // cada iteracion se le suma la matriz a la constante
                System.out.print(matriz[i][j] + " ");
                c +=ImprimirMatriz(matriz,i,j+1);
                //
            }else{
                j=0;
                System.out.println();
                c+= ImprimirMatriz(matriz,i+1,j);
            }
        }
        return c;
    }
}
