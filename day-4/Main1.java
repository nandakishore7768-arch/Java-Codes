public class Main1{
    public static void print(String str){
        System.out.println(str);
        System.out.println(str.hashCode());
        System.out.println(str.charAt(3));
        System.out.println("Hello ".concat(str));
        System.out.println();
    }
    public static void main(String[] args){
        String str = new String("Nanda Kishore");
        print(str);

        String str_ = "K Nanda Kishore";
        print(str_);
    }
}