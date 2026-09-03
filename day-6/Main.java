class A{
    public void Show(){
        System.out.println("In A Show");
    }

    public void Config(){
        System.out.println("In A config");
    }
}

class B extends A{
    public void Show(){
        System.out.println("In B show");
    }

    public void Config(){
        System.out.println("In B Config");
    }
}

public class Main{
    public static void main(String[] args){
        B b = new B();
        b.Show();
        b.Config();

        A a = new A();
        a.Show();
        a.Config();
    }
}