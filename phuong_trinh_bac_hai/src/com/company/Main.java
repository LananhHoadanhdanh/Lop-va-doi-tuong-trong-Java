package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phưpng trình vô nghiệm.");
                }
            } else {
                System.out.println("Phương trình có nghiệm là " + (-c/b));
            }
        } else {
            if (quadraticEquation.getDiscriminant() < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("Phương trình có một nghiệm là x = " + quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình có hai nghiệm: " );
                System.out.println("x1 = " + quadraticEquation.getRoot1());
                System.out.println("x2 = " + quadraticEquation.getRoot2());
            }
        }
    }
}
