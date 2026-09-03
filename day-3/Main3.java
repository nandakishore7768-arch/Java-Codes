class Calculator{
    public int add(int x, int y, int z){
        return x + y + z;
    }

    public int add(int x, int y){
        return x + y;
    }
}

public class Main3{
    public static void main(String[] args){
        Calculator obj = new Calculator();
        System.out.println(obj.add(5, 6));
        System.out.println(obj.add(5, 6, 11));
    }
}