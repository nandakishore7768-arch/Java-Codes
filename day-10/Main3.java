class MyException extends Exception{
    public MyException(String msg){
        super(msg);
    }
}

public class Main3{
    public static void main(String [] args){
        int i = 20;

        try{

            if(i == 0){
                throw new ArithmeticException("The entered value is 0... can't divide by 0");
            }

            int j = 18/i;

            if(j == 0){
                throw new MyException("The entered value is greater than 18");
            }

            System.out.println(j);

        }

        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }

        catch(MyException e){
            System.out.println(e.getMessage());
        }

        
    }
}