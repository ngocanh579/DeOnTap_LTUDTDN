import java.util.Scanner;

public class TH_ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vnd = 23000;
        System.out.print("nhap tien usd : ");
        double usd = scanner.nextDouble();
        double tien_vnd = usd * vnd;
        System.out.println(tien_vnd);
    }
}
