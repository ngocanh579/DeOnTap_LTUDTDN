import java.util.Scanner;

public class TH_kiem_tra_so_nguyen_to {
    // dung vong lap for
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("nhap so can kiem tra: ");
    // int n = sc.nextInt();
    // if (n < 2) {
    // System.out.println(n + " khong phai la so nguyen to");
    // } else {
    // boolean check = true;
    // for (int i = 2; i < Math.sqrt(n); i++) {
    // if (n % i == 0) {
    // check = false;
    // break;
    // }
    // }
    // if (check) {
    // System.out.println(n + " la so nguyen to");
    // } else {
    // System.out.println(n + " khong phai la so nguyen to");
    // }
    // }

    // }
    // ==========================================================================================================
    // dung vong lap while
    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("nhap so can kiem tra: ");
    // int n = sc.nextInt();
    // if (n < 2) {
    // System.out.println(n + " khong phai la so nguyen to");
    // } else {
    // int i = 2;
    // boolean check = true;
    // while (i <= Math.sqrt(n)) {
    // if (n % i == 0) {
    // check = false;
    // break;
    // }
    // i++;
    // }
    // if (check) {
    // System.out.println(n + " la so nguyen to");
    // } else {
    // System.out.println(n + " khong phai la so nguyen to");
    // }
    // }
    // }
    // ==========================================================================================================
    // dung vong lap do while
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so can kiem tra: ");
        int n = sc.nextInt();
        if (n < 2) {
            System.out.println(n + " khong phai la so nguyen to");
        } else {
            int i = 2;
            boolean check = true;
            do {
                if (n % i == 0) {
                    check = false;
                    break;
                }
                i++;
            } while (i <= Math.sqrt(n));
            if (check) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }
    }
}
