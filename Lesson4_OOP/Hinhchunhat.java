import java.util.Scanner;

public class Hinhchunhat {

    private double dai, rong;

    public Hinhchunhat() {
    }

    public Hinhchunhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getDai() {
        return dai;
    }

    public void setDai(double dai) {
        this.dai = dai;
    }

    public double getRong() {
        return rong;
    }

    public void setRong(double rong) {
        this.rong = rong;
    }

    public double getArea() {
        return dai * rong;
    }

    public double getPerimeter() {
        return 2 * (dai + rong);
    }

    public void display() {
        System.out.println("Dai: " + dai + " Rong: " + rong);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chieu dai: ");
        double dai = sc.nextDouble();
        System.out.print("nhap chieu rong: ");
        double rong = sc.nextDouble();
        Hinhchunhat hcn = new Hinhchunhat(dai, rong);
        hcn.display();
        System.out.println("Area: " + hcn.getArea());
        System.out.println("Perimeter: " + hcn.getPerimeter());

    }
}
