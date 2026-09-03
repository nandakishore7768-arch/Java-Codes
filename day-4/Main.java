import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int arr[][] = new int [3][];
        Scanner sc = new Scanner(System.in);

        arr[0] = new int[4];
        arr[1] = new int[3];
        arr[2] = new int[5];

        for(int i = 0; i <  arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int x[]: arr){
            for(int y: x){
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}