import java.util.Scanner;

public class Bai1_PTB1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a : ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.print("nhap b : ");
        int b = Integer.parseInt(sc.nextLine());
        if (a == 0) {
            if (b == 0) {
                System.out.print("phương trình vô số nghiệm");
            } else {
                System.out.print("phương trình vô nghiệm");
            }
        } else {
            double x = (double) -b / a;
//
            System.out.print("nghiệm của phương trình là x = : " + x);
        }
    }
}
