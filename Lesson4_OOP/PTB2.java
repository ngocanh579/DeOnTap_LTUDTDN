import java.util.Scanner;

public class PTB2 {
    private double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public PTB2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a :");
        double a = sc.nextDouble();
        System.out.print("nhap b : ");
        double b = sc.nextDouble();
        System.out.print("nhap c : ");
        double c = sc.nextDouble();
        PTB2 ptb2 = new PTB2(a, b, c);
        double delta = ptb2.getDiscriminant();
        double x1 = ptb2.getRoot1();
        double x2 = ptb2.getRoot2();
        if (a < 0) {
            System.out.println("day khong phai phuong trinh bac 2");
        }
        if (delta > 0) {
            System.out.println("delta: " + delta);
            System.out.println("pt co 2 nghiem phan biet la :");
            System.out.printf("x1 = %.2f\n", x1);
            System.out.printf("x2 = %.2f", x2);
        } else if (delta == 0) {
            double x = -b / 2 * a;
            System.out.println("delta: " + delta);
            System.out.print("pt co 1 nghiem kep la x = %.2f" + x);
        } else {
            System.out.println("delta: " + delta);
            System.out.print("pt vo nghiem");
        }
    }
}
