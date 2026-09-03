public class Main{
    public static void main(String[] args){
        int x1 = 0b101;
        System.out.println(x1);

        int x2 = 0x7ff;
        System.out.println(x2);

        double x3 = 12e10;
        System.out.println(x3);

        byte b1 = 127;
        int i1 = 257;

        b1 = (byte)i1;
        System.out.println(i1);
        System.out.println(b1);

        b1 = 10;
        byte b2 = 40;
        int result = b1 * b2;
        System.out.println(result);
    }
}