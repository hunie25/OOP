package Buoi1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] mangSo = new int[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Nhap phan tu thu " + (i+1) +" : ");
            mangSo[i] = sc.nextInt();
        }

        System.out.println("Mang so vua nhap la: ");
        for (int i = 0; i < 5; i++){
            System.out.print(mangSo[i] + " ");
        }

        int tong = 0;
        for (int i = 0; i < 5; i++) {
            tong += mangSo[i];
        }
        System.out.println(" \n Tong cac phan tu trong mang la: " + tong);

        int max = mangSo[0];
        for (int i = 0; i < 5; i++) {
            if (mangSo[i] > max){
                max = mangSo[i];
            }
        }
        System.out.println(" Phan tu lon nhat trong mang la: " + max);
    }
}
