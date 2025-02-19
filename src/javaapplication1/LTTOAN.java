package javaapplication1;

import java.util.*;

public class LTTOAN {

    static Scanner s = new Scanner(System.in);
    int[] a;

    void nhap() {
        System.out.println("Enter number array : ");
        int n = s.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
//            a[i]= s.nextInt();
            a[i] = (int) (Math.random() * 200) - 100;

        }
    }

    void in() {
        System.out.println("Conten array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    void chen(int x, int k) {
        int n = a.length;
        if (k < 1 || k > n) {
            System.out.println("Tb ko chen dc!");
        } else {
            int[] b = new int[n + 1];
            for (int i = 0; i < k; i++) {
                b[i] = a[i];
            }

            for (int i = n; i > k; i--) {
                b[i] = a[i - 1];
                b[k] = x;
            }
            a = b;
        }
    }

    void xoa(int k) {
        int i = 0, n = a.length;
        if (k < 0 || k > n) {
            System.out.println("Ko xoa đuoc !");
        } else {
            int[] b = new int[n - 1];
            for (i = 0; i < k - 1; i++) {
                b[i] = a[i];

            }
            for (i = k - 1; i < b.length; i++) {
                b[i] = a[i + 1];
            }
            a = b;
        }
    }

    void findmax() {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println("Max : " + max);
    }

    void findvt() {
        int vt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[vt]) {
                vt = i;
            }
        }
        System.out.println("Place max in array:  " + (vt + 1));
    }

    int demsole() {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                d++;
            }
        }
        return d;
    }

    int demso() {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                d++;
            }

        }
        return d;

    }

    void daomang() {
        int i = 0, j = a.length - 1;
        while (i < j) {
            int t = a[i];
            a[i++] = a[j];
            a[j--] = t;
        }
    }

    void xoaam() {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                k++;
            }
        }
        int j = 0;
        int[] b = new int[k];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0) {
                b[j++] = a[i];
            }
        }
        a = b;
    }

    boolean tim(int x) {
        int i, n = a.length;
        for (i = 0; i < n; i++) {
            if (a[i] == x) {
                return true;
            }
            break;
        }
        return false;

    }

    int demdoan(int x1, int x2) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= x1) && (a[i] <= x2)) {
                k++;
            }
        }
        return k;

    }

    void cap() {
        int v1 = 0, v2 = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] * a[j] > a[v1] * a[v2]) {
                    v1 = i;
                    v2 = j;
                }
            }

        }
        System.out.print(+a[v1] + " " + a[v2]);
    }

    void cap1() {
        int sum1 = 0, sum2 = 0;
        int max1 = Integer.MAX_VALUE, max2 = Integer.MAX_VALUE, min1 = Integer.MIN_VALUE, min2 = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > max1) {
                max2 = max1;
                max1 = a[i];

            } else if (a[i] > max2) {
                max2 = a[i];
            }

        }
        sum1 = max1 * max2;
        for (int i = 0; i < a.length; i++) {
            if ( a[i] > min1) {
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {
                min2 = a[i];
            }

        }
        sum2 = min1 * min2;
        if (sum2 < sum1) {
            System.out.println(+max1 + " " + max2);
        } else {
            System.out.println(+min1 + " " + min2);
        }
    }

    void cap2() {
        int i = 0, sum1 = 0, sum2 = 0, max1 = Integer.MAX_VALUE, max2 = Integer.MAX_VALUE, min1 = Integer.MIN_VALUE, min2 = Integer.MIN_VALUE;
        for (i = 0; i < a.length; i++) {
            if (a[i] < max1) {
                max1 = a[i];
            }
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] < max2 && a[i] != max1) {
                max2 = a[i];
            }
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] > min1) {
                min1 = a[i];
            }
        }
        for (i = 0; i < a.length; i++) {
            if (a[i] > min2 && a[i] != min1) {
                min2 = a[i];
            }
        }
        sum1 = max1 * max2;
        sum2 = min1 * min2;
        if (sum2 < sum1) {
            System.out.println(+max1 + " " + max2);
        } else {
            System.out.println(+min1 + " " + min2);
        }
    }

    public static void main(String[] args) {
        LTTOAN m = new LTTOAN();
        m.nhap();
        m.in();
//        m.chen(1,3);
//        m.in();
//        m.xoa(3);
//        m.in();
//        m.findmax();
//        m.findvt();
//        System.out.println("So chan : "+m.demso());
//        System.out.println("So chan : "+m.demsole());
//        m.xoaam();
//        m.in();
//        int x   ;
//        System.out.print("NHap so can tim : ");
//        x = s.nextInt();
//        if(m.tim(x)==true){
//            System.out.println(" co ! ");
//        }else{
//            System.out.println("Khong co !");
//        }
//        int x1, x2;
//        System.out.println("Nhap doan dem : ");
//        x1 = s.nextInt();
//        x2 = s.nextInt();
//        System.out.println("Dem don x1 den x2 " + m.demdoan(x1, x2));
        System.out.println("\n1");
        m.cap();
        System.out.println("\n1");
        m.cap1();
        System.out.println("\n1");
        m.cap2();
    }
}
