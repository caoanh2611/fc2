package cf2;

import java.util.*;

public class Chieu {

    static Scanner s = new Scanner(System.in);
    int[][] a;
    int n, m;

    void nhap() {
        System.out.print("Nhap so hang: ");
        n = s.nextInt();
        System.out.print("Nhap so cot: ");
        m = s.nextInt();
        a = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap a[" + i + "][" + j + "]: ");
                a[i][j] = s.nextInt();
            }
        }
    }

    void in() {
        System.out.println("Ma tran da nhap:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    void maxcot() {
        System.out.println("Gia tri lon nhat trong tung cot:");
        for (int i = 0; i < n; i++) {
            int max = a[0][i];
            for (int j = 1; j < m; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
            System.out.println("Cot " + i + ": " + max);
        }
    }

    void tbslcot() {
        System.out.println("Trung binh so le cua tung cot:");
        for (int j = 0; j < m; j++) {
            int d = 0, s = 0;
            for (int i = 0; i < n; i++) {
                if (a[i][j] % 2 != 0) {
                    s += a[i][j];
                    d++;
                }
            }
            if (d > 0) {
                System.out.println("Cot " + j + ": " + (double) s / d);
            } else {
                System.out.println("Cot " + j + ": Khong co so le");
            }
        }
    }

    void xoay_ngang() {
        for (int i = 0; i < n; i++) {
            int left = 0, right = m - 1;
            while (left < right) {
                int t = a[i][left];
                a[i][left] = a[i][right];
                a[i][right] = t;
                left++;
                right--;
            }
        }
    }

    void xoay_doc() {
        for (int j = 0; j < m; j++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int t = a[left][j];
                a[left][j] = a[right][j];
                a[right][j] = t;
                left++;
                right--;
            }
        }
    }

    void xoaydongho() {
        int[][] b;
        b = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[j][n - 1 - i] = a[i][j];
            }
        }
        a = b;
        int t = m;
        m = n;
        n = t;

    }

    void xoaydonghonguoc() {
        int[][] b;
        b = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[m - 1 - j][i] = a[i][j];
            }
        }
        a = b;
        int t = n;
        n = m;
        m = t;

    }

    void xoay90() {
        xoaydongho();
        xoay_doc();
        xoay_ngang();
    }

    public static void main(String[] args) {
        Chieu m = new Chieu();
        m.nhap();
        m.in();
//        m.maxcot();
//        m.tbslcot();
//        m.xoaydongho();
//        m.in();
//        m.xoay_doc();
//        m.in();
//        m.xoay_ngang();
//        m.in();
//        m.xoaydonghonguoc();
//        m.in();
        m.xoay90();
        m.in();
    }
}
