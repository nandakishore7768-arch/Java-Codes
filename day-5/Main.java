class Mobile{
    String Brand;
    int price;
    static String name;

    static {
        name = "SmartPhone";
    }

    public Mobile(String brand, int price){
        this.Brand = brand;
        this.price = price;
    }

    public void show(){
        System.out.println("Brand : " + this.Brand);
        System.out.println("price : " + this.price);
        System.out.println("name : " + Mobile.name);
    }

    public static void show1(Mobile obj){
        System.out.println("Brand : " + obj.Brand);
        System.out.println("price : " + obj.price);
        System.out.println("name : " + Mobile.name);
    }
}

public class Main{
    public static void main(String[] args) throws ClassNotFoundException
    {
        Class.forName("Mobile");
        System.out.println(Mobile.name);
        Mobile obj1 = new Mobile("Redmi", 10000);
        Mobile.show1(obj1);
    }
}