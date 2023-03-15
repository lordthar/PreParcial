public class CiudadLaberinto {

    int c=0;
    public char [][] ciudad={
            {' ', ' ', ' ', ' ', ' ', '1', ' ', ' ', },
            {' ', '1', '1', ' ', '1', '1', ' ', '1', },
            {' ', ' ', '1', ' ', ' ', ' ', ' ', ' ', },
            {'1', ' ', ' ', ' ', ' ', '1', '1', '1', },
            {'1', ' ', '1', '1', ' ', '1', '1', ' ', },
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', },
            {'1', ' ', '1', ' ', '1', '1', ' ', '1', },

    };

    public static void main(String[] args) {
        CiudadLaberinto n = new CiudadLaberinto();
        n.ciudad[5][7]= 'S';
        n.resolver(0,0);
        System.out.println(n.imprecionCiudad("", 0,0));
    }

    public void resolver(int i, int j){
        if(seguimiento(i,j)){
            ciudad[i][j]= 'E';
        }
    }

   private boolean seguimiento(int i, int j) {
       if (j >= 0 && i >= 0 && i < ciudad.length && j < ciudad[0].length) {
           if (ciudad[i][j] == 'S') {
               System.out.println(imprecionCiudad("", 0 ,0 ));
               return true;
           }
           if (ciudad[i][j] == '1' || ciudad[i][j] == '0' || ciudad[i][j] == 'f') {
               return false;
           }

           ciudad[i][j] = '0';

           boolean resultado;

           resultado = seguimiento(i, j + 1);
           if (resultado) return true;

           resultado = seguimiento(i - 1, j);
           if (resultado) return true;

           resultado = seguimiento(i, j - 1);
           if (resultado) return true;

           resultado = seguimiento(i + 1, j);
           if (resultado) return true;

           ciudad[i][j] = 'f';
           return false;
       }
       return false;
   }

    private String imprecionCiudad(String salida, int i, int j){
        String b= "";
        if(i<ciudad.length){
            if(j< ciudad[0].length){
                b+=ciudad[i][j] + " ";
                salida +=b;
                b = imprecionCiudad(salida,i ,j+1);
            }
            else if (i< ciudad.length-1){
                j=0;
                salida += "\n";
                b= imprecionCiudad(salida , i+1, j);
            }else{
                return (salida);
            }
        }
        return b;
    }

}
