public class SinhVien {
    private String ten;
    private int tuoi;
    private String diachi;
    private String email;
    
    public SinhVien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public SinhVien(String ten, int tuoi, String diachi, String email) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.email = email;
    }
  
    
}
