enum StatusCodes{
    Failed(-1), Pending(1), Success(0);

    private int code;

    private StatusCodes(int price){
        this.code = price;
    }

    public int getPrice(){
        return this.code;
    }
}

public class Main3{
    public static void main(String[] args){
        StatusCodes s = StatusCodes.Failed;

        System.out.println(s.getPrice());
    }
}

