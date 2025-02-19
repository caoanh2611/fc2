package cf2;

import java.util.Scanner;

public class fiboncimethod1 {

    public int fibonaci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }

    public static void main(String[] args) {
      fiboncimethod1 fb = new fiboncimethod1();
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap so fibonaci thu n :");
        int n = s.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.print(fb.fibonaci(i)+" ");
        }
    }
}
