public class Main2{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("Hello World");
        System.out.println(sb.capacity());
        sb.append("String");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0, "Java");
        System.out.println(sb);
    }
}