import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Ejercicio1_MapaCiudad {

    public char[][] ciudad = {
            {' ', ' ', ' ', ' ', ' ', '1', ' ', ' '},
            {' ', '1', '1', ' ', '1', '1', ' ', '1'},
            {' ', ' ', '1', ' ', ' ', ' ', ' ', ' '},
            {'1', ' ', ' ', ' ', ' ', '1', '1', '1'},
            {'1', ' ', '1', '1', ' ', '1', '1', ' '},
            {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
            {'1', ' ', '1', ' ', '1', '1', ' ', '1'}
    };


    public static void main(String[] args) {

        Ejercicio1_MapaCiudad c = new Ejercicio1_MapaCiudad();
        c.ciudad[5][7] = 'X';
        c.resuelve(0, 0);
        System.out.println(c.imprimirLaberinto());
    }

    public void resuelve(int x, int y) {
        if (paso(x, y)) {
            ciudad[x][y] = 'S';
        }
    }

    private boolean paso(int x, int y) {

        if (x < 0 || y < 0 || x >= ciudad.length || y >= ciudad[0].length) {
            return false;
        }

        if (ciudad[x][y] == 'X') {
            System.out.println(imprimirLaberinto());
            return false;
        }

        if (ciudad[x][y] == '1' || ciudad[x][y] == '0' || ciudad[x][y] == 'F') {
            return false;
        }

        ciudad[x][y] = '0';

        boolean resultado;

        resultado = paso(x,y+1);
        if (resultado)return true;
        resultado = paso(x-1,y);
        if (resultado)return true;
        resultado = paso(x,y-1);
        if (resultado)return true;
        resultado = paso(x+1,y);
        if (resultado)return true;


        ciudad[x][y] = 'F';

        ciudad[x][y] = ' ';

        return false;
    }

    private String imprimirLaberinto() {
        String salida = "";
        for (int x=0; x<ciudad.length; x++) {
            for (int y=0; y<ciudad[x].length; y++) {
                salida += ciudad[x][y] + " ";
            }
            salida += "\n";
        }
        return salida;
    }

}