public class User {
    private String name;
    private String email;

    // Constructor không tham số
    public User() {
    }

    // Constructor có tham số
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getInfo() { // thuoc loai getter method : tra ve gia tri
        return "User{name='" + name + "', email='" + email + "'}";
    }
}
