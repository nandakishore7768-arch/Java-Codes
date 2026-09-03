public class Main2{
    public static void main(String[] args){
        int i = 9;
        int j = 0;

        try{
            System.out.println(i / j);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program terminated");
    }
}