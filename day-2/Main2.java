public class Main2{
    public static void main(String[] args){
        int x = 13;
        int y = 13;
        int z = 10;

        if(x >= y && x >= z){
            System.out.println(x);
        }

        else if (y >= x && y >= z){
            System.out.println(y);
        }

        else if(z >= x && z >= y){
            System.out.println(z);
        }
    }
}