import java.util.Scanner;

public class Bai2_GPTB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập a = ");
        int a =Integer.parseInt(sc.nextLine());
        System.out.print("nhập b = ");
        int b =Integer.parseInt(sc.nextLine());
        System.out.print("nhập c = ");
        int c =Integer.parseInt(sc.nextLine());
        int delta =b*b - 4*a*c;
        if (delta >0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("phương trình có 2 nghiệm phân biệt x1 = "+x1 +"/n x2 = "+x2 );
        }else{
            double x = (double)-b/2*a ;
            System.out.print("phương trình có nghiệm kép x = " +x);
        }
    }
}
