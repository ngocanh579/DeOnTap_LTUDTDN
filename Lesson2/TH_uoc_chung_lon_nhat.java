import java.util.Scanner;

public class TH_uoc_chung_lon_nhat {
    // public static void main(String[] args) {
    // // Công thức tính UCLN bằng thuật toán Euclid:
    // // có hai số nguyên a và b. Thuật toán Euclid sẽ thực hiện các bước sau:
    // // Bước 1: Nếu b = 0, thì UCLN(a, b) = a.
    // // Bước 2: Nếu b ≠ 0, tính UCLN(a, b) bằng UCLN(b, a % b) (tức là lấy b và
    // tìm a
    // // % b, sau đó lặp lại bước 1).
    // // Quá trình này sẽ dừng lại khi b = 0, và lúc đó a chính là UCLN của hai số
    // ban
    // // đầu.
    // // cach 1 dung while
    // Scanner sc = new Scanner(System.in);
    // System.out.print("nhap a: ");
    // int a = sc.nextInt();
    // System.out.print("nhap b: ");
    // int b = sc.nextInt();
    // while (b != 0) {
    // int temp = b;
    // b = a % b;
    // a = temp;
    // }
    // System.out.println("UCLN la: " + a);
    // }
    public static void main(String[] args) {
        // cach 2 dung for
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap a: ");
        int a = sc.nextInt();
        System.out.print("nhap b: ");
        int b = sc.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("khong co uoc chung lon nhat");
        }
        for (; a != b;) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN la: " + a);
    }
}
