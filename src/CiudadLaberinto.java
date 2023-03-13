public class CiudadLaberinto {
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
        System.out.println(n.imprecionCiudad());
    }

    public void resolver(int i, int j){
        if(seguimiento(i,j)){
            ciudad[i][j]= 'E';
        }
    }

   private boolean seguimiento(int i, int j){

        if(ciudad[i][j]=='S'){
            return true;
        }
        if(ciudad[i][j] == '1' || ciudad[i][j]=='*' || ciudad[i][j]=='0'){
            return false;
        }

        ciudad[i][j]='*';

        boolean resultado;

        resultado = seguimiento(i,j+1);
        if(resultado) return true;

        resultado = seguimiento(i-1,j);
        if(resultado) return true;

        resultado = seguimiento(i,j-1);
        if(resultado) return true;

        resultado =seguimiento(i+1,j);
        if(resultado) return true;

        ciudad[i][j]= '0';
        return false;
    }

    private String imprecionCiudad(){
        String salida= "";
        for (int i = 0;i< ciudad.length; i++) {
            for (int j = 0;j< ciudad[i].length; j++) {
                salida+= ciudad[i][j] + " ";
            }
            salida+= "\n";
        }
        return salida;

    }

}
