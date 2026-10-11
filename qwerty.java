import java.util.Scanner;
class qwerty{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the amount of numbers in the array: ");
        int amount=sc.nextInt();
        int[] array=new int[amount];
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
        System.out.println("enter the numbers in the array: "); 
        for (int i=0;i<amount;i++) {
            array[i] = sc.nextInt();
        }
        for (int i=0;i<amount/2;i++) {
            array[i] = array[-1]; 
        }
        System.out.println(Arrays.toString(array)); 
        sc.close();
    }
}