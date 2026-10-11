import java.util.Scanner;
public class array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount of numbers you would like to put in the array: ");
        int amount=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        System.out.println("enter a number in the array: ");
        for(int i=1; i<=amount; i++){
            int val=sc.nextInt();
            if(val>max){
                val=max;
            }
            if(val<min){
                val=min;
            }
        }
        int span=max-min;
        System.out.println("span of array: "+span);
    }
}