package Buoi1;

public class Bai5 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            System.out.println("5 * " + i + " = " + (5*i));
        }
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if ( i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("tong cac so chan tu 1 den 100 la: " + sum);
    }
}
