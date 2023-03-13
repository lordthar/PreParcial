
public class Primera {
    public static void main(String[] args) {
        try{
            int a = 4;
            int b = 2;
            int c= a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("waseish");
        }catch (Exception e){
            System.out.println("ashe");
        } finally{
            System.out.println("aqui estoy");
        }
    }
}
