public class Perfecto {
    public static void main(String[] args) {

        System.out.println(numeroPerfecto(28, 1));
    }
    public static int numeroPerfecto(int numero, int divisor) {

        int sumatoria = 0;

        if (divisor < numero) {
            if (numero%divisor == 0) {
                sumatoria += divisor;
                sumatoria +=numeroPerfecto(numero, divisor+1);
            }
            else {
                sumatoria +=numeroPerfecto(numero, divisor+1);
            }
        }
        if (divisor == 1) {
            if (sumatoria == numero) {
                return sumatoria;
            }
            else {
                sumatoria = -1;
            }
        }
        return sumatoria;
    }
}
