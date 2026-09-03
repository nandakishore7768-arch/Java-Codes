@FunctionalInterface

interface A{
    public int add(int a, int b);
}

public class Main{
    public static void main(String[] args){
        A obj = (int a, int b) -> {
            return a + b;
        };

        A obj1 = (int a, int b) -> a + b;
        int result = obj.add(5,3);
        System.out.println(result);

        System.out.println(obj1.add(12,13));
    }
}