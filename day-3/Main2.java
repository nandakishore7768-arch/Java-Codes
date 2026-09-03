class Calc{
    int x;
    int y;
    Calc(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int add(){
        return this.x + this.y;
    }

    public int sub(){
        return this.x - this.y;
    }
}

public class Main2{
    public static void main(String[] args){
        Calc c = new Calc(5,3);
        System.out.println(c.add());
        System.out.println(c.sub());
    }
}