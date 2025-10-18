package Buoi2;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap a[" + i+1 + "] = ");
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }

        int demChan = 0;
        int demLe = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                demChan ++;
            }
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                demLe ++;
            }
        }

        System.out.println("So phan tu chan trong mang la: " + demChan);
        System.out.println("So phan tu le trong mang la: " + demLe);
    }
}
