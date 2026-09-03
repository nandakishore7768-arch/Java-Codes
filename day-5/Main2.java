class Human{
    private int age;
    String name;

    Human(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void set_age(int age){
        this.age = age;
    }

    public int get_age(){
        return age;
    }

    public void show(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

public class Main2{
    public static void main(String[] args){
        Human new_human = new Human("new_human", 12);
        new_human.show();
        new_human.set_age(24);
        new_human.show();
        new_human.age = 20;
        new_human.show();
    }
}