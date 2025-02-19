
package cf2;
import java.util.Scanner;
import java.util.Arrays;
public class ssarr { 
    public static void main(String[] args) {
    Scanner s =  new  Scanner(System.in);
    System.out.print("Enter n numbers: ");
    int n  = s.nextInt();
    int[] number = new  int[n];
    int max = number[0];
        for (int i = 0; i < number.length; i++) {
            number[i]=i;
        }
         for (int i = 0; i < number.length; i++) {
           if(i > max){
               max = i ; 
           }
        }
         System.out.println("the largest number: " +max);
}
}
