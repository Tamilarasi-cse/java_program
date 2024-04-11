import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        int sum=0;
        Scanner scan= new Scanner(System.in);
        int ar[]= new int[scan.nextInt()];
        for(int i=0; i<ar.length; i++)
        {
            ar[i]= scan.nextInt();
        }
         for(int i=0; i<ar.length; i++)
        {
            sum= sum+ ar[i];
        }
        System.out.println(sum+ " ");
    }
}