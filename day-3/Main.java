import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        for(int i = 0; i< 5; i++){
            System.out.println((i + 1) + " Hello World using for loop");
        }
        System.out.println();
        int i = 0;
        while(i < 5){
            System.out.println((i + 1) + " Hello World using while loop");
            i += 1;
        }
        System.out.println();

        i = 0;
        do{
            System.out.println((i + 1) + " Hello World using do while loop");
            i += 1;
        }while(i < 5);

        System.out.println();
    }
}