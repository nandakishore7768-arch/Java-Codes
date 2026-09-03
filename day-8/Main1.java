interface A{
    public void show();
    public void config();
}

interface X{
    public void run();
}

class B implements A, X{

    public void show(){
        System.out.println("Inside show method");
    }

    public void config(){
        System.out.println("Inside config method");
    }

    public void run(){
        System.out.println("Inside Run method");
    }
}

public class Main1{
    public static void main(String[] args){
        B obj = new B();
        obj.show();
        obj.config();
        obj.run();
    }
}