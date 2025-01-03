import java.util.Scanner;

public class Bai3_HPT1 {
    public static void main(String[] args) {
//        giải hpt x+y=a
//                 x-y=b
//        1. nhập a, b
//        2.
//          kiểm tra a==b => vô số nghiệm
//          kiểm tra a!=b => x,y
//        3.tìm x , y với công thức chia để trị
//        cộng 2 pt => x= (a+b)/2
//        trừ  2 pt => y = (a-b)/2
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập A : x+y=A : ");
        double a = Double.parseDouble(sc.nextLine());
        System.out.print("nhập B : x-y=B : ");
        double b = Double.parseDouble(sc.nextLine());
        if (a == b) {
            System.out.println("Hệ Phương Trình vô số nghiệm");
        } else {
            double x = (a + b) / 2;
            double y = (a - b) / 2;
            System.out.println("Nghiệm của hệ phương trình là :");
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }
}
