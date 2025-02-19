
package cf2;
import java.util.Scanner;
import java.util.Arrays;
public class fiboncimethod2 {
     public int fibonaci(int n) {
         if (n < 0 ) {
         System.out.println("Vui lòng nhập số lớn hơn 0.");
         return  -1 ;
        }
         else  if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        else {
            int f0 =  0 ;  int f1 = 1 ; int fn = 0  ;
            for(int i  = 2 ; i <=n ; i++){
                f0 = f1 ;
                fn  = f0 + f1 ; 
                fn = f0 ; 
                
            }
            return fn;
        }
    }

    public static void main(String[] args) {
      fiboncimethod1 fb = new fiboncimethod1();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so fibonaci thu n :");
        int n = s.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(fb.fibonaci(i)+" ");
        }
    }
}
