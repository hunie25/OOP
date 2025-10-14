package Buoi1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ten: ");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        System.out.println("Nhap chieu cao: ");
        double high = sc.nextDouble();

        System.out.println("Xin chao " + name + ", ban " + age + " tuoi va cao " + high + " met.");

    }
}
