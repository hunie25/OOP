package Buoi1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luon sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] gpas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin cua hoc sinh thu " + i+1  + " :");
            System.out.print("Nhap ten: ");
            names[i] = sc.nextLine();
            System.out.print("Nhap tuoi: ");
            ages[i] = sc.nextInt();
            System.out.print("Nhap GPA: ");
            gpas[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.println("=======DANH SACH HOC SINH VUA NHAP=======");
        System.out.printf("%-5s %-20s %-10s %-10s%n", "STT", "Ten", "Tuoi", "GPA");
        for (int i= 0; i < n; i++) {
            System.out.printf("%-5d %-20s %-10d %-10.2f%n", i + 1, names[i], ages[i], gpas[i]);
        }

        double diemTB;
        double tongGPA = 0;
        for (int i = 0; i < n; i++) {
            tongGPA += gpas[i];
        }
        System.out.println("Diem trung binh cua ca lop la: " + (tongGPA/n));

        double maxGPA = gpas[0];
        int indexMax = 0;
        for (int i = 0; i < n; i++) {
            if (gpas[i] > maxGPA) {
                maxGPA = gpas[i];
                indexMax = i;
            }
        }
        System.out.println("Sinh vien co diem cao nhat la: " + names[indexMax] + " (GPA = " + gpas[indexMax]);
    }
}
