import java.util.Scanner;

public class HPTB2 {
    // Giải hệ phương trình ax + by = c , tx - gy = z
    // Cách giải: cộng và trừ 2 phương trình
    // Công thức cộng 2 phương trình -> x = (c * g + z * b) / (a * g + b * t)
    // Công thức trừ 2 phương trình -> y = (a * z - c * t) / (a * g + b * t)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập các giá trị từ người dùng (kiểu double)
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập c: ");
        double c = sc.nextDouble();
        System.out.print("Nhập t: ");
        double t = sc.nextDouble();
        System.out.print("Nhập g: ");
        double g = sc.nextDouble();
        System.out.print("Nhập z: ");
        double z = sc.nextDouble();

        double m = a * g + b * t;

        if (m == 0) {
            System.out.println("Hệ phương trình không có nghiệm");
        } else {
            double x = (c * g + z * b) / m;
            double y = (a * z - c * t) / m;

            System.out.printf("Hệ phương trình có nghiệm x = %.2f, y = %.2f", x, y);
        }
    }
}
