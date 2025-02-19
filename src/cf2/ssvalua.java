
package cf2;

import java.util.Scanner;
        
public class ssvalua {

    public static void main(String[] args) {
        Scanner s=  new  Scanner(System.in);
        System.out.print("Enter n numbers: ");
        int n  = s.nextInt();
        int max =  0 ;
        for(int i  =  0  ;  i< n  ;  i++){
            if(i > max){
                max = i ;
            }
        }
        System.out.println("the largest number: " +max);
    }
    
}
