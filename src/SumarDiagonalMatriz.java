public class SumarDiagonalMatriz {
    public static void main(String[] args) {
        int[][]matriz ={{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        System.out.println(sumaDiagonal(matriz,0,0));
    }
    public static int sumaDiagonal(int[][]matriz, int i, int j){
        int suma= 0;
        if(i< matriz.length){
            if(j< matriz.length){
                suma+= matriz[i][j];
                suma+=sumaDiagonal(matriz, i+1,j+1);
            }
        }
        return suma;
    }
}
