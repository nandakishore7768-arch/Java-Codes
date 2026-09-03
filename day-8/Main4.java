@FunctionalInterface
interface A{
    public void show(int i);
}

public class Main4{
    public static void main(String[] args){
        A obj = (int i) -> {
            System.out.println("In A show" + i);
        };

        obj.show(3);
    }
}