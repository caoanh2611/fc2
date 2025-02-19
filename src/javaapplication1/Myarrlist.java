/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.*;

public class Myarrlist {

    int a[];

    void nhap(int n) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu : ");
        n = kb.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 100);
        }
    }

    void in() {
        System.out.println("\nNoi dung mang ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    void chenx(int x, int k) {
        int i = 0, n = a.length;
        if (k < 0 || k > n) {
            System.out.println("\nVi tri chon khong hop le !");
        } else {
            int[] b;
            b = new int[n + 1];
            for (i = 0; i < k; i++) {
                b[i] = a[i];
            }
            for (i = n; i > k; i--) {
                b[i] = a[i - 1];
                b[k] = x;
            }
            a = b;
        }
    }

    void xoa(int k) {
        int i = 0, n = a.length;
        if (k < 0 || k > n - 1) {
            System.out.println("\nVi tri chon khong hop le !");
        } else {
            int[] b;
            b = new int[a.length - 1];
            for (i = 0; i < k; i++) {
                b[i] = a[i];
            }
            for (i = k; i < a.length - 1; i++) {
                b[i] = a[i + 1];
            }
            a = b;
        }
    }

    void findmax() {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }
        System.out.println("Max array : " + max);
    }

    void findmax1() {
        int vt = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[vt] < a[i]) {
                vt = i;
            }
        }
        System.out.println("Max aryy: " + vt);
    }

    int demle() {
        int d = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                d++;
            }
        }
        return d;
    }
//    void daomang(){
//        int i =0 ,  j=a.length-1;
//        while(i<j){
//            int t = a[i];
//            a[i++]=a[j] ; a[j--] = t ;
//            
//        }
//    }

    int find_max() {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

        }
        return max;
    }

    void daomang() {
        int temp, n = a.length;

        for (int i = 0; i < n / 2; i++) {
            temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }

    void xoale() {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                k++;
            }
        }
        int[] b;
        b = new int[k];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                b[j++] = a[i];
            }

        }
        a = b;
    }

    boolean tkx(int x) {
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                return true;

            }
            break;
        }
        return false;
    }

    int dem(int x1, int x2) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] >= x1) && (a[i] <= x2)) {
                k++;
            }
        }
        return k;

    }

    void cap1() {
        int v1 = 0, v2 = 1;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] * a[j] > a[v1] * a[v2]) {
                    v1 = i;
                    v2 = j;
                }
            }

        }
        System.out.println("in ra 2 so tich lơn nhat  : " + a[v1] + " va " + a[v2]);
    }
 void cap2() {
    int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
    for (int i = 0; i < a.length; i++) {
        if (a[i] > max1) {
            max2 = max1;
            max1 = a[i];
        } else if (a[i] > max2) {
            max2 = a[i];
        }
    }
    System.out.println("Max (" + max1 + ", " + max2 + ")");
}


    void daomang(int ll, int rr) {
        int i = ll - 1, j = rr - 1;
        while (i < j) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }

    void xoay(int k) {
        for (int i = 1; i <= k; i++) {
            int x = a[0];
            xoa(1);
            chenx(x, a.length + 1);
        }
    }
void xoay1(int k ){
    daomang(0, k-1);
    daomang(k, a.length);
    daomang(0, a.length-1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Myarrlist m = new Myarrlist();
        m.nhap(10);
        m.in();
//        m.xoale();
//        m.in();

//    m.chenx(100, 5); m.in();
//    m.xoa(0); m.in();
//    m.findmax();
//      m.findmax1();
//      System.out.println("So le trong mang : "+m.demle());
//      m.daomang(); m.in();
//           int x= 10;
//        if(m.tkx(x)==true){
//            System.out.println("co");
//        }else{
//            System.out.println("khong co");
//        }
//        int y , z ;
//        System.out.println("Chon cho dem ");
//        y = s.nextInt();
//        z = s.nextInt();
//        System.out.println("Dem so trong mang : " +m.dem(y,z));
//        System.out.println("So lon nhat : " + m.find_max());
//        m.cap1();
//   m.xoay(10);
//   m.xoay1(10);
 m.cap2();
    }
}
