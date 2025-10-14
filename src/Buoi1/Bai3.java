package Buoi1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so thu nhat: ");
        int theFirstNumber = sc.nextInt();
        System.out.println("Nhap so thu hai: ");
        int theSecondNumber = sc.nextInt();

        System.out.println("Tong hai so la: " + (theFirstNumber + theSecondNumber));
        System.out.println("Hieu hai so la: " + (theFirstNumber - theSecondNumber));
        System.out.println("Tich hai so la: " + (theFirstNumber * theSecondNumber));
        System.out.println("Thuong hai so la: " + (theFirstNumber / theSecondNumber));
        System.out.println("Phan chia hai so la: " + (theFirstNumber % theSecondNumber));
    }
}
